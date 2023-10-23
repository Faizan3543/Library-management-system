package in.pwskills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.pwskills.model.Book;
import in.pwskills.service.iBookService;
@Controller
public class LibraryController {

	@Autowired
	public iBookService service;
	
	@GetMapping("/")
	public String ShowPage() {
		return "redirect:new-book";  // here we can also dicretly write tha name of the jsp page without using redirect
	}
	
	@GetMapping("/disp")
	public String showAllBooks(Model model) {
		model.addAttribute("books", service.FindAllBook());
		return "books";
	}
	@GetMapping("/new-book")
	public String ShowBookCreationForm(Model model) {  //this is done in order to establish two way binding
		model.addAttribute("book", new Book());
		return "new-book";
	}
	
	@PostMapping("/add")
	public String addNewBook(@ModelAttribute Book book,Model model) {
		System.out.println(book);  //the book object willbe created in new-book.jsp and  is passed using the object book throught two way binding 
		service.AddBook(book);
		model.addAttribute("books", service.FindAllBook());
		return "books";
	}
	@PostMapping("/{id}/delete")
	public String DeleteBookByID(@PathVariable Integer id,Model model) {  //pathvariable is written in order to bind the given id with that of given id in the constructor
		service.FindBookById(id).orElseThrow(()-> new IllegalArgumentException("Invalid book id : "+id));
		service.DeleteBookByid(id);
		model.addAttribute("books",service.FindAllBook());
		return "books";
	}
	
	@GetMapping("/{id}")  //this request is called by books.jsp and it will execute and call edit.jsp
	public String showBookById(@PathVariable Integer id, Model model) {
		Book book = service.FindBookById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Book id :: " +id));
		model.addAttribute("book", book);
		return "edit-book";
	}
	
	@PostMapping("/{id}/update")//this will be called by edit.jsp and will finally execute and display the list by calling books.jsp
	public String UpdateBook(@PathVariable Integer id, Model model, @ModelAttribute Book book) {  //here we r writting @modelattribute because the page is sending book 
		service.FindBookById(id).orElseThrow(()-> new IllegalArgumentException("Invalid book id :: " +id));
		service.AddBook(book);
		model.addAttribute("books",service.FindAllBook());
		return "books";
	}
}

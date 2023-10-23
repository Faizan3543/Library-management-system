package in.pwskills.service;

import java.util.List;
import java.util.Optional;

import in.pwskills.model.Book;

public interface iBookService {

	public List<Book> FindAllBook();
	public Book AddBook(Book book);
	public void DeleteBookByid(Integer Id);
	public Optional<Book> FindBookById(Integer Id);
	
}

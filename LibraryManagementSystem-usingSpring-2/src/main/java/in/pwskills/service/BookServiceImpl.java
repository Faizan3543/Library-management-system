package in.pwskills.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.dao.iBookRepository;
import in.pwskills.model.Book;

@Service
public class BookServiceImpl implements iBookService {

	@Autowired
	public iBookRepository repo;
	
	@Override
	public List<Book> FindAllBook() {
		
		return StreamSupport.stream(
				repo.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public Book AddBook(Book book) {
		return repo.save(book);
	}

	@Override
	public void DeleteBookByid(Integer Id) {
		repo.deleteById(Id);
		
	}

	@Override
	public Optional<Book> FindBookById(Integer Id) {
		Optional<Book> book = repo.findById(Id);
		return book;
	}

}

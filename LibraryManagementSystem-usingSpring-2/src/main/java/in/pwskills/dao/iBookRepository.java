package in.pwskills.dao;

import org.springframework.data.repository.CrudRepository;

import in.pwskills.model.Book;

public interface iBookRepository extends CrudRepository<Book , Integer> {

}

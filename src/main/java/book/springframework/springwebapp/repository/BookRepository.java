package book.springframework.springwebapp.repository;

import book.springframework.springwebapp.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

package book.springframework.springwebapp.repository;

import book.springframework.springwebapp.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

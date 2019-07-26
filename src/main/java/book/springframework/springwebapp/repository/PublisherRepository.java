package book.springframework.springwebapp.repository;

import book.springframework.springwebapp.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

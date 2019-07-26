package book.springframework.springwebapp.BootStrap;

import book.springframework.springwebapp.entity.Book;
import book.springframework.springwebapp.repository.PublisherRepository;
import book.springframework.springwebapp.entity.Author;
import book.springframework.springwebapp.entity.Publisher;
import book.springframework.springwebapp.repository.AuthorRepository;
import book.springframework.springwebapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
@Autowired
private PublisherRepository publisherRepository;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData(){
        Publisher publisher=new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);
        //eric
        Author eric= new Author("Eric","Evans");
        Book ddd=new Book("Domain Design driver","1234",publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
       //rod
        Author rod=new Author("Rod","Hoppin");
        Book newbb=new Book("Muna Maden","2344",publisher);
        rod.getBooks().add(newbb);
        authorRepository.save(rod);
        bookRepository.save(newbb);

    }
}

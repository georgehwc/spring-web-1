package first.spring.springweb.repositories;

import first.spring.springweb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

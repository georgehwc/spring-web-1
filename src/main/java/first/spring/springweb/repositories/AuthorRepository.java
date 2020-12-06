package first.spring.springweb.repositories;

import first.spring.springweb.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author,Long> {
}


package us.stallings.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import us.stallings.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

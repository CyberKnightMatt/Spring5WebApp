package us.stallings.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import us.stallings.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

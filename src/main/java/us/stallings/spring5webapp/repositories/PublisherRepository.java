package us.stallings.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import us.stallings.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

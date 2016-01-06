package pl.familybook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.familybook.models.Message;

@RepositoryRestResource
public interface MessageRepository extends JpaRepository<Message, Long> {

}

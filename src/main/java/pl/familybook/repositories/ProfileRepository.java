package pl.familybook.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.familybook.models.Profile;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	public Profile findByEmail(@Param("email") String email);

	@Query("select p from Profile p")
	public List<Profile> findByCustomQuery();

}

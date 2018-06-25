package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "match", path = "match")
public interface MatchRepository extends MongoRepository<Match, String> {

	List<Match> findByFirstTeam(@Param("firstTeam") String firstTeam);
	// List<Match> findByLastName(@Param("name") String name);

    // List<Match> matches = MatchRepository.findByLastname("Matthews");
   // List<Person> findByLastname();

}
/*
public interface MatchRepository extends MongoRepository<Person, String> {

	List<Person> findByLastName(@Param("name") String name);

}
*/

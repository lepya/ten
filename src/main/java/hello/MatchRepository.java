package hello;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "match", path = "match")
public interface MatchRepository extends MongoRepository<Match, String> {

	List<Match> findByFirstTeam(@Param("firstTeam") String firstTeam);
	Optional<Match> findById(String id);

}
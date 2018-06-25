package hello;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MatchController {


    @Autowired
    private MatchRepository matchRepo;


    @RequestMapping(method=RequestMethod.GET)
      public List<Match> getAll() {

        return matchRepo.findAll();
      }
      
      @RequestMapping(method=RequestMethod.POST)
      public Match create(@RequestBody Match match) {

        return matchRepo.save(match);
      }

      @RequestMapping(method=RequestMethod.DELETE, value="{id}")
      public void delete(@PathVariable String id) {

        Optional<Match> m = matchRepo.findById(id);
        if (m.isPresent()){
            matchRepo.delete(m.get());
        }
        else{
        }

      }
      @RequestMapping(method=RequestMethod.PUT, value="{id}")
          public Match update(@PathVariable String id, @RequestBody Match match) {

            Optional<Match> m = matchRepo.findById(id);

            if (m.isPresent()){

                Match update = m.get();

                update.setFirstTeam(match.getFirstTeam());
                update.setSecondTeam(match.getSecondTeam());

                update.setFirstTeamScore(match.getFirstTeamScore());
                update.setSecondTeamScore(match.getSecondTeamScore());

                return matchRepo.save(update);

            }
            else{
            }

            return null;

      }

}

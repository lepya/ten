package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstTeam;
    private String secondTeam;
    private Long firstTeamScore;
    private Long secondTeamScore;

    protected Match() {}

    public Match(String firstTeam, String secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    @Override
    public String toString() {
        return String.format(
                "Match[id=%d, firstTeam='%s', secondTeam='%s']",
                id, firstTeam, secondTeam);
    }

}

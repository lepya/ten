package hello;

import org.springframework.data.annotation.Id;

public class Match {
    
    @Id
    private Long id;
    private String firstTeam;
    private String secondTeam;
    private Short firstTeamScore;
    private Short secondTeamScore;

    protected Match() {}

    public Match(String firstTeam, String secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }


    public void setFirstName(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

}

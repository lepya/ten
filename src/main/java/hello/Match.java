package hello;

import org.springframework.data.annotation.Id;

public class Match {
    
    @Id
    private String id;
    private String firstTeam;
    private String secondTeam;
    private Integer firstTeamScore;
    private Integer secondTeamScore;

    protected Match() {}

    public Match(String id, String firstTeam, String secondTeam, Integer firstTeamScore, Integer secondTeamScore) {
        this.id = id;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Teams

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    // Scores

    public void setFirstTeamScore(Integer firstTeamScore) {
        this.firstTeamScore = firstTeamScore;
    }

    public Integer getFirstTeamScore() {
        return firstTeamScore;
    }

    public void setSecondTeamScore(Integer secondTeamScore) {
        this.secondTeamScore = secondTeamScore;
    }

    public Integer getSecondTeamScore() {
        return secondTeamScore;
    }


}

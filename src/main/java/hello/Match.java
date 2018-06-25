package hello;

import org.springframework.data.annotation.Id;

public class Match {
    
    @Id
    private String id;
    private String firstTeam;
    private String secondTeam;
    private String firstTeamScore;
    private String secondTeamScore;

    protected Match() {}

    public Match(String firstTeam, String secondTeam, String firstTeamScore, String secondTeamScore) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
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

    public void setFirstTeamScore(String firstTeamScore) {
        this.firstTeamScore = firstTeamScore;
    }

    public String getFirstTeamScore() {
        return firstTeamScore;
    }

    public void setSecondTeamScore(String secondTeamScore) {
        this.secondTeamScore = secondTeamScore;
    }

    public String getSecondTeamScore() {
        return secondTeamScore;
    }


}

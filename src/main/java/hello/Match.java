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

    public Match(String firstTeam, String secondTeam, Short firstTeamScore, Short secondTeamScore) {
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

    public void setFirstTeamScore(Short firstTeamScore) {
        this.firstTeamScore = firstTeamScore;
    }

    public Short getFirstTeamScore() {
        return firstTeamScore;
    }

    public void setSecondTeamScore(Short secondTeamScore) {
        this.secondTeamScore = secondTeamScore;
    }

    public Short getSecondTeamScore() {
        return secondTeamScore;
    }


}

package jriot.objects;

public class TeamStatDetail {

    private int averageGamesPlayed;
    private String fullId;
    private int losses;
    private String teamStatType;
    private int wins;

    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public void setAverageGamesPlayed(int averageGamesPlayed) {
        this.averageGamesPlayed = averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public void setTeamStatType(String teamStatType) {
        this.teamStatType = teamStatType;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    @Override
    public String toString() {
        return "TeamStatDetail [averageGamesPlayed=" + averageGamesPlayed
                + ", fullId=" + fullId + ", losses=" + losses
                + ", teamStatType=" + teamStatType + ", wins=" + wins + "]";
    }

}

package jriot.objects;

public class LeagueEntry {

    private String division;
    private boolean isFreshBlood;
    private boolean isHotStreak;
    private boolean isInactive;
    private boolean isVeteran;
    private int leaguePoints;
    private MiniSeries miniSeries;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private int wins;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public boolean isIsFreshBlood() {
        return isFreshBlood;
    }

    public void setIsFreshBlood(boolean isFreshBlood) {
        this.isFreshBlood = isFreshBlood;
    }

    public boolean isIsInactive() {
        return isInactive;
    }

    public void setIsInactive(boolean isInactive) {
        this.isInactive = isInactive;
    }

    public boolean isIsVeteran() {
        return isVeteran;
    }

    public void setIsVeteran(boolean isVeteran) {
        this.isVeteran = isVeteran;
    }

    public boolean isFreshBlood() {
        return isFreshBlood;
    }

    public void setFreshBlood(boolean isFreshBlood) {
        this.isFreshBlood = isFreshBlood;
    }

    public boolean isHotStreak() {
        return isHotStreak;
    }

    public void setHotStreak(boolean isHotStreak) {
        this.isHotStreak = isHotStreak;
    }

    public boolean isInactive() {
        return isInactive;
    }

    public void setInactive(boolean isInactive) {
        this.isInactive = isInactive;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean isVeteran) {
        this.isVeteran = isVeteran;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeries miniSeries) {
        this.miniSeries = miniSeries;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "LeagueItem{" + "division=" + division + ", isFreshBlood=" + isFreshBlood + ", isHotStreak=" + isHotStreak + ", isInactive=" + isInactive + ", isVeteran=" + isVeteran + ", leaguePoints=" + leaguePoints + ", miniSeries=" + miniSeries + ", playerOrTeamId=" + playerOrTeamId + ", playerOrTeamName=" + playerOrTeamName + ", wins=" + wins + '}';
    }

}

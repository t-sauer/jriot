package jriot.objects;

public class TeamStatDetail {
	
	private int averageGamesPlayed;
	private int losses;
	private int maxRating;
	private int rating;
	private int seedRating;
	private TeamId teamId;
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
	public int getMaxRating() {
		return maxRating;
	}
	public void setMaxRating(int maxRating) {
		this.maxRating = maxRating;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSeedRating() {
		return seedRating;
	}
	public void setSeedRating(int seedRating) {
		this.seedRating = seedRating;
	}
	public TeamId getTeamId() {
		return teamId;
	}
	public void setTeamId(TeamId teamId) {
		this.teamId = teamId;
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
	@Override
	public String toString() {
		return "TeamStatDetail [averageGamesPlayed=" + averageGamesPlayed
				+ ", losses=" + losses + ", maxRating=" + maxRating
				+ ", rating=" + rating + ", seedRating=" + seedRating
				+ ", teamId=" + teamId + ", teamStatType=" + teamStatType
				+ ", wins=" + wins + "]";
	}
	
	

}

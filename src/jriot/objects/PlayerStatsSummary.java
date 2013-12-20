package jriot.objects;

public class PlayerStatsSummary {
	
	private AggregatedStats aggregatedStats;
	private int losses;
	private long modifyDate;
	private long modifyDateStr;
	private String playerStatSummaryType;
	private int wins;
	
	public AggregatedStats getAggregatedStats() {
		return aggregatedStats;
	}
	public void setAggregatedStats(AggregatedStats aggregatedStats) {
		this.aggregatedStats = aggregatedStats;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public long getModifyDateStr() {
		return modifyDateStr;
	}
	public void setModifyDateStr(long modifyDateStr) {
		this.modifyDateStr = modifyDateStr;
	}
	public String getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}
	public void setPlayerStatSummaryType(String playerStatSummaryType) {
		this.playerStatSummaryType = playerStatSummaryType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	@Override
	public String toString() {
		return "PlayerStatsSummary [aggregatedStats=" + aggregatedStats
				+ ", losses=" + losses + ", modifyDate=" + modifyDate
				+ ", modifyDateStr=" + modifyDateStr
				+ ", playerStatSummaryType=" + playerStatSummaryType
				+ ", wins=" + wins + "]";
	}

}

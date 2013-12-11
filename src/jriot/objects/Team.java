package jriot.objects;

import java.util.ArrayList;
import java.util.Date;

public class Team {
	
	private Date createDate;
	private Date lastGameDate;
	private Date lastJoinDate;
	private Date lastJoinedRankedTeamQueueDate;
	private ArrayList<MatchHistorySummary> matchHistory;
	private MessageOfDay messageOfDay;
	private Date modifyDate;
	private String name;
	private Roster roster;
	private Date secondLastJoinDate;
	private String status;
	private String tag;
	private TeamId teamId;
	private TeamStatSummary teamStatSummary;
	private Date thirdLastJoinDate;
	private long timestamp;
	
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastGameDate() {
		return lastGameDate;
	}
	public void setLastGameDate(Date lastGameDate) {
		this.lastGameDate = lastGameDate;
	}
	public Date getLastJoinDate() {
		return lastJoinDate;
	}
	public void setLastJoinDate(Date lastJoinDate) {
		this.lastJoinDate = lastJoinDate;
	}
	public Date getLastJoinedRankedTeamQueueDate() {
		return lastJoinedRankedTeamQueueDate;
	}
	public void setLastJoinedRankedTeamQueueDate(Date lastJoinedRankedTeamQueueDate) {
		this.lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate;
	}
	public ArrayList<MatchHistorySummary> getMatchHistory() {
		return matchHistory;
	}
	public void setMatchHistory(ArrayList<MatchHistorySummary> matchHistory) {
		this.matchHistory = matchHistory;
	}
	public MessageOfDay getMessageOfDay() {
		return messageOfDay;
	}
	public void setMessageOfDay(MessageOfDay messageOfDay) {
		this.messageOfDay = messageOfDay;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roster getRoster() {
		return roster;
	}
	public void setRoster(Roster roster) {
		this.roster = roster;
	}
	public Date getSecondLastJoinDate() {
		return secondLastJoinDate;
	}
	public void setSecondLastJoinDate(Date secondLastJoinDate) {
		this.secondLastJoinDate = secondLastJoinDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public TeamId getTeamId() {
		return teamId;
	}
	public void setTeamId(TeamId teamId) {
		this.teamId = teamId;
	}
	public TeamStatSummary getTeamStatSummary() {
		return teamStatSummary;
	}
	public void setTeamStatSummary(TeamStatSummary teamStatSummary) {
		this.teamStatSummary = teamStatSummary;
	}
	public Date getThirdLastJoinDate() {
		return thirdLastJoinDate;
	}
	public void setThirdLastJoinDate(Date thirdLastJoinDate) {
		this.thirdLastJoinDate = thirdLastJoinDate;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Team [createDate=" + createDate + ", lastGameDate="
				+ lastGameDate + ", lastJoinDate=" + lastJoinDate
				+ ", lastJoinedRankedTeamQueueDate="
				+ lastJoinedRankedTeamQueueDate + ", matchHistory="
				+ matchHistory + ", messageOfDay=" + messageOfDay
				+ ", modifyDate=" + modifyDate + ", name=" + name + ", roster="
				+ roster + ", secondLastJoinDate=" + secondLastJoinDate
				+ ", status=" + status + ", tag=" + tag + ", teamId=" + teamId
				+ ", teamStatSummary=" + teamStatSummary
				+ ", thirdLastJoinDate=" + thirdLastJoinDate + ", timestamp="
				+ timestamp + "]";
	}
	
	

}

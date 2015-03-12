package jriot.objects;

//For Match Version 2.2

import java.util.List;

public class MatchDetail {
	private int mapId;
	private long matchCreation;
	private long matchDuration;
	private long matchId;
	private String matchMode;
	private String matchVersion;
	private String queueType;
	private String region;
	private List<ParticipantIdentity> participantIdentities;
	private List<Participant> participants;
	private List<Team> teams;
	
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public long getMatchCreation() {
		return matchCreation;
	}
	public void setMatchCreation(long matchCreation) {
		this.matchCreation = matchCreation;
	}
	public long getMatchDuration() {
		return matchDuration;
	}
	public void setMatchDuration(long matchDuration) {
		this.matchDuration = matchDuration;
	}
	public long getMatchId() {
		return matchId;
	}
	public void setMatchId(long matchId) {
		this.matchId = matchId;
	}
	public String getMatchMode() {
		return matchMode;
	}
	public void setMatchMode(String matchMode) {
		this.matchMode = matchMode;
	}
	public String getMatchVersion() {
		return matchVersion;
	}
	public void setMatchVersion(String matchVersion) {
		this.matchVersion = matchVersion;
	}
	public String getQueueType() {
		return queueType;
	}
	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}
	public void setParticipantIdentities(
			List<ParticipantIdentity> participantIdentities) {
		this.participantIdentities = participantIdentities;
	}
	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
}
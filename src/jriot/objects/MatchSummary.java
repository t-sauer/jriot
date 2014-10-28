package jriot.objects;

import java.util.List;

//updated for MatchHistory Version 2.2
public class MatchSummary {
	private int mapId;
	private long matchCreation;
	private long matchDuration;
	private long matchId;
	private String matchMode;
	private String matchType;
	private String matchVersion;
	private String queueType;
	private String region;
	private String season;
	private List<ParticipantIdentity> participantIdentities;
	private List<Participant> participants;
	
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
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
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
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
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
	
	
}

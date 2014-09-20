package jriot.objects;

import java.util.List;

public class MatchSummary {
    private long mapId;
    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String queueType;
    private String region;
    private String season;

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
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

    public String getMatchVersion() {
        return matchVersion;
    }

    public void setMatchVersion(String matchVersion) {
        this.matchVersion = matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
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
}

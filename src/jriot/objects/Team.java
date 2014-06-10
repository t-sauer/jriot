package jriot.objects;

import java.util.ArrayList;

public class Team {

    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private ArrayList<MatchHistorySummary> matchHistory;
    private MessageOfDay messageOfDay;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private TeamStatSummary teamStatSummary;
    private long thirdLastJoinDate;

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getLastGameDate() {
        return lastGameDate;
    }

    public void setLastGameDate(long lastGameDate) {
        this.lastGameDate = lastGameDate;
    }

    public long getLastJoinDate() {
        return lastJoinDate;
    }

    public void setLastJoinDate(long lastJoinDate) {
        this.lastJoinDate = lastJoinDate;
    }

    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public void setLastJoinedRankedTeamQueueDate(long lastJoinedRankedTeamQueueDate) {
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

    public long getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(long modifyDate) {
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

    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public void setSecondLastJoinDate(long secondLastJoinDate) {
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

    public TeamStatSummary getTeamStatSummary() {
        return teamStatSummary;
    }

    public void setTeamStatSummary(TeamStatSummary teamStatSummary) {
        this.teamStatSummary = teamStatSummary;
    }

    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }

    public void setThirdLastJoinDate(long thirdLastJoinDate) {
        this.thirdLastJoinDate = thirdLastJoinDate;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    @Override
    public String toString() {
        return "Team [createDate=" + createDate + ", fullId=" + fullId
                + ", lastGameDate=" + lastGameDate + ", lastJoinDate="
                + lastJoinDate + ", lastJoinedRankedTeamQueueDate="
                + lastJoinedRankedTeamQueueDate + ", matchHistory="
                + matchHistory + ", messageOfDay=" + messageOfDay
                + ", modifyDate=" + modifyDate + ", name=" + name + ", roster="
                + roster + ", secondLastJoinDate=" + secondLastJoinDate
                + ", status=" + status + ", tag=" + tag + ", teamStatSummary="
                + teamStatSummary + ", thirdLastJoinDate=" + thirdLastJoinDate
                + "]";
    }

}

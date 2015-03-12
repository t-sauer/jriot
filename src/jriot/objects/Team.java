package jriot.objects;
//Updated for Match Version 2.2

import java.util.ArrayList;
import java.util.List;

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
    
    private int baronKills;
    private int dragonKills;
    private int inhbitorKills;
    private int teamId;
    private int towerKills;
    private int vilemawKills;
    private long dominionVictoryScore;
    private boolean firstBaron;
    private boolean firstDragon;
    private boolean firstInhibitor;
    private boolean firstTower;
    private boolean winner;
    private List<BannedChampion> bans;

    
    public int getBaronKills() {
		return baronKills;
	}

	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}

	public int getInhbitorKills() {
		return inhbitorKills;
	}

	public void setInhbitorKills(int inhbitorKills) {
		this.inhbitorKills = inhbitorKills;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}

	public int getVilemawKills() {
		return vilemawKills;
	}

	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}

	public long getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	public void setDominionVictoryScore(long dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public List<BannedChampion> getBans() {
		return bans;
	}

	public void setBans(List<BannedChampion> bans) {
		this.bans = bans;
	}

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

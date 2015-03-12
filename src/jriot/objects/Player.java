package jriot.objects;

//Updated for Match Version 2.2
public class Player {

    private int championId;
    private long summonerId;
    private int teamId;
    private int profileIcon;
    private String summonerName;
    private String matchHistoryUri;


    public int getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(int profileIcon) {
		this.profileIcon = profileIcon;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getMatchHistoryUri() {
		return matchHistoryUri;
	}

	public void setMatchHistoryUri(String matchHistoryUri) {
		this.matchHistoryUri = matchHistoryUri;
	}

	public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player [championId=" + championId + ", summonerId="
                + summonerId + ", teamId=" + teamId + "]";
    }
}

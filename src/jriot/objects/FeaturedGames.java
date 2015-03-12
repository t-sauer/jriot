package jriot.objects;

import java.util.List;

public class FeaturedGames {
	private long clientRefreshInterval;
	private List<CurrentGameInfo> gameList;
	
	public long getClientRefreshInterval() {
		return clientRefreshInterval;
	}
	public void setClientRefreshInterval(long clientRefreshInterval) {
		this.clientRefreshInterval = clientRefreshInterval;
	}
	public List<CurrentGameInfo> getGameList() {
		return gameList;
	}
	public void setGameList(List<CurrentGameInfo> gameList) {
		this.gameList = gameList;
	}
	
	
}

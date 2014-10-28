package jriot.objects;

import java.util.List;

//updated for MatchHistory Version 2.2
public class PlayerHistory {
	private List<MatchSummary> matches;

	public List<MatchSummary> getMatches() {
		return matches;
	}

	public void setMatches(List<MatchSummary> matches) {
		this.matches = matches;
	}
	
	
}

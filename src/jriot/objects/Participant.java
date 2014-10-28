package jriot.objects;

import java.util.List;

//Updated For Match Version 2.2

public class Participant {
	private int championId;
	private int participantId;
	private int spell1Id;
	private int spell2Id;
	private int teamId;
	private List<Mastery> masteries;
	private List<Rune> runes;
	private ParticipantStats stats;
	private ParticipantTimeline timeline;
	
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public int getSpell1Id() {
		return spell1Id;
	}
	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}
	public int getSpell2Id() {
		return spell2Id;
	}
	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public List<Mastery> getMasteries() {
		return masteries;
	}
	public void setMasteries(List<Mastery> masteries) {
		this.masteries = masteries;
	}
	public List<Rune> getRunes() {
		return runes;
	}
	public void setRunes(List<Rune> runes) {
		this.runes = runes;
	}
	public ParticipantStats getStats() {
		return stats;
	}
	public void setStats(ParticipantStats stats) {
		this.stats = stats;
	}
	public ParticipantTimeline getTimeline() {
		return timeline;
	}
	public void setTimeline(ParticipantTimeline timeline) {
		this.timeline = timeline;
	}
	
	
}

package jriot.objects;

//Updated for Match Version 2.2
public class ParticipantFrame {
	private int currentGold;
	private int jungleMinionsKilled;
	private int level;
	private int minionsKilled;
	private int participantId;
	private int totalGold;
	private int xp;
	private Position position;
	
	public int getCurrentGold() {
		return currentGold;
	}
	public void setCurrentGold(int currentGold) {
		this.currentGold = currentGold;
	}
	public int getJungleMinionsKilled() {
		return jungleMinionsKilled;
	}
	public void setJungleMinionsKilled(int jungleMinionsKilled) {
		this.jungleMinionsKilled = jungleMinionsKilled;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMinionsKilled() {
		return minionsKilled;
	}
	public void setMinionsKilled(int minionsKilled) {
		this.minionsKilled = minionsKilled;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public int getTotalGold() {
		return totalGold;
	}
	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}

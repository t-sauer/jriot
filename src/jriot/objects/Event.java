package jriot.objects;

import java.util.List;

//Updated for Match Version 2.2
public class Event {
	private String ascendedType;
	private String buildingType;
	private String eventType;
	private String laneType;
	private String levelUpType;
	private String monsterType;
	private String pointCaptured;
	private String towerType;
	private String wardType;
	private int creatorId;
	private int itemAfter;
	private int itemBefore;
	private int itemId;
	private int killerId;
	private int participantId;
	private int skillSlot;
	private int teamId;
	private int victimId;
	private long timestamp;
	private List<Integer>  assistingParticipantId;
	private Position postition;
	
	public String getAscendedType() {
		return ascendedType;
	}
	public void setAscendedType(String ascendedType) {
		this.ascendedType = ascendedType;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getLaneType() {
		return laneType;
	}
	public void setLaneType(String laneType) {
		this.laneType = laneType;
	}
	public String getLevelUpType() {
		return levelUpType;
	}
	public void setLevelUpType(String levelUpType) {
		this.levelUpType = levelUpType;
	}
	public String getMonsterType() {
		return monsterType;
	}
	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}
	public String getPointCaptured() {
		return pointCaptured;
	}
	public void setPointCaptured(String pointCaptured) {
		this.pointCaptured = pointCaptured;
	}
	public String getTowerType() {
		return towerType;
	}
	public void setTowerType(String towerType) {
		this.towerType = towerType;
	}
	public String getWardType() {
		return wardType;
	}
	public void setWardType(String wardType) {
		this.wardType = wardType;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public int getItemAfter() {
		return itemAfter;
	}
	public void setItemAfter(int itemAfter) {
		this.itemAfter = itemAfter;
	}
	public int getItemBefore() {
		return itemBefore;
	}
	public void setItemBefore(int itemBefore) {
		this.itemBefore = itemBefore;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getKillerId() {
		return killerId;
	}
	public void setKillerId(int killerId) {
		this.killerId = killerId;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public int getSkillSlot() {
		return skillSlot;
	}
	public void setSkillSlot(int skillSlot) {
		this.skillSlot = skillSlot;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getVictimId() {
		return victimId;
	}
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public List<Integer> getAssistingParticipantId() {
		return assistingParticipantId;
	}
	public void setAssistingParticipantId(List<Integer> assistingParticipantId) {
		this.assistingParticipantId = assistingParticipantId;
	}
	public Position getPostition() {
		return postition;
	}
	public void setPostition(Position postition) {
		this.postition = postition;
	}
	
	
}

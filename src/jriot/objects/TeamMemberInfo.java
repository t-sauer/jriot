package jriot.objects;

import java.util.Date;

public class TeamMemberInfo {
	
	private Date inviteDate;
	private Date joinDate;
	private long playerId;
	private String status;
	
	
	public Date getInviteDate() {
		return inviteDate;
	}
	public void setInviteDate(Date inviteDate) {
		this.inviteDate = inviteDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TeamMemberInfo [inviteDate=" + inviteDate + ", joinDate="
				+ joinDate + ", playerId=" + playerId + ", status=" + status
				+ "]";
	}

}

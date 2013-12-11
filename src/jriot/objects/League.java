package jriot.objects;

import java.util.ArrayList;

public class League {
	
	private ArrayList<LeagueItem> entries;
	private String name;
	private String queue;
	private String tier;
	private long timestamp;
	
	@Override
	public String toString() {
		return "League [entries=" + entries + ", name=" + name + ", queue="
				+ queue + ", tier=" + tier + ", timestamp=" + timestamp + "]";
	}
	public ArrayList<LeagueItem> getEntries() {
		return entries;
	}
	public void setEntries(ArrayList<LeagueItem> entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}

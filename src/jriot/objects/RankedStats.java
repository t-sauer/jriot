package jriot.objects;

import java.util.ArrayList;

public class RankedStats {
	
	private ArrayList<ChampionStats> champions;
	private long modifyDate;
	private long modifyDateStr;
	private long summonerId;
	
	public ArrayList<ChampionStats> getChampions() {
		return champions;
	}
	public void setChampions(ArrayList<ChampionStats> champions) {
		this.champions = champions;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public long getModifyDateStr() {
		return modifyDateStr;
	}
	public void setModifyDateStr(long modifyDateStr) {
		this.modifyDateStr = modifyDateStr;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	@Override
	public String toString() {
		return "RankedStats [champions=" + champions + ", modifyDate="
				+ modifyDate + ", modifyDateStr=" + modifyDateStr
				+ ", summonerId=" + summonerId + "]";
	}
	
	

}

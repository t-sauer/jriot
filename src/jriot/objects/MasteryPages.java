package jriot.objects;

import java.util.ArrayList;

public class MasteryPages {
	
	private ArrayList<MasteryPage> pages;
	private long summonerId;
	
	
	public ArrayList<MasteryPage> getPages() {
		return pages;
	}
	public void setPages(ArrayList<MasteryPage> pages) {
		this.pages = pages;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	@Override
	public String toString() {
		return "MasteryPages [pages=" + pages + ", summonerId=" + summonerId
				+ "]";
	}
	
	
}

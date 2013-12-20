package jriot.objects;

import java.util.ArrayList;

public class MasteryPage {
	
	private boolean current;
	private long id;
	private String name;
	private ArrayList<Talent> talents;
	
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Talent> getTalents() {
		return talents;
	}
	public void setTalents(ArrayList<Talent> talents) {
		this.talents = talents;
	}
	@Override
	public String toString() {
		return "MasteryPage [current=" + current + ", name=" + name
				+ ", talents=" + talents + "]";
	}
	
	

}

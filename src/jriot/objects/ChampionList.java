package jriot.objects;

import java.util.ArrayList;

public class ChampionList {
	
	private ArrayList<Champion> champions;

	public ArrayList<Champion> getChampions() {
		return champions;
	}

	@Override
	public String toString() {
		return "ChampionList [champions=" + champions + "]";
	}

	public void setChampions(ArrayList<Champion> champions) {
		this.champions = champions;
	}
	
	

}

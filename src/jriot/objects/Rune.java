package jriot.objects;

public class Rune {
	
	private String description;
	private int id;
	private String name;
	private int tier;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "Rune [description=" + description + ", id=" + id + ", name="
				+ name + ", tier=" + tier + "]";
	}
	
	

}

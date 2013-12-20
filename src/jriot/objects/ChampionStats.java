package jriot.objects;

public class ChampionStats {
	
	private int id;
	private String name;
	private AggregatedStats stats;
	
	
	@Override
	public String toString() {
		return "ChampionStats [id=" + id + ", name=" + name + ", stats="
				+ stats + "]";
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
	public AggregatedStats getStats() {
		return stats;
	}
	public void setStats(AggregatedStats stats) {
		this.stats = stats;
	}
	
	

}

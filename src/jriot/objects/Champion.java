package jriot.objects;

public class Champion {
	
	private boolean active;
	private int attackRank;
	private boolean botEnabled;
	private boolean botMmEnabled;
	private int defenseRank;
	private int difficultyRank;
	private boolean freeToPlay;
	private long id;
	private int magicRank;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Champion [active=" + active + ", attackRank=" + attackRank
				+ ", botEnabled=" + botEnabled + ", botMmEnabled="
				+ botMmEnabled + ", defenseRank=" + defenseRank
				+ ", difficultyRank=" + difficultyRank + ", freeToPlay="
				+ freeToPlay + ", id=" + id + ", magicRank=" + magicRank
				+ ", name=" + name + ", rankedPlayEnabled=" + rankedPlayEnabled
				+ "]";
	}
	private boolean rankedPlayEnabled;
	
	
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getAttackRank() {
		return attackRank;
	}
	public void setAttackRank(int attackRank) {
		this.attackRank = attackRank;
	}
	public boolean isBotEnabled() {
		return botEnabled;
	}
	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}
	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}
	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}
	public int getDefenseRank() {
		return defenseRank;
	}
	public void setDefenseRank(int defenseRank) {
		this.defenseRank = defenseRank;
	}
	public int getDifficultyRank() {
		return difficultyRank;
	}
	public void setDifficultyRank(int difficultyRank) {
		this.difficultyRank = difficultyRank;
	}
	public boolean isFreeToPlay() {
		return freeToPlay;
	}
	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMagicRank() {
		return magicRank;
	}
	public void setMagicRank(int magicRank) {
		this.magicRank = magicRank;
	}
	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}
	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}

}

package jriot.objects;

import java.util.ArrayList;

public class Champion
{
	private boolean active;
	private boolean botEnabled;
	private boolean botMmEnabled;
	private boolean freeToPlay;
	private boolean rankedPlayEnabled;
	private ArrayList<String> allytips;
	private ArrayList<String> enemytips;
	private ArrayList<String> tags;
	private ArrayList<Recommended> recommended;
	private ArrayList<Skin> skins;
	private ArrayList<ChampionSpell> spells;
	private String blurb;
	private String key;
	private String lore;
	private String name;
	private String partype;
	private String title;
	private long id;
	private Image image;
	private Info info;
	private Passive passive;
	private Stats stats;

	/**
    * Returns the active status of the champion.
	 *
	 * @return boolean active status of the champion.
    */
	public boolean getActive()
	{
		return active;
	}
	
	/**
    * Sets the active status of the champion.
	 *
	 * @param active active status of the champion.
    */
	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	/**
    * Returns the botEnabled status of the champion.
	 *
	 * @return boolean botEnabled status of the champion.
    */
	public boolean getBotEnabled()
	{
		return botEnabled;
	}
	
	/**
    * Sets the botEnabled status of the champion.
	 *
	 * @param botEnabled botEnabled status of the champion.
    */
	public void setBotEnabled(boolean botEnabled)
	{
		this.botEnabled = botEnabled;
	}
	
	/**
    * Returns the botMmEnabled status of the champion.
	 *
	 * @return boolean botMmEnabled status of the champion.
    */
	public boolean getBotMmEnabled()
	{
		return botMmEnabled;
	}
	
	/**
    * Sets the botMmEnabled status of the champion.
	 *
	 * @param botMmEnabled botMmEnabled status of the champion.
    */
	public void setBotMmEnabled(boolean botMmEnabled)
	{
		this.botMmEnabled = botMmEnabled;
	}
	
	/**
    * Returns the freeToPlay status of the champion.
	 *
	 * @return boolean freeToPlay of the champion.
    */
	public boolean getFreeToPlay()
	{
		return freeToPlay;
	}
	
	/**
    * Sets the freeToPlay status of the champion.
	 *
	 * @param freeToPlay freeToPlay of the champion.
    */
	public void setFreeToPlay(boolean freeToPlay)
	{
		this.freeToPlay = freeToPlay;
	}
	
	/**
    * Returns the rankedPlayEnabled status of the champion.
	 *
	 * @return boolean rankedPlayEnabled status of the champion.
    */
	public boolean getRankedPlayEnabled()
	{
		return rankedPlayEnabled;
	}
	
	/**
    * Sets the rankedPlayEnabled status of the champion.
	 *
	 * @param rankedPlayEnabled rankedPlayEnabled status of the champion.
    */
	public void setRankedPlayEnabled(boolean rankedPlayEnabled)
	{
		this.rankedPlayEnabled = rankedPlayEnabled;
	}
	
	/**
    * Returns the allytips of the champion.
	 *
	 * @return ArrayList<String> allytips of the champion.
    */
	public ArrayList<String> getAllytips()
	{
		return allytips;
	}
	
	/**
    * Sets the allytips of the champion.
	 *
	 * @param sllytips allytips of the champion.
    */
	public void set(ArrayList<String> allytips)
	{
		this.allytips = allytips;
	}
	
	/**
    * Returns the enemytips of the champion.
	 *
	 * @return ArrayList<String> enemytips of the champion.
    */
	public ArrayList<String> getEnemytips()
	{
		return enemytips;
	}
	
	/**
    * Sets the enemytips of the champion.
	 *
	 * @param enemytips enemytips of the champion.
    */
	public void setEnemytips(ArrayList<String> enemytips)
	{
		this.enemytips = enemytips;
	}
	
	/**
    * Returns the tags of the champion.
	 *
	 * @return ArrayList<String> tags of the champion.
    */
	public ArrayList<String> getTags()
	{
		return tags;
	}
	
	/**
    * Sets the tags of the champion.
	 *
	 * @param tags tags of the champion.
    */
	public void setTags(ArrayList<String> tags)
	{
		this.tags = tags;
	}
		
	/**
    * Returns the recommended of the champion.
	 *
	 * @return ArrayList<Recommended> recommended of the champion.
    */
	public ArrayList<Recommended> getRecommended()
	{
		return recommended;
	}
	
	/**
    * Sets the recommended of the champion.
	 *
	 * @param recommended recommended of the champion.
    */
	public void setRecommended(ArrayList<Recommended> recommended)
	{
		this.recommended = recommended;
	}
	
	/**
    * Returns the skins of the champion.
	 *
	 * @return ArrayList<Skin>  of the champion.
    */
	public ArrayList<Skin> getSkins()
	{
		return skins;
	}
	
	/**
    * Sets the skins of the champion.
	 *
	 * @param skins skins of the champion.
    */
	public void setSkins(ArrayList<Skin> skins)
	{
		this.skins = skins;
	}
	
	/**
    * Returns the spells of the champion.
	 *
	 * @return ArrayList<ChampionSpell> spells of the champion.
    */
	public ArrayList<ChampionSpell> getSpells()
	{
		return spells;
	}
	
	/**
    * Sets the spells of the champion.
	 *
	 * @param spells spells of the champion.
    */
	public void setSpells(ArrayList<ChampionSpell> spells)
	{
		this.spells = spells;
	}
	
	/**
    * Returns the blurb of the champion.
	 *
	 * @return String blurb of the champion. 
    */
	public String getBlurb()
	{
		return blurb;
	}
	
	/**
    * Sets the blurb of the champion.
	 *
	 * @param blurb Blurb of the champion.
    */
	public void setBlurb(String blurb)
	{
		this.blurb = blurb;
	}
	
	/**
    * Returns the key of the champion.
	 *
	 * @return String Key of the champion.
    */
	public String getKey()
	{
		return key;
	}
	
	/**
    * Sets the key of the champion.
	 *
	 * @param key Key of the champion.
    */
	public void setKey(String key)
	{
		this.key = key;
	}
	
	/**
    * Returns the lore of the champion.
	 *
	 * @return String lore of the champion.
    */
	public String getLore()
	{
		return lore;
	}
	
	/**
    * Sets the lore of the champion.
	 *
	 * @param lore lore of the champion.
    */
	public void setLore(String lore)
	{
		this.lore = lore;
	}
	
	/**
    * Returns the name of the champion.
	 *
	 * @return String name of the champion.
    */
	public String getName()
	{
		return name;
	}
	
	/**
    * Sets the name of the champion.
	 *
	 * @param name name of the champion.
    */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
    * Returns the partype of the champion.
	 *
	 * @return String partype of the champion.
    */
	public String getPartype()
	{
		return partype;
	}
	
	/**
    * Sets the partype of the champion.
	 *
	 * @param partype partype of the champion.
    */
	public void setPartype(String partype)
	{
		this.partype = partype;
	}
	
	/**
    * Returns the title of the champion.
	 *
	 * @return String title of the champion.
    */
	public String getTitle()
	{
		return title;
	}
	
	/**
    * Sets the title of the champion.
	 *
	 * @param title title of the champion.
    */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
    * Returns the id of the champion.
	 *
	 * @return long id of the champion.
    */
	public long getId()
	{
		return id;
	}
	
	/**
    * Sets the id of the champion.
	 *
	 * @param id id of the champion.
    */
	public void setId(long id)
	{
		this.id = id;
	}
	
	/**
    * Overloaded: Sets the id of the champion with integer.
	 *
	 * @param id id of the champion.
    */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
    * Returns the image of the champion.
	 *
	 * @return Image image of the champion.
    */
	public Image getImage()
	{
		return image;
	}
	
	/**
    * Sets the image of the champion.
	 *
	 * @param image image of the champion.
    */
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	/**
    * Returns the info of the champion.
	 *
	 * @return Info  of the champion.
    */
	public Info getInfo()
	{
		return info;
	}
	
	/**
    * Sets the info of the champion.
	 *
	 * @param info info of the champion.
    */
	public void setInfo(Info info)
	{
		this.info = info;
	}
	
	/**
    * Returns the passive of the champion.
	 *
	 * @return Passive passive of the champion.
    */
	public Passive getPassive()
	{
		return passive;
	}
	
	/**
    * Sets the passive of the champion.
	 *
	 * @param passive passive of the champion.
    */
	public void setPassive(Passive passive)
	{
		this.passive = passive;
	}
	
	/**
    * Returns the stats of the champion.
	 *
	 * @return Stats stats of the champion.
    */
	public Stats getStats()
	{
		return stats;
	}
	
	/**
    * Sets the stats of the champion.
	 *
	 * @param stats stats of the champion.
    */
	public void setStats(Stats stats )
	{
		this.stats = stats;
	}
}
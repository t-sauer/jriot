package jriot.objects;

import java.util.ArrayList;
import java.util.Map;

public class ChampionList
{

	private Map<String, Champion> data;
	private Map<String, String> keys;
	private ArrayList<Champion> champions;
	private String format, type, version;
	
	/**
    * Returns the data of all the champions.
	 *
	 * @return Map<String, Champion> data of all the champions.
    */
	public Map<String, Champion> getData()
	{
		return data;
	}
	
	/**
    * Sets the data of all the champions.
	 *
	 * @return data data of all the champions.
    */
	public void setData(Map<String, Champion> data)
	{
		this.data = data;
	}
	
	/**
    * Returns the keys of all the champions.
	 *
	 * @return Map<String, String> keys of all the champions.
    */
	public Map<String, String> getKeys()
	{
		return keys;
	}
	
	/**
    * Sets the keys of all the champions.
	 *
	 * @return keys keys of all the champions.
    */
	public void setKeys(Map<String, String> keys)
	{
		this.keys = keys;
	}
	
	/**
    * Returns the ChampionList of all the champions.
	 *
	 * @return ArrayList<Champion> champions a list of all the champions.
    */
	public ArrayList<Champion> getChampionList()
	{
		return champions;
	}
	
	/**
    * Sets the ChampionList of all the champions.
	 *
	 * @return champions champions a list of all the champions.
    */
	public void setChampions(ArrayList<Champion> champions)
	{
		this.champions = champions;
	}
	
	/**
    * Returns the format of data.
	 *
	 * @return String format of data.
    */
	public String getFormat()
	{
		return format;
	}
	
	/**
    * Returns the version of data.
	 *
	 * @param version version of data.
    */
	public void setFormat(String format)
	{
		this.format = format;
	}
	
	/**
    * Returns the type of data.
	 *
	 * @return String type of data.
    */
	public String getType()
	{
		return type;
	}
	
	/**
    * Returns the type of data.
	 *
	 * @param type type of data.
    */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
    * Returns the version of data.
	 *
	 * @return String version of data.
    */
	public String getVersion()
	{
		return version;
	}
	
	/**
    * Returns the version of data.
	 *
	 * @param version version of data.
    */
	public void setVersion(String version)
	{
		this.version = version;
	}

}
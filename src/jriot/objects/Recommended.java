package jriot.objects;

import java.util.ArrayList;

public class Recommended
{
	private ArrayList<Block> blocks;
	private String champion;
	private String map;
	private String mode;
	private boolean priority;
	private String title;
	private String type;
	
	
	/**
	 * Returns blocks.
	 *
	 * @return ArrayList<Block> blocks.
	 */
	public ArrayList<Block> getBlocks()
	{
		return blocks;
	}

	/**
	 * Sets blocks.
	 *
	 * @param blocks blocks.
	 */
	public void setBlocks(ArrayList<Block> blocks)
	{
		this.blocks = blocks;
	}

	/**
	 * Returns champion.
	 *
	 * @return String champion.
	 */
	public String getChampion()
	{
		return champion;
	}

	/**
	 * Sets champion.
	 *
	 * @param champion champion.
	 */
	public void setChampion(String champion)
	{
		this.champion = champion;
	}

	/**
	 * Returns map.
	 *
	 * @return String map.
	 */
	public String getMap()
	{
		return map;
	}

	/**
	 * Sets map.
	 *
	 * @param map map.
	 */
	public void setMap(String map)
	{
		this.map = map;
	}

	/**
	 * Returns mode.
	 *
	 * @return String mode.
	 */
	public String getMode()
	{
		return mode;
	}

	/**
	 * Sets mode.
	 *
	 * @param mode mode.
	 */
	public void setMode(String mode)
	{
		this.mode = mode;
	}

	/**
	 * Returns priority.
	 *
	 * @return boolean priority.
	 */
	public boolean getPriority()
	{
		return priority;
	}

	/**
	 * Sets priority.
	 *
	 * @param priority priority.
	 */
	public void setPriority(boolean priority)
	{
		this.priority = priority;
	}

	/**
	 * Returns title.
	 *
	 * @return String title.
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Sets title.
	 *
	 * @param title title.
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Returns type.
	 *
	 * @return String type.
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Sets type.
	 *
	 * @param type type.
	 */
	public void setType(String type)
	{
		this.type = type;
	}
}
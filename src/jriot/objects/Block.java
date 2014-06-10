package jriot.objects;

import java.util.ArrayList;

public class Block
{
	private ArrayList<BlockItem> items;
	private boolean recMath;
	private String type;

	/**
	 * Returns items.
	 *
	 * @return ArrayList<BlockItem> items.
	 */
	public ArrayList<BlockItem> getItems()
	{
		return items;
	}

	/**
	 * Sets items.
	 *
	 * @param items items.
	 */
	public void setItems(ArrayList<BlockItem> items)
	{
		this.items = items;
	}

	/**
	 * Returns recMath.
	 *
	 * @return boolean recMath.
	 */
	public boolean getRecMath()
	{
		return recMath;
	}

	/**
	 * Sets recMath.
	 *
	 * @param recMath recMath.
	 */
	public void setRecMath(boolean recMath)
	{
		this.recMath = recMath;
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
package jriot.objects;

import java.util.ArrayList;

public class SpellVars
{
	private ArrayList<Double> coeff;
	private String dyn;
	private String key;
	private String link;
	private String ranksWith;

	/**
	 * Returns coeff.
	 *
	 * @return ArrayList<double> coeff.
	 */
	public ArrayList<Double> getCoeff()
	{
		return coeff;
	}

	/**
	 * Sets coeff.
	 *
	 * @param coeff coeff.
	 */
	public void setCoeff(ArrayList<Double> coeff)
	{
		this.coeff = coeff;
	}

	/**
	 * Returns dyn.
	 *
	 * @return String dyn.
	 */
	public String getDyn()
	{
		return dyn;
	}

	/**
	 * Sets dyn.
	 *
	 * @param dyn dyn.
	 */
	public void setDyn(String dyn)
	{
		this.dyn = dyn;
	}

	/**
	 * Returns key.
	 *
	 * @return String key.
	 */
	public String getKey()
	{
		return key;
	}

	/**
	 * Sets key.
	 *
	 * @param key key.
	 */
	public void setKey(String key)
	{
		this.key = key;
	}

	/**
	 * Returns link.
	 *
	 * @return String link.
	 */
	public String getLink()
	{
		return link;
	}

	/**
	 * Sets link.
	 *
	 * @param link link.
	 */
	public void setLink(String link)
	{
		this.link = link;
	}

	/**
	 * Returns ranksWith.
	 *
	 * @return String ranksWith.
	 */
	public String getRanksWith()
	{
		return ranksWith;
	}

	/**
	 * Sets ranksWith.
	 *
	 * @param ranksWith ranksWith.
	 */
	public void setRanksWith(String ranksWith)
	{
		this.ranksWith = ranksWith;
	}
}
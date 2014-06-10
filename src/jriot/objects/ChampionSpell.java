package jriot.objects;

import java.util.ArrayList;

public class ChampionSpell
{
	private ArrayList<Integer> cost;
	private ArrayList<Double> cooldown;
	private ArrayList<String> effectBurn;
	private ArrayList<Object> effect;
	private ArrayList<Image> altimages;
	private ArrayList<SpellVars> vars;
	private String cooldownBurn;
	private String costBurn;
	private String costType;
	private String description;
	private String key;
	private String name;
	private String rangeBurn;
	private String recource;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private String tooltip;
	private int maxrank;
	private Object range;
	private Image image;
	private LevelTip leveltip;

	
	/**
    * Returns the cost of the champion spell.
	 *
	 * @return ArrayList<int> cost of the champion spell.
    */
	public ArrayList<Integer> getCost()
	{
		return cost;
	}
	
	/**
    * Sets the cost of the champion spell.
	 *
	 * @param cost cost of the champion spell.
    */
	public void setCost(ArrayList<Integer> cost)
	{
		this.cost = cost;
	}
	
	/**
    * Returns the cooldown of the champion spell.
	 *
	 * @return ArrayList<double> cooldown of the champion spell.
    */
	public ArrayList<Double> getCooldown()
	{
		return cooldown;
	}
	
	/**
    * Sets the cooldown of the champion spell.
	 *
	 * @param cooldown cooldown of the champion spell.
    */
	public void setCooldown(ArrayList<Double> cooldown)
	{
		this.cooldown = cooldown;
	}
	
	/**
    * Returns the effectBurn of the champion spell.
	 *
	 * @return ArrayList<String> effectBurn of the champion spell.
    */
	public ArrayList<String> getEffectBurn()
	{
		return effectBurn;
	}
	
	/**
    * Sets the effectBurn of the champion spell.
	 *
	 * @param effectBurn effectBurn of the champion spell.
    */
	public void setEffectBurn(ArrayList<String> effectBurn)
	{
		this.effectBurn = effectBurn;
	}
	
	/**
    * Returns the effect of the champion spell.
	 *
	 * @return ArrayList<Object> effect of the champion spell.
    */
	public ArrayList<Object> getEffect()
	{
		return effect;
	}
	
	/**
    * Sets the effect of the champion spell.
	 *
	 * @param effect effect of the champion spell.
    */
	public void setEffect(ArrayList<Object> effect)
	{
		this.effect = effect;
	}
	
	/**
    * Returns the altimages of the champion spell.
	 *
	 * @return ArrayList<Image> altimages of the champion spell.
    */
	public ArrayList<Image> getAltimage()
	{
		return altimages;
	}
	
	/**
    * Sets the altimages of the champion spell.
	 *
	 * @param altimages altimages of the champion spell.
    */
	public void setAltimage(ArrayList<Image> altimages )
	{
		this.altimages = altimages;
	}
		
	/**
    * Returns the vars of the champion spell.
	 *
	 * @return ArrayList<SpellVars> vars of the champion spell.
    */
	public ArrayList<SpellVars> getVars()
	{
		return vars;
	}
	
	/**
    * Sets the vars of the champion spell.
	 *
	 * @param vars vars of the champion spell.
    */
	public void setVars(ArrayList<SpellVars> vars)
	{
		this.vars = vars;
	}
	
	/**
    * Returns the cooldownBurn of the champion spell.
	 *
	 * @return String cooldownBurn of the champion spell.
    */
	public String getCooldownBurn()
	{
		return cooldownBurn;
	}
	
	/**
    * Sets the cooldownBurn of the champion spell.
	 *
	 * @param cooldownBurn cooldownBurn of the champion spell.
    */
	public void setCooldownBurn(String cooldownBurn)
	{
		this.cooldownBurn = cooldownBurn;
	}
	
	/**
    * Returns the costBurn of the champion spell.
	 *
	 * @return String costBurn of the champion spell.
    */
	public String getCostBurn()
	{
		return costBurn;
	}
	
	/**
    * Sets the costBurn of the champion spell.
	 *
	 * @param costBurn costBurn of the champion spell.
    */
	public void setCostBurn(String costBurn)
	{
		this.costBurn = costBurn;
	}
	
	/**
    * Returns the costType of the champion spell.
	 *
	 * @return String costType of the champion spell.
    */
	public String getCostType()
	{
		return costType;
	}
	
	/**
    * Sets the costType of the champion spell.
	 *
	 * @param costType costType of the champion spell.
    */
	public void setCostType(String costType)
	{
		this.costType = costType;
	}
	
	/**
    * Returns the description of the champion spell.
	 *
	 * @return String description of the champion spell.
    */
	public String getDescription()
	{
		return description;
	}
	
	/**
    * Sets the description of the champion spell.
	 *
	 * @param description description of the champion spell.
    */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
    * Returns the key of the champion spell.
	 *
	 * @return String key of the champion spell.
    */
	public String getKey()
	{
		return key;
	}
	
	/**
    * Sets the key of the champion spell.
	 *
	 * @param key key of the champion spell.
    */
	public void setKey(String key)
	{
		this.key = key;
	}
	
	/**
    * Returns the name of the champion spell.
	 *
	 * @return String name of the champion spell.
    */
	public String getName()
	{
		return name;
	}
	
	/**
    * Sets the name of the champion spell.
	 *
	 * @param name name of the champion spell.
    */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
    * Returns the rangeBurn of the champion spell.
	 *
	 * @return String rangeBurn of the champion spell.
    */
	public String getRangeBurn()
	{
		return rangeBurn;
	}
	
	/**
    * Sets the rangeBurn of the champion spell.
	 *
	 * @param rangeBurn rangeBurn of the champion spell.
    */
	public void setRangeBurn(String rangeBurn)
	{
		this.rangeBurn = rangeBurn;
	}
	
	/**
    * Returns the recource type of the champion spell.
	 *
	 * @return String recource of the champion spell.
    */
	public String getRecource()
	{
		return recource;
	}
	
	/**
    * Sets the recource type of the champion spell.
	 *
	 * @param recource recource type of the champion spell.
    */
	public void setRecource(String recource)
	{
		this.recource = recource;
	}
	
	/**
    * Returns the sanitizedDescription of the champion spell.
	 *
	 * @return String sanitizedDescription of the champion spell.
    */
	public String getSanitizedDescription()
	{
		return sanitizedDescription;
	}
	
	/**
    * Sets the sanitizedDescription of the champion spell.
	 *
	 * @param sanitizedDescription sanitizedDescription of the champion spell.
    */
	public void setSanitizedDescription(String santitizedDescription)
	{
		this.sanitizedDescription = sanitizedDescription;
	}
	
	/**
    * Returns the sanitizedTooltip of the champion spell.
	 *
	 * @return String sanitizedTooltip of the champion spell.
    */
	public String getSanitizedTooltip()
	{
		return sanitizedTooltip;
	}
	
	/**
    * Sets the sanitizedTooltip of the champion spell.
	 *
	 * @param sanitizedTooltip sanitizedTooltip of the champion spell.
    */
	public void setSanitizedTooltip(String sanitizedTooltip)
	{
		this.sanitizedTooltip = sanitizedTooltip;
	}
	
	/**
    * Returns the tooltip of the champion spell.
	 *
	 * @return String tooltip of the champion spell.
    */
	public String getTooltip()
	{
		return tooltip;
	}
	
	/**
    * Sets the tooltip of the champion spell.
	 *
	 * @param tooltip tooltip of the champion spell.
    */
	public void setTooltip(String tooltip)
	{
		this.tooltip = tooltip;
	}

	
	/**
    * Returns the maxrank of the champion spell.
	 *
	 * @return int maxrank of the champion spell.
    */
	public int geMaxrankt()
	{
		return maxrank;
	}
	
	/**
    * Sets the maxrank of the champion spell.
	 *
	 * @param maxrank maxrank of the champion spell.
    */
	public void setMaxrank()
	{
		this.maxrank = maxrank;
	}

	
	/**
    * Returns the range of the champion spell.
	 *
	 * @return Object range of the champion spell.
    */
	public Object getRange()
	{
		return range;
	}
	
	/**
    * Sets the range of the champion spell.
	 *
	 * @param range range of the champion spell.
    */
	public void setRange(Object range)
	{
		this.range = range;
	}
	
	/**
    * Returns the image of the champion spell.
	 *
	 * @return Image image of the champion spell.
    */
	public Image getImage()
	{
		return image;
	}
	
	/**
    * Sets the image of the champion spell.
	 *
	 * @param image image of the champion spell.
    */
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	/**
    * Returns the leveltip of the champion spell.
	 *
	 * @return Leveltip leveltip of the champion spell.
    */
	public LevelTip getLevelTip()
	{
		return leveltip;
	}
	
	/**
    * Sets the leveltip of the champion spell.
	 *
	 * @param leveltip leveltip of the champion spell.
    */
	public void setLevelTip(LevelTip leveltip)
	{
		this.leveltip = leveltip;
	}
}
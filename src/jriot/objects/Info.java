package jriot.objects;

public class Info 
{
	private int attack;
	private int defense;
	private int difficulty;
	private int magic;
	
	/**
    * Returns the attack level of the champion.
	 *
	 * @return int attack level of the champion.
    */
	public int getAttack()
	{
		return attack;
	}
	
	/**
    * Sets the attack level of the champion.
	 *
	 * @param attack attack level of the champion.
    */
	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	
	/**
    * Returns the defense level of the champion.
	 *
	 * @return int defense level of the champion.
    */
	public int getDefense()
	{
		return defense;
	}
	
	/**
    * Sets the defense level of the champion.
	 *
	 * @param defense defense level of the champion.
    */
	public void setDefense(int defense)
	{
		this.defense = defense;
	}
	
	/**
    * Returns the difficulty level of the champion.
	 *
	 * @return int difficulty level of the champion.
    */
	public int getDifficulty()
	{
		return difficulty;
	}
	
	/**
    * Sets the difficulty level of the champion.
	 *
	 * @param difficulty difficulty level of the champion.
    */
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	
	/**
    * Returns the magic level of the champion.
	 *
	 * @return int magic level of the champion.
    */
	public int getMagic()
	{
		return magic;
	}
	
	/**
    * Sets the magic level of the champion.
	 *
	 * @param magic magic level of the champion.
    */
	public void setMagic(int magic)
	{
		this.magic = magic;
	}

}
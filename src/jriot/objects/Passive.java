package jriot.objects;

public class Passive
{
	private String description;
	private String name;
	private String sanitizedDescription;
	private Image image;

	
	/**
    * Returns the description of the passive.
	 *
	 * @return String description of the passive.
    */
	public String getDescription()
	{
		return description;
	}
	
	/**
    * Sets the description of the passive.
	 *
	 * @param description description of the passive.
    */
	public void setDescription(String description)
	{
		this.description =  description;
	}
	/**
    * Returns the name of the passive.
	 *
	 * @return String name of the passive.
    */
	public String getName()
	{
		return name;
	}
	
	/**
    * Sets the name of the passive.
	 *
	 * @param name name of the passive.
    */
	public void setName(String name)
	{
		this.name =  name;
	}
	
	/**
    * Returns the sanitizedDescription of the passive.
	 *
	 * @return String sanitizedDescription of the passive.
    */
	public String getSanitizedDescription()
	{
		return sanitizedDescription;
	}
	
	/**
    * Sets the sanitizedDescription of the passive.
	 *
	 * @param sanitizedDescription sanitizedDescription of the passive.
    */
	public void setSanitizedDescription(String sanitizedDescription)
	{
		this.sanitizedDescription =  sanitizedDescription;
	}
	
	/**
    * Returns the image of the passive.
	 *
	 * @return Image image of the passive.
    */
	public Image getImage()
	{
		return image;
	}
	
	/**
    * Sets the image of the passive.
	 *
	 * @param image image of the passive.
    */
	public void setImage(Image image)
	{
		this.image =  image;
	}

}
package ca.ualberta.cs.lonelytwitter; // package keyword puts this class in this package

import java.util.Date;

public abstract class AbstractTweetModel
{
	private String text;
	protected Date timestamp; // referring to java.util.Date
	
	public AbstractTweetModel(String text) // also a constructor, it will choose which to use based on the type used, or in this case, how many arguments you provide
	{

		super();
		this.text = text;
		timestamp = new Date(); 
		/* refers to the class attribute timestamp (here since there is only one timestamp, the this. is implied); 
		 * new creates a new instance of the object; this is calling the default date constructor
		 */
		
	}

	public AbstractTweetModel(String text, Date timestamp) // constructors have same name as the class
	{

		super(); // refers to the parent (super) class 
		this.text = text;
		this.timestamp = timestamp;
	}

	public String getText()
	{
	
		return text;
	}
	
	public void setText(String text) throws Exception
	{
		if (text.length() > 140) {
			throw new IllegalArgumentException();
		}
		this.text = text; // this is a keyword that refers to the current object here text refers to the argument string text, this.text refers to private string text above on line 10
	}
	
	public abstract Date getTimestamp();
	
	public abstract boolean isImportant();

	public void setTimestamp(Date timestamp)
	{
	
		this.timestamp = timestamp;
	}
}

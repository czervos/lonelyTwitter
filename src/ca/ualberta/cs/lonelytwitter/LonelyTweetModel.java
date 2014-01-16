package ca.ualberta.cs.lonelytwitter; // package keyword puts this class in this package

import java.util.Date;

public abstract class LonelyTweetModel 
/* public access modifier - public (see anywhere), default (no actual key word, can see anywhere in package) 
 * protected (see in current class & subclasses), private (only see in current class)
 */
{
	private String text;
	private Date timestamp; // referring to java.util.Date
	
	public LonelyTweetModel(String text) // also a constructor, it will choose which to use based on the type used, or in this case, how many arguments you provide
	{

		super();
		this.text = text;
		timestamp = new Date(); // refers to the class attribute timestamp (here since there is only one timestamp, the this. is implied); new creates a new instance of the object; this is calling the default date constructor
		
	}

	public LonelyTweetModel(String text, Date timestamp) // constructors have same name as the class
	{

		super(); // refers to the parent (super) class 
		this.text = text;
		this.timestamp = timestamp;
	}

	public String getText()
	{
	
		return text;
	}
	
	public void setText(String text)
	{
	
		this.text = text; // this is a keyword that refers to the current object here text refers to the argument string text, this.text refers to private string text above on line 10
	}
	
	public abstract Date getTimestamp();
	
	public void setTimestamp(Date timestamp)
	{
	
		this.timestamp = timestamp;
	}
}

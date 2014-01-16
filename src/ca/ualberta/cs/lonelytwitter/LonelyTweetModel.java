package ca.ualberta.cs.lonelytwitter; // package keyword puts this class in this package

import java.util.Date;

public class LonelyTweetModel 
/* public access modifier - public (see anywhere), default (no actual key word, can see anywhere in package) 
 * protected (see in current class & subclasses), private (only see in current class)
 */
{
	private String text;
	private Date timestamp; // referring to java.util.Date
	
	public String getText()
	{
	
		return text;
	}
	
	public void setText(String text)
	{
	
		this.text = text; // this is a keyword that refers to the current object here text refers to the argument string text, this.text refers to private string text above
	}
	
	public Date getTimestamp()
	{
	
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp)
	{
	
		this.timestamp = timestamp;
	}
}

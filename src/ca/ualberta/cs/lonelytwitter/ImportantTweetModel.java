package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class ImportantTweetModel extends LonelyTweetModel // based on lonely tweet model
{

	public ImportantTweetModel(String text, Date timestamp)
	{

		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	public ImportantTweetModel(String text)
	{

		super(text);
		// TODO Auto-generated constructor stub
	}
	public String getText() {
		return "Important! " + super.getText();
	}
	
	@Override
	public boolean isImportant() {
		return true;
	}

	@Override // tells java to check to see if there is a getTimestamp mentioned in the superclass
	public Date getTimestamp()
	{

		// TODO Auto-generated method stub
		return super.timestamp;
	}
	
	
}

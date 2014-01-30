package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetSetModel
{
	private int count = 0;
	private ArrayList<LonelyTweetModel> list = new ArrayList<LonelyTweetModel>();

	public Object countTweets()
	{
		return count;
	}

	public void addTweet(NormalTweetModel normalTweetModel) throws IllegalArgumentException
	{
		if(list.contains(normalTweetModel)){
	         IllegalArgumentException exception
             = new IllegalArgumentException("Duplicate Tweet!");
             throw exception;
		}
		else{
			list.add(normalTweetModel);
			count++;
		}
	}

	public ArrayList<LonelyTweetModel> getTweets()
	{

		// TODO Auto-generated method stub
		return list;
	}

}


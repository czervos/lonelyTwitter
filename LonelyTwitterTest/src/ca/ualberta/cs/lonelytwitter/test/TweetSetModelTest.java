package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetSetModelTest()
	{
		super(LonelyTwitterActivity.class);

	}
	
	public void testCount() {
		TweetSetModel tweets = new TweetSetModel();
	
		assertEquals("tweets should start empty", 0, tweets.countTweets());
	
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding a tweet, count shuold be 1", 1, tweets.countTweets());
	}

	public void testGetTweet() {
		TweetSetModel tweets = new TweetSetModel();
		assertEquals("tweets should start empty", 0, tweets.getTweets().size());
		
		Date date = new Date();
		NormalTweetModel normal1 = new NormalTweetModel("first", date);
		NormalTweetModel normal2 = new NormalTweetModel("second", date);
		NormalTweetModel normal3 = new NormalTweetModel("third", date);
		tweets.addTweet(normal1);
		tweets.addTweet(normal2);
		tweets.addTweet(normal3);
		
		assertEquals("tweets should have three", 3, tweets.getTweets().size());	
		ArrayList<LonelyTweetModel> list = tweets.getTweets();
		assertEquals("tweet at pos 0 is the same as first added tweet", normal1, list.get(0));
		assertEquals("tweet at pos 1 is the same as second added tweet", normal2, list.get(1));
		assertEquals("tweet at pos 2 is the same as third added tweet", normal3, list.get(2));
		
		// are the same order now
		
		NormalTweetModel copy = new NormalTweetModel("first", date); // same as normal1
		int exception = 0;
		try{
			tweets.addTweet(copy);
		} catch(IllegalArgumentException e) {
			exception += 1;
		}
		assertEquals("exception should be one", 1, exception);
		assertEquals("tweets should still have three", 3, tweets.getTweets().size());
		
		
		
		//ImportantTweetModel important = new ImportantTweetModel("test", date);
	}
}

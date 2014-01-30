package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
/*	public void testFaileure() {
		assertEquals("5 should equal 5", 5, 4);
	}*/
	
	public void testEquals(){
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("test", date);
		NormalTweetModel otherNormal = new NormalTweetModel("different text", date);
		
		assertFalse("different tweets are not equal", normal.equals(otherNormal));
	}
	
	public void testPriority() {
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("test", date);
		ImportantTweetModel important = new ImportantTweetModel("test", date);
		assertFalse("Normal and important should not be equal", normal.equals(important));
		assertFalse("Important and normal should not be equal", important.equals(normal));
		
	}
	

}

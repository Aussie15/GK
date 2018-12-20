package GlobalKineticAssessment;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigation extends base{
	
	private static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage Page = new LandingPage(driver);
		//compare the text from the browser with actual text - Error -
		Assert.assertTrue(Page.getNavigationBar().isDisplayed());
		Log.info("Navigation bar is displayed");
		//Assert.assertFalse(false);
		;
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}

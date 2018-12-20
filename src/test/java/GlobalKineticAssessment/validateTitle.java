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

public class validateTitle extends base{

	private static Logger Log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to HomePage");
	}
	
	@Test
	public void TravelNavigation() throws IOException
	{
		
		
		LandingPage Page = new LandingPage(driver);
		//compare the text from the browser with actual text - Error -
		Assert.assertEquals(Page.getTitle().getText(), "FEATURED COURSES");
		Log.info("Successfully validated text message");
		;
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}

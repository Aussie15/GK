package GlobalKineticAssessment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{

	private static Logger Log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String email, String password, String text) throws IOException
	{
		LandingPage Page = new LandingPage(driver);
		//Page.getClose().click();
		Page.getLogin().click();
		
		LoginPage LP = new LoginPage(driver);
		LP.getEmail().sendKeys(email);
		LP.getPassword().sendKeys(password);
		LP.getSubmit().click();
		Log.info(text);
		driver.navigate().back();
		Page.getInterview().click();
		Assert.assertEquals(Page.getIntGuide().getText(), "INTERVIEW GUIDE");
		Page.getAppium().click();
		
	}
	
	
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	

	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "Hello@gmail.com";
		data[0][1] = "Hellos";
		data[0][2] = "Invalid email or password.";

		return data;
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {


	public WebDriver driver;
	
	By close = By.xpath("//button[text()='NO THANKS']");
	By signin = By.xpath("//span[text()='Login']");
	By title = By.xpath("//div[@class='text-center']//h2");
	By navBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a");
	By interview = By.xpath("(//a[text()='Interview Guide'])[1]");
	By intGuide = By.xpath("//div[contains(text(),'Interview Guide')]");
	By appium = By.xpath("(//b[contains(text(),'Appium')])[1]");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	
	public WebElement getAppium()
	{
		return driver.findElement(appium);
	}

	public WebElement getIntGuide()
	{
		return driver.findElement(intGuide);
	}
	
	public WebElement getInterview()
	{
		return driver.findElement(interview);
	}
	
	public WebElement getClose()
	{
		return driver.findElement(close);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navBar);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
}

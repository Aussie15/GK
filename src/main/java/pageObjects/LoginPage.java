package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.name("commit");
	By errorMsg = By.xpath("//div[contains(text(),'Invalid email or password.')]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}

	public WebElement getError()
	{
		return driver.findElement(errorMsg);
	}
	
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
}

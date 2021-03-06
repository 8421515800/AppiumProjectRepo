//parent class to all the pages class
package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageBase 
{
	
	public AppiumDriver<MobileElement> driver;
	
	public WebDriverWait wait;
	
	public PageBase(AppiumDriver<MobileElement> driver)
	{
		
		this.driver = driver;
		
	}
	
	public void waitforElement(long duration, String locator)
	{
		
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));		
		
	}
	
}

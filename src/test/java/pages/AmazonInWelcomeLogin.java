package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonInWelcomeLogin extends PageBase
{
	//Page Factory Element
	@AndroidFindBy(id="ap_password")  //Amazon password input field
	public WebElement amazonpass;
	
	@AndroidFindBy(id="signInSubmit")  //Login button
	public WebElement Loginbtn;
	
	
	
	public AmazonInWelcomeLogin(AppiumDriver<MobileElement> driver)
	{
		super(driver);
		//initilization of page factory
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}
	
	public MainHomePage logincomp()
	{
		amazonpass.sendKeys("sweety");
		Loginbtn.click();
		return new MainHomePage(driver);
		
	}
	
	
	

	
}

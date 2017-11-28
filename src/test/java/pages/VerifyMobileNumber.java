package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VerifyMobileNumber extends PageBase
{

	//Page Factory Element
	@AndroidFindBy(id="auth-pv-enter-code")         //Enter code input field
	public WebElement entercode;
	
	@AndroidFindBy(id="auth-verify-button")         //vefiy button
	public WebElement verifybtn;
	
	
	public VerifyMobileNumber(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		//initilization of page factory
				PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}
	
	//Method for VerifyCodeNumber
	public MainHomePage VerifyCodeNumber()
	{
		entercode.sendKeys("");             //enter the code that we got from Amazon
		verifybtn.click();
		return new MainHomePage(driver);
		
	}
	

}

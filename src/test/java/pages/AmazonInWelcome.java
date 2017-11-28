//here we can perform create an account as well as Login to the amazon
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonInWelcome extends PageBase
{
	//Page Factory Elements
	/*for Login operation*/
	@AndroidFindBy(id="ap_email_login") //Email input field
	public WebElement Email;
	
	@AndroidFindBy(id="continue") //Continue button
	public WebElement cntbtn;
	
	/*For Create Account Operation*/
	@AndroidFindBy(id="ap_customer_name") //Name input field
	public WebElement namefld;
	
	@AndroidFindBy(id="ap_phone_number") //Email input field
	public WebElement mobno;
	
	@AndroidFindBy(id="ap_email") //Email input field
	public WebElement emailadd;
	
	@AndroidFindBy(id="ap_password") //Email input field
	public WebElement crtpass;
	
	@AndroidFindBy(id="continue") //Email input field
	public WebElement continuebtn;
	
	public AmazonInWelcome(AppiumDriver<MobileElement> driver) 
	{
		super(driver);		
		
		//initilization of page factory
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}

	//Method for login if already have a account
	public AmazonInWelcomeLogin Login()
	{
		Email.sendKeys("8421515800");
		cntbtn.click();
		return new AmazonInWelcomeLogin(driver);
		
	}
	
	//Method for Creating a account
	public VerifyMobileNumber createAccount() 
	{
		namefld.sendKeys("Vicky koyale");
		mobno.sendKeys("8329563767");
		emailadd.sendKeys("vikas@xyz.com");
		crtpass.sendKeys("Vikas@123");
		driver.hideKeyboard();
		continuebtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new VerifyMobileNumber(driver);
		
	}
	
	
}

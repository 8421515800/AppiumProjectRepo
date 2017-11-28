//coded for Amazon HomePage
package pages;

import base.PageBase;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage extends PageBase
{
	
	//Page Factory Element
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/signin_to_yourAccount")   //verifying amazon text on homepage
	public WebElement amazontxt;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/signin_to_yourAccount")   //verifying home page txt Sign in to your account
	public WebElement verifytxt;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")     //already a Customer?Sign In
	public WebElement alrdyCustSignIn;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/new_user")     //New to amazon:?Create an account
	public WebElement newtoAmzCrtAc;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")     //skip sign in
	public WebElement SkipSignIn;
	
	@AndroidFindBy(className="android.widget.Button")     //skip sign in
	public List<AndroidElement> HomepageBtn;
	

	public HomePage(AppiumDriver<MobileElement> driver) 
	{
		super(driver);		
		
		//initilization of page factory
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}
	
	//method for finding the correct page launched or not
	
	public void verifyText()
	{
		String st=amazontxt.getText();
		
		Assert.assertEquals(st, "Sign in to your account");
	}
	
	
	//Method for finding the total no of buttons
	public int FindButtonCount()
	{
		return HomepageBtn.size();
	}
	
	//sing in if the already a customer
	public AmazonInWelcome SignInAlreadyCust()
	{
		alrdyCustSignIn.click();		
		
		//will return new page Amazon.In	
		return new AmazonInWelcome(driver);
	}
	
	//Method for creating a new account if New to Amazon
	public AmazonInWelcome CreateAcNewToAmz()
	{
		newtoAmzCrtAc.click();
		
		//on click new customer it will redirects to Welcome Page
		return new AmazonInWelcome(driver);
	
	}		
	
	//Method Skip  sign in
	public MainHomePage SkipSignIn()
	{
		SkipSignIn.click();
		//it will directs to MainPage of Amazon
		return new MainHomePage(driver);		
	}
}

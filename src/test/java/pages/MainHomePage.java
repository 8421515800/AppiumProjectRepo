package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.velocity.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainHomePage extends PageBase
{
	//Page Factory Element
	/*for getting the current user*/
	@AndroidFindBy(id="gw-mobile-greeting-bar")  //greeting bar
	public WebElement grtngbar;
	
	/*for hanburger Menu*/	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/action_bar_burger_icon")  //hanburger menu
	public WebElement hanburger;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/gno_menu_container")   //list id for hanburger
	public WebElement hnbrlist;
	
	
	
	/*for shopping cart icon*/
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart") //for shoppingcart icon
	public WebElement carticon;
	
 

	public MainHomePage(AppiumDriver<MobileElement> driver)
	{
		super(driver);
		//initilization of page factory
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);		
	}
	
	//Method for verifying current user
	public void VerifyUser()
	{
		System.out.println("the user is:"+grtngbar.getText());			
	}
	
	//for Hanburger menu icon
	public void TestHanburger()
	{
		hanburger.click();	
		
	
	}
	
	//Method for cart related operation
	public ShoppingCartPage cartIcon() 
	{
		carticon.click();
		return new ShoppingCartPage(driver);
		
	}
	
}

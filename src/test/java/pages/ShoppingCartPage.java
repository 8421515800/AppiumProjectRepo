package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShoppingCartPage extends PageBase
{

	//Page Factory Element
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart") //for shoppingcart icon
	public WebElement carticon;
	
	
	public ShoppingCartPage(AppiumDriver<MobileElement> driver)
	{
		super(driver);
		//initilization of page factory
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);		
	}

	//method for verifying cart is empty or not
	public void checkcartCount()
	{
		System.out.println("heer............");
		
		
	}
}

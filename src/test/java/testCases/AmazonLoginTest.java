//code for login to the Amazon
package testCases;

import pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import junit.framework.Assert;

public class AmazonLoginTest extends TestBase
{

HomePage home;
	
	@BeforeTest
	public void init()
	{
		home = new HomePage(driver);
	}
	
	@Test(priority=1)
	public void validateButton()
	{
		System.out.println("The total no of buttons are:"+home.FindButtonCount());		
		Assert.assertEquals(3, home.FindButtonCount());
	}		
	
	@Test
	public void verifytext()
	{
		home.verifyText();
		
	}
	
	@Test(priority=2)
	public void signInAlreadyCust()
	{
		
		home.SignInAlreadyCust().Login().logincomp();
		
	}
	
}

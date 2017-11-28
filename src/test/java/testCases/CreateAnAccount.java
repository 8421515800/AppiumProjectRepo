package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class CreateAnAccount extends TestBase
{
	HomePage home;
	
	@BeforeTest
	public void init()
	{
		home = new HomePage(driver);
	}
	
	@Test
	public void testCreateAccount()
	{
		home.CreateAcNewToAmz().createAccount().VerifyCodeNumber();
	}
	
}

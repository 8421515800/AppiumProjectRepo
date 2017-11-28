package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import junit.framework.Assert;
import pages.HomePage;
import pages.MainHomePage;

public class MainHomePageFunctionality extends TestBase
{

MainHomePage home;
	
	@BeforeTest
	public void init()
	{
		home = new MainHomePage(driver);
	}

	/*
	@Test
	public void verifyuser()
	{
		home.VerifyUser();
		
	}
	
	@Test
	public void testhanburger()
	{
		home.TestHanburger();
	}
	*/
	@Test
	public void testcart()
	{
		home.cartIcon().checkcartCount();
	}
}

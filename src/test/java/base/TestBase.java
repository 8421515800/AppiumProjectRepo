//base class for all the test cases
package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utility.CommonUtilities;
import utility.ExcelReader;


public class TestBase 
{
	public static AppiumDriver<MobileElement> driver;
	
	public static String loadPropertyFile = "Android_AmazonApp.properties";
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "/src/test/resources/properties/testdata.xlsx");
	
	//for generating the user defined log
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		if(driver==null) //initially driver is null here
		{
			if (loadPropertyFile.startsWith("IOS")) 
			{

				log.debug("Starting on IOS Platform");
			
			}
			else if (loadPropertyFile.startsWith("Android")) 
			{
				log.debug("Starting on Android Platfrom");
				CommonUtilities.loadAndroidConfigProp(loadPropertyFile);	
				CommonUtilities.SetAndroidCapabilites();
				driver = CommonUtilities.getAndroidDriver();
			}
		}
	}
	
	
	
	@AfterSuite
	public void tearDown() throws IOException 
	{

		driver.quit();
		
	}
	
	
}

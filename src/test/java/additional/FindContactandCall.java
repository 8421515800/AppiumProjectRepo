package additional;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class FindContactandCall
{
	@Test
      public static void findCall() throws MalformedURLException, InterruptedException 
	{
             DesiredCapabilities capabilities = new DesiredCapabilities();
             capabilities.setCapability("automationName", "Appium");
             capabilities.setCapability("platformName", "Android");
             capabilities.setCapability("platformVersion", "7.1.2");
             capabilities.setCapability("deviceName", "Mi A1");

             capabilities.setCapability("appPackage", "com.android.contacts");
             capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
             AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),
                          capabilities);
             driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            
             WebElement NameList= driver.findElement(By.id("android:id/list"));
             java.util.List<WebElement> conLists = NameList.findElements(By.className("android.view.ViewGroup"));
             int i = 1;
             do {

                    for (WebElement conList : conLists) {
                          System.out.println("Contact Name is : " + conList.findElement(By.className("android.widget.TextView")).getText());
                          if (conList.findElement(By.className("android.widget.TextView")).getText().equalsIgnoreCase("ABHISHEK KUMAR singh")) {
                                 i = 0;
                                 conList.findElement(By.className("android.widget.TextView")).click();
                                 break;
                          }

                    }
                    if (i == 1) {
                          TouchAction action = new TouchAction(driver);
                          action.longPress(565, 1875).moveTo(565, 330).release().perform();
                    }
                                       
             }while(i==1);

      
	}
}

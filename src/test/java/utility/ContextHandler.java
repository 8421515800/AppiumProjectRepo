//for checking the no of context on page
package utility;

import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class ContextHandler
{
	AppiumDriver<WebElement>driver;
	Set<String> contextNames = driver.getContextHandles();
	{
	//Thread.sleep(3000);
	for (String context: contextNames)
	{
		System.out.println(context);
		//below if condition will change the context to WEBVIEW.
		if(context.contains("WEBVIEW"))
		{
			driver.context(context);
				
		}
		System.out.println("context passed");
	}
	}
}

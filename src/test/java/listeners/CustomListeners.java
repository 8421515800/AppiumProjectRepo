package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utility.TestUtil;

public class CustomListeners implements ITestListener
{

	public void onFinish(ITestContext arg0) 
	{
	
		
	}

	public void onStart(ITestContext arg0)
	{
		
		System.out.println("The Test Started!!!!!!");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
	{
		
		
	}

	public void onTestFailure(ITestResult arg0)
	{
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try
		{
			TestUtil.takeScreenShot();
		}
		catch (IOException e) 
		{
		
			e.printStackTrace();
		}		
		
		Reporter.log("<a target='_blank' href=\""+TestUtil.destFile+"\">Capture Screenshot</a>");
		System.out.println("Capture Screenshot");
		
	}

	public void onTestSkipped(ITestResult arg0) 
	{
		
	}

	public void onTestStart(ITestResult arg0)
	{
		
		
	}

	public void onTestSuccess(ITestResult arg0) 
	{
		
		System.out.println("The Test is successfully executed!!");
	}

}

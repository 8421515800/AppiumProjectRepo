/*
 * @author : Vikas Koyale
 * Created Date : 20/11/2017
 * AppiumFinalProject is for checking of core functionality of Amazon application.
 * app_pkg : 
 * app_activity : 
 * Location : PASE LAB Pune
 * This framework is designed using Page object Model.
 * In PropertyFileReader class contains a method which is used for reading xpaths from object repository.
 *
 */
package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader
{


	static String propertyFileName=null;
	public PropertyFileReader(String FilePath)
	{
		PropertyFileReader.propertyFileName=FilePath;
	}
	
	public String readprop(String key) throws IOException
	{
		String result="";
		
		try 
		{
			File file=new File(propertyFileName);
			
			FileInputStream  input = new FileInputStream(file);
			Properties prop=new Properties();
			prop.load(input);
			result=prop.getProperty(key);
			
	
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{			
			System.out.println("Reached");
			e.printStackTrace();
		}
		return result;
	}
}

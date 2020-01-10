package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String key) throws Throwable
	{
		Properties configProperties=new Properties();
		FileInputStream fi=new FileInputStream("D:\\Selenium_Evening\\ERP_Stock\\PropertyFile\\Environment.properties");
				configProperties.load(fi);
				return  configProperties.getProperty(key);
				
		
		
		
		
		
	}
	
	
}

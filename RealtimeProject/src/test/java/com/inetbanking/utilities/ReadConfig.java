package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public static Properties prop;
	
	public ReadConfig()
	{
	
		  prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			
				prop.load(fis);  
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	}
		
	  public String getBrowserpath()
	  {
			
		  String Browserpath=  prop.getProperty("browser");
		  return Browserpath;
	  }
	 
	  public String getusername()
	  {
		String user= prop.getProperty("username");
		return user;
	  }
	  public String getuserpass()
	  {
		 String password=prop.getProperty("password");
		 return password;
	  }
	  public String getURL()
	  {
		 String urlname= prop.getProperty("url");
		 return urlname;
	  }
	  


}

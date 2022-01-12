package com.inetbanking.testcases;



import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

import org.apache.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	ReadConfig rd=new ReadConfig();
	public String baseURL=rd.getURL();
	public String username=rd.getusername();
	public String password=rd.getuserpass();
  
	public static Logger logger;

    @Parameters("browser")
	@BeforeTest
	public void launchapp(String br)
	{
              if (br.equals("chrome"))
              {
            	  WebDriverManager.chromedriver().setup();
            	  driver=new ChromeDriver();
            	   logger=Logger.getLogger("ebanking");
            	  PropertyConfigurator.configure("Log4j.properties");
            	   }
              else if (br.equals("firefox"))
              {
            	  WebDriverManager.firefoxdriver().setup();
            	  driver=new FirefoxDriver();
            	   }
              else if (br.equals("edge"))
              {
            	  WebDriverManager.edgedriver().setup();
            	  driver=new EdgeDriver();
            	   }
              
	}

}

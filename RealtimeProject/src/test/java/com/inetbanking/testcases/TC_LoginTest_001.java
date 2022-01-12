package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest(){
	LoginPage lg=new LoginPage(driver);
	driver.get(baseURL);
	logger.info("URL is opened");
	lg.username(username);
	logger.info("Entered Username");
	lg.userpass(password);
	logger.info("Entered Password");
	lg.loginbtn();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Login Test passed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("Login test failed");
		
	}
	}

}

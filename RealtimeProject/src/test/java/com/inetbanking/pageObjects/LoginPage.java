package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver rdriver;
	
	public LoginPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")                                                                                                            
	WebElement usrname;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")                                                                                                            
	WebElement pass;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")                                                                                                            
	WebElement btnLogin;
	
	
	public void username(String name)
	{
		usrname.sendKeys(name);
	}
	
	public void userpass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void loginbtn()
	{
		btnLogin.click();
	}
}

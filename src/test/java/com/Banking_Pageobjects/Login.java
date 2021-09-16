package com.Banking_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUserName;
	

	@FindBy(name="password")
	WebElement password;
	

	@FindBy(name="btnLogin")
	WebElement btnLogin;

public void setUserName(String uname) {
	txtUserName.sendKeys(uname);
}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
}


public void clickSubmit() {
	btnLogin.click();
}



}




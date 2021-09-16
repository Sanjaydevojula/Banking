 	package com.Banking_Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking_Pageobjects.Login;

public class TC_Login_001 extends BaseClass {
	

	@Test
public void loginTest() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
		Login lp = new Login(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager")) {
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen( driver, "loginTest");
			Assert.assertFalse(false);
		}
		
	}
}


package com.PilotPay.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass 
{
	@Test
	public void loginTest() throws InterruptedException, IOException 
	{

		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("USERNAME Entered");
		lp.setPassword(password);
		logger.info("PASSWORD Entered");
		lp.clickSubmit();
		Thread.sleep(2000);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("PilotPayWeb"))
		{
			Assert.assertTrue(true);
			logger.info("LoginTest Passed");
		}
		else
		{
			captureScreen(driver, "logintest");
			Assert.assertTrue(false);
			logger.info("LoginTest Failed");
		}
	}

}


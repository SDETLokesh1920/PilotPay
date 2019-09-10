package com.PilotPay.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;
import com.PilotPay.pageObjects.PayCategoryPage;

import junit.framework.Assert;

public class TC_DeletePayCategoryTest_005 extends BaseClass
{

	@Test
	public void editPayCategory() throws InterruptedException, IOException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username provided");
		lp.setPassword(password);
		logger.info("Password provided");
		Thread.sleep(1000);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		//Deleting a Pay Category...
		PayCategoryPage deletepc=new PayCategoryPage(driver);
		deletepc.gotopaycategoriesScreen();
		logger.info("Started deleting PC....");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[contains(text(), 'TestCategory 188')]/../../../../../..//button[contains(@id, 'EDIT')]")).click();
		logger.info("Editing Pay Category..");
		deletepc.clickDelete();
		logger.info("Clicked delete PC..");
		Thread.sleep(3000);
		logger.info("Clicked accept Delete PC..");
		deletepc.clickContinue();
		Thread.sleep(3000);
		
		logger.info("Validation Started...");
		if(driver.getCurrentUrl().equals("https://dev-pilot-pay-web-core.pilotpay.yipgroup.local/#/pilotpay/pay-categories"))
		{
			Assert.assertTrue(true);
			logger.info("DeletePayCategoryTest Passed");
		}
		else 
		{
			captureScreen(driver, "updatePayCategory");
			Assert.assertTrue(false);
			logger.info("DeletePayCategoryTest Failed");	
		}		
	}	
		

}

package com.PilotPay.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;
import com.PilotPay.pageObjects.PayCategoryPage;

import junit.framework.Assert;

public class TC_UpdatePayCategoryTest_004 extends BaseClass 
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
		
		PayCategoryPage updatepc=new PayCategoryPage(driver);
		updatepc.gotopaycategoriesScreen();
		logger.info("Started editing PC....");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[contains(text(), 'TestCategory 317')]/../../../../../..//button[contains(@id, 'EDIT')]")).click();
		logger.info("ed");
		Thread.sleep(5000);
		updatepc.paycategoryName("Updated PC "+randomeNum());
		logger.info("Updated PCName....");
		updatepc.shortCode("USC"+randomeNum());
		logger.info("Updated SC....");
		updatepc.clickUnit();
		logger.info("unit");
		Thread.sleep(5000);
		updatepc.updateUnit();
		logger.info("Updated unit....");
		updatepc.clickWorkkdayPaycode();
		logger.info("Updated WDPcode....");
		Thread.sleep(5000);
		updatepc.updateWorkkdayPaycode();
		logger.info("Updated WDPcode....");
		updatepc.factorPercentage("75");
		logger.info("Updated factor....");
		updatepc.clickColor();
		updatepc.colorName("#00ff3f");
		logger.info("Updated color....");
		updatepc.clickAddNote();
		Thread.sleep(1000);
		String notename="Note "+randomeNum();
		updatepc.noteName(notename);
		logger.info("Added noteName....");
		updatepc.uclickNoteFeildType();
		Thread.sleep(5000);
		updatepc.uselectNoteFeild();
		Thread.sleep(5000);
		updatepc.uclickSaveNewNotes();
		logger.info("new Note added");
		Thread.sleep(1000);
		updatepc.clickSaveChanges();
		Thread.sleep(3000);
		
		logger.info("Validation Started...");
		if(driver.getTitle().equals("Active Categories"))
		{
			Thread.sleep(3000);
			Assert.assertTrue(true);
			logger.info("UpdatePayCategoryTest Passed");
		}
		else 
		{
			captureScreen(driver, "updatePayCategory");
			Assert.assertTrue(false);
			logger.info("UpdatePayCategoryTest Failed");	
		}
		

		
	}
	
}

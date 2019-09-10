package com.PilotPay.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;
import com.PilotPay.pageObjects.PayCategoryPage;

import junit.framework.Assert;

public class TC_CreatePayCategoryTest_003 extends BaseClass
{
	@Test
	public void addNewPayCategory() throws InterruptedException, IOException 
	{
		//Login to PiloPay...
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username provided");
		lp.setPassword(password);
		logger.info("Password provided");
		Thread.sleep(1000);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		//Creating a New Pay Category....
		PayCategoryPage createpc=new PayCategoryPage(driver);
		createpc.gotopaycategoriesScreen();
		createpc.clickCreatenewPC();
		//createpc.clickClender();
		//createpc.clickDate();
		String pcname="TestCategory "+randomeNum();
		createpc.paycategoryName(pcname);
		System.out.println(pcname);
		String pcshortcode="TC "+randomeNum();
		createpc.shortCode(pcshortcode);
		createpc.clickUnit();
		Thread.sleep(1000);
		createpc.selectUnit();
		logger.info("Unit provided");
		Thread.sleep(1000);
		createpc.selectExporttoWorkday();
		Thread.sleep(1000);
		createpc.clickWorkkdayPaycode();
		Thread.sleep(1000);
		createpc.selectWorkkdayPaycode();
		logger.info("WorkdayPaycode selected");
		createpc.factorPercentage("50");
		createpc.clickIconGrid();
		Thread.sleep(1000);
		createpc.SelectIcon();
		logger.info("Icon selected");		
		createpc.clickColor();
		createpc.colorName("#ffed00");
		logger.info("Color selected");
		createpc.clickAddNote();
		Thread.sleep(1000);
		String notename="Testnote "+randomeNum();
		createpc.noteName(notename);
		createpc.clickNoteFeildType();
		createpc.selectNoteFeild();
		createpc.clickSaveNewNotes();
		logger.info("Note added");
		Thread.sleep(1000);
		createpc.clickSaveNewCategory();
		Thread.sleep(3000);
		
		
		logger.info("Validation Started...");
		if(driver.getCurrentUrl().equals("https://dev-pilot-pay-web-core.pilotpay.yipgroup.local/#/pilotpay/pay-categories"))
		{
			Assert.assertTrue(true);
			logger.info("CreatePayCategoryTest Passed");
		}
		else 
		{
			captureScreen(driver, "addNewPayCategory");
			Assert.assertTrue(false);
			logger.info("CreatePayCategoryTest Failed");	
		}
		
					
	}

}
	
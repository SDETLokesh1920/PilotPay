package com.PilotPay.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;
import com.PilotPay.pageObjects.PayCategoryPage;

import junit.framework.Assert;

public class TC_E2EPayCategorieyTest_006 extends BaseClass
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
		
		
		//Updating a Pay Category...
		PayCategoryPage updatepc=new PayCategoryPage(driver);
		updatepc.gotopaycategoriesScreen();
		logger.info("Started editing PC....");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[contains(text(), '"+pcname+"')]/../../../../../..//button[contains(@id, 'EDIT')]")).click();
		logger.info("Editing Pay Category..");
		String upcname="UpdatedPC "+randomeNum();
		updatepc.paycategoryName(upcname);
		logger.info("Updated PCName....");
		System.out.println(upcname);
		String ushortcode="USC "+randomeNum();
		updatepc.shortCode(ushortcode);
		logger.info("Updated SC....");
		updatepc.clickUnit();
		logger.info("unit");
		Thread.sleep(2000);
		updatepc.updateUnit();
		logger.info("Updated unit....");
		updatepc.clickWorkkdayPaycode();
		logger.info("Updated WDPcode....");
		Thread.sleep(2000);
		updatepc.updateWorkkdayPaycode();
		logger.info("Updated WDPcode....");
		updatepc.factorPercentage("75");
		logger.info("Updated factor....");
		updatepc.clickColor();
		updatepc.colorName("#00ff3f");
		logger.info("Updated color....");
		updatepc.clickAddNote();
		Thread.sleep(1000);
		String unotename="Note "+randomeNum();
		updatepc.noteName(unotename);
		logger.info("Added noteName....");
		updatepc.uclickNoteFeildType();
		Thread.sleep(2000);
		updatepc.uselectNoteFeild();
		updatepc.uclickSaveNewNotes();
		logger.info("new Note added");
		Thread.sleep(3000);
		updatepc.clickSaveChanges();
		
		updatepc.clickSaveChanges();
		Thread.sleep(3000);

		logger.info("Validation Started...");
		if(driver.getCurrentUrl().equals("https://dev-pilot-pay-web-core.pilotpay.yipgroup.local/#/pilotpay/pay-categories"))
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
		
		//Deleting a Pay Category...
		PayCategoryPage deletepc=new PayCategoryPage(driver);
		deletepc.gotopaycategoriesScreen();
		logger.info("Started deleting PC....");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[contains(text(), '"+upcname+"')]/../../../../../..//button[contains(@id, 'EDIT')]")).click();
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
	
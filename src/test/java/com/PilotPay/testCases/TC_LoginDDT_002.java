package com.PilotPay.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PilotPay.pageObjects.LoginPage;
import com.PilotPay.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("USERNAME provided");
		Thread.sleep(2000);
		lp.setPassword(pwd);
		logger.info("Password provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		
		if(isErrorPresent()==true)
		{
			driver.navigate().refresh();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickSettings();
			Thread.sleep(2000);
			lp.clickSignout();
			Thread.sleep(1000);
			lp.clickSignbackin();
			driver.switchTo().defaultContent();
			
		}
	}
	
	public boolean isErrorPresent()
	{
		try 
		{
			driver.findElement(By.xpath("//p[@class='mat-text-warn text-center ng-star-inserted']"));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/PilotPay/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1,0
			}
		}
	return logindata;	
	}

}

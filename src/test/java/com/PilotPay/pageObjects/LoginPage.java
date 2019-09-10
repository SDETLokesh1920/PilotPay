package com.PilotPay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
		@FindBy(name="email")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//button[@class='mat-green mat-raised-button']")
		@CacheLookup
		WebElement btnSignin;
		
		@FindBy(xpath="//span[@class='mat-button-wrapper']//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'][contains(text(),'person')]")
		@CacheLookup
		WebElement btnSettings;
		
		@FindBy(xpath="//div[@class='mat-menu-content']")
		@CacheLookup
		WebElement dropSettings;
				
		@FindBy(xpath="//button[contains(text(),'Sign Out')]")
		@CacheLookup
		WebElement btnSignout;

		
		@FindBy(xpath="//button[@class='mat-green mat-raised-button']")
		@CacheLookup
		WebElement btnSignbackin;
		
		
		public void setUserName(String uname)
		{
			txtUserName.sendKeys(uname);
		}
		
		public void setPassword(String pswd)
		{
			txtPassword.sendKeys(pswd);
		}

		public void clickSubmit() {
			btnSignin.click();
		}
		
		public void clickSettings() {
			btnSettings.click();			
		}

		public void clickSignout() {
			btnSignout.click();
		}

		public void clickSignbackin() {
			btnSignbackin.click();
		}
		
}

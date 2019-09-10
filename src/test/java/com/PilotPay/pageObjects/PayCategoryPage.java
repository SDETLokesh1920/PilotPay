package com.PilotPay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayCategoryPage {

	WebDriver ldriver;
		public PayCategoryPage(WebDriver rdriver) 
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		@FindBy(xpath="//*[contains(text(),'Pay Categories')]//ancestor::a[1]")
		@CacheLookup
		WebElement navPayCategories;
		
		@FindBy(id="PAY_CATEGORY_ADD")
		@CacheLookup
		WebElement btnCreateNewPayCategory;
		
		@FindBy(partialLinkText="Edit")
		@CacheLookup
		WebElement clickEdit;
		
		@FindBy(id="PAY_CATEGORY_DATE_PICKER_TOGGLE")
		@CacheLookup
		WebElement drdCalender;
		
		@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-calendar-body-selected mat-calendar-body-today']")
		@CacheLookup
		WebElement slctDate;
		
		@FindBy(id="PAY_CATEGORY_NAME")
		@CacheLookup
		WebElement txtPCName;
		
		@FindBy(id="PAY_CATEGORY_NAME")
		@CacheLookup
		WebElement newPCName;
			
		@FindBy(id="PAY_CATEGORY_SHORTCODE")
		@CacheLookup
		WebElement txtShortCode;
		
		@FindBy(id="PAY_CATEGORY_SHORTCODE")
		@CacheLookup
		WebElement newShortCode;
		
		@FindBy(id="PAY_CATEGORY_UNIT")
		@CacheLookup
		WebElement drdUnit;
		
		@FindBy(xpath="//mat-select[@id='PAY_CATEGORY_UNIT']//div[@class='mat-select-arrow-wrapper']")
		@CacheLookup
		WebElement udrdUnit;
		
		@FindBy(xpath="//span[contains(text(),'Dollars')]")
		@CacheLookup
		WebElement slctUnit;
		
		@FindBy(xpath="//span[contains(text(),'Days')]")
		@CacheLookup
		WebElement updtUnit;
		
		@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
		@CacheLookup
		WebElement chbExporttoWorkday;
		
		@FindBy(id="PAY_CATEGORY_WORKDAY_PAY_CODE")
		@CacheLookup
		WebElement drdWorkdayPayCode;
		
		@FindBy(xpath="//mat-select[@id='PAY_CATEGORY_WORKDAY_PAY_CODE']//div[@class='mat-select-arrow-wrapper']")
		@CacheLookup
		WebElement udrdWorkdayPayCode;
		
		@FindBy(xpath="//span[contains(text(),'PERDIEM')]")
		@CacheLookup
		WebElement slctWorkdaypayCode;

		@FindBy(xpath="//span[contains(text(),'INSTRUCTOR')]")
		@CacheLookup
		WebElement updtWorkdaypayCode;
		
		@FindBy(id="PAY_CATEGORY_FACTOR_AMOUNT")
		@CacheLookup
		WebElement txtFactorPercentage;
		
		@FindBy(id="PAY_CATEGORY_ICON")
		@CacheLookup
		WebElement gridIconSelecter;
		
		@FindBy(xpath="//mat-grid-tile[278]//figure[1]")
		@CacheLookup
		WebElement slctIcon;
		
		@FindBy(id="PAY_CATEGORY_COLOR")
		@CacheLookup
		WebElement slctColorPallet;
		
		@FindBy(xpath="//div[@class='hex-text ng-star-inserted']//input")
		@CacheLookup
		WebElement txtColor;
		
		@FindBy(id="NOTE_ADD")
		@CacheLookup
		WebElement btnAddNote;
		
		@FindBy(id="NOTE_NAME")
		@CacheLookup
		WebElement txtNoteName;
		
		@FindBy(id="NOTE_FIELD_TYPE")
		@CacheLookup
		WebElement drdNoteType;
		
		@FindBy(xpath="//mat-select[@id='NOTE_FIELD_TYPE']//div[@class='mat-select-arrow-wrapper']")
		@CacheLookup
		WebElement udrdNoteType;
		
		@FindBy(xpath="//span[contains(text(),'FreeText')]")
		@CacheLookup
		WebElement slctNoteType;
		
		@FindBy(xpath="//span[@class='mat-option-text'][contains(text(),'FreeText')]")
		@CacheLookup
		WebElement uslctNoteType;
		
		@FindBy(id="NOTE_OK")
		@CacheLookup
		WebElement btnSaveNotes;
		
		@FindBy(xpath="//button[@id='NOTE_SAVE']")
		@CacheLookup
		WebElement ubtnSaveNotes;
		
		@FindBy(id="NEW_PAY_CATEGORY_SAVE")
		@CacheLookup
		WebElement btnSaveNew;
		
		@FindBy(id="PAY_CATEGORY_CHANGES_SAVE")
		@CacheLookup
		WebElement btnSaveChanges;
		
		@FindBy(id="PAY_CATEGORY_DELETE")
		@CacheLookup
		WebElement btnDeletePC;
		
		@FindBy(id="ALERT_CONTINUE")
		@CacheLookup
		WebElement acptDeletePC;
		
		@FindBy(xpath="//p[@class='mat-text-warn text-center ng-star-inserted']")
		@CacheLookup
		WebElement verifyTextPresent;
		
//		@FindBy(xpath="//p[@class='mat-text-warn text-center ng-star-inserted']")
//		@CacheLookup
//		WebElement verifyTextPresent;
		
		
		
		public void gotopaycategoriesScreen() {
			navPayCategories.click();
		}
				
		public void clickCreatenewPC() {
			btnCreateNewPayCategory.click();
		}

		public void editpaycategories() {
			clickEdit.click();
		}
				
		public void clickClender() {
			drdCalender.click();
		}
				
		public void clickDate() {
			slctDate.click();
		}
				
		public void paycategoryName(String pcname) {
			txtPCName.clear();
			txtPCName.sendKeys(String.valueOf(pcname));
		}
		
		public void newPCName(String upcname) {
			newPCName.clear();
			newPCName.sendKeys(String.valueOf(upcname));
		}
				
		public void shortCode(String scode) {
			txtShortCode.clear();
			txtShortCode.sendKeys(String.valueOf(scode));;
		}
		
		public void newshortCode(String ushortcode) {
			newShortCode.clear();
			newShortCode.sendKeys(String.valueOf(ushortcode));;
		}
				
		public void clickUnit() {
			drdUnit.click();
		}
		
		public void uclickUnit() {
			udrdUnit.click();
		}
		
				
		public void selectUnit() {
			slctUnit.click();
		}
		
		public void updateUnit() {
			updtUnit.click();
		}
				
		public void selectExporttoWorkday() {
			chbExporttoWorkday.click();
		}
				
		public void clickWorkkdayPaycode() {
			drdWorkdayPayCode.click();
		}
		
		public void uclickWorkkdayPaycode() {
			udrdWorkdayPayCode.click();
		}
				
		public void selectWorkkdayPaycode() {
			slctWorkdaypayCode.click();
		}

		public void updateWorkkdayPaycode() {
			updtWorkdaypayCode.click();
		}
		
		public void factorPercentage(String fpercentage) {
			txtFactorPercentage.clear();
			txtFactorPercentage.sendKeys(fpercentage);
		}
		
		public void clickIconGrid() {
			gridIconSelecter.click();
		}
		
		public void SelectIcon() {
			slctIcon.click();
		}
		
		public void clickColor() {
			slctColorPallet.click();
		}
		
		public void colorName(String colorHEX) {
			txtColor.clear();
			txtColor.sendKeys(String.valueOf(colorHEX));
		}
		
		public void clickAddNote() {
			btnAddNote.click();
		}
		
		public void noteName(String nname) {
			txtNoteName.sendKeys(nname);
		}
		
		public void clickNoteFeildType() {
			drdNoteType.click();
		}
		
		public void uclickNoteFeildType() {
			udrdNoteType.click();
		}
		
		public void selectNoteFeild() {
			slctNoteType.click();
		}
		
		public void uselectNoteFeild() {
			uslctNoteType.click();
		}
		
		public void clickSaveNewNotes() {
			btnSaveNotes.click();
		}
		
		public void uclickSaveNewNotes() {
			ubtnSaveNotes.click();
		}
				
		public void clickSaveNewCategory() {
			btnSaveNew.click();
		}

		public void clickSaveChanges() {
			btnSaveChanges.click();
		}
		
		public void clickDelete() {
			btnDeletePC.click();
		}
		
		public void clickContinue() {
			acptDeletePC.click();
		}
		
						
		
}

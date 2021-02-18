package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	//initialing page objects using page factory
	
		public HomePage() {
			PageFactory.initElements(driver,this);
		}
		
	//actions
		public void clickOnNewContactLink() {
			Actions action=new Actions(driver);
			action.moveToElement(contactsLink).build().perform();
			newContactLink.click();
		}

}

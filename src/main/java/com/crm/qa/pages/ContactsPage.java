package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;


	//initialing page objects using page factory
	
		public ContactsPage() {
			PageFactory.initElements(driver,this);
		}
		
		public void createNewContact(String title, String fname,String lname, String comp) {
			Select select=new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText(title);
			firstName.sendKeys(fname);
			lastName.sendKeys(lname);
			company.sendKeys(comp);
			saveBtn.click();
		}

}

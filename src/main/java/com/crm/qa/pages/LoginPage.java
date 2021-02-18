package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	//initialing page objects using page factory
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogoImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String psw) {
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		
		return new HomePage();
	}

}

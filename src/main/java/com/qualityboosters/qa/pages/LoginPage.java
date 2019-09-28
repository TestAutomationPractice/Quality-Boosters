package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UiPage {

	@FindBy(xpath="//*[@placeholder='username']")
	WebElement username;

	@FindBy(xpath="//*[@placeholder='password']")
	WebElement password;

	@FindBy(xpath="//*[text()='Login']")
	WebElement submitBtn;

	//Initializing the Page Objects:
	public LoginPage(){
		super();
		PageFactory.initElements(driver, this);
	}

	public void login(String un, String pwd) throws InterruptedException {
		UiPage.clickLogin();
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		Thread.sleep(3000);
	}

}

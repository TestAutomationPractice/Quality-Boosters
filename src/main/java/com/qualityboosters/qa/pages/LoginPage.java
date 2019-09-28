package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends UiPage {

	@FindBy(name="password")
	WebElement username;

	@FindBy(name="username")
	WebElement password;

	@FindBy(name="Cancel")
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
		Thread.sleep(5000); //for time being putting sleep
	}

}

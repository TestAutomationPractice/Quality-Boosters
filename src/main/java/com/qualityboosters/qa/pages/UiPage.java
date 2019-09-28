package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qualityboosters.qa.base.TestBase;

public class UiPage extends TestBase{

	@FindBy(xpath="//a[@name='Login']")
	static WebElement loginLink;

	@FindBy(xpath="//*[text()='add movie']")
	static WebElement addMovie;
	
	@FindBy(xpath="//*[text()='Logout']")
	static WebElement logout;
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public static void clickLogin() {
		loginLink.click();
	}

	public static void clickAddMovie() {
		addMovie.click();
	}

}

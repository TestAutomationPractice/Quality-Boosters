package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qualityboosters.qa.base.TestBase;

public class UiPage extends TestBase{

	@FindBy(xpath="//*[text()='Login']")
	static WebElement loginLink;

	@FindBy(xpath="//*[text()='add movie']")
	static WebElement addMovie;
	
	@FindBy(xpath="//*[text()='Logout']")
	static WebElement logout;
	
	@FindBy(xpath="//*[text()='Movies']")
	static WebElement movies;
	
	@FindBy(xpath="//*[text()='#']")
	static WebElement hash;
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public static void clickLogin() throws InterruptedException {
		hash.click();
		Thread.sleep(3000);
		loginLink.click();
	}

	public static void clickAddMovie() {
		addMovie.click();
	}

	public static void logout() {
		logout.click();
	}
	
	public static void goToMovies() {
		movies.click();
	}
}

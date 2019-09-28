package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMovie extends UiPage {

	@FindBy(name="title")
	WebElement title;

	@FindBy(name="director")
	WebElement director;

	@FindBy(name="Description")
	WebElement description;

	@FindBy(name="Cancel")
	WebElement categories;
	
	@FindBy(name="file")
	WebElement url;
	
	@FindBy(xpath="//*[text()='Save Movie']")
	WebElement saveMovie;
	
	@FindBy(xpath="//*[text()='Discard Movie']")
	WebElement discardMovie;
	
	
	//Initializing the Page Objects:
	public AddMovie(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void addMovieTitle(String title ) {
		UiPage.clickAddMovie();
		this.title.sendKeys(title);
	}
	
}

package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviesPage extends UiPage {

	//Initializing the Page Objects:
	public MoviesPage(){
		super();
		PageFactory.initElements(driver, this);
		UiPage.goToMovies();
	}

	@FindBy(xpath="//*[text()='Tere Bin Nahi Jeena Nahi']")
	WebElement movieTitle;

	public String getMovieText() {
		return movieTitle.getText();
	}

}

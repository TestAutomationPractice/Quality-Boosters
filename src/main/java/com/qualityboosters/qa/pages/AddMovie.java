package com.qualityboosters.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddMovie extends UiPage {

	@FindBy(name="title")
	WebElement title;

	@FindBy(name="director")
	WebElement director;

	@FindBy(xpath="//*[@placeholder=\"Please enter a short description of the movie\"]")
	WebElement description;

	@FindBy(name="Cancel")
	WebElement categories;

	@FindBy(name="file")
	WebElement url;

	@FindBy(xpath="//*[text()='Save Movie']")
	WebElement saveMovie;

	@FindBy(xpath="//*[text()='Discard Movie']")
	WebElement discardMovie;

	@FindBy(xpath="//*[@name='categories']")
	WebElement categorie;

	@FindBy(xpath="//*[text()='Rating']")
	WebElement ratting;

	public void selectRatting(int stars) {
		Actions action = new Actions(driver);
		int star;

		switch(stars) {
		case 1:
			star = 100;
			break;
		case 2:
			star = 150;
			break;
		case 3: 
			star =200;
			break;
		case 4:
			star = 250;
			break;
		default:
			star = 100;
			break;
		}
		action.moveToElement(ratting, star , 0).build().perform();
	}


	//Initializing the Page Objects:
	public AddMovie(){
		super();
		PageFactory.initElements(driver, this);
		UiPage.clickAddMovie();
	}

	public void addMovieTitle(String title ) {
		this.title.sendKeys(title);
	}

	public void selectCategory(String cat) {
		Select select = new Select(categorie);
		select.selectByVisibleText(cat);	
	}

	public void addMovieDetails(String title,String dir, String des, String cat, int ratting, String url) {
		this.title.sendKeys(title);
		this.director.sendKeys(dir);
		this.description.sendKeys(des);
		this.selectCategory(cat);
		this.url.sendKeys(url);
		this.selectRatting(ratting);
		this.saveMovie.click();
	}

}

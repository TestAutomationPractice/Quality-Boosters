package com.qualityboosters.qa.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qualityboosters.qa.base.TestBase;

public class AddMovieParllelTest extends TestBase {


	LoginPage loginPage;
	AddMovie addMovie;
	MoviesPage moviePage;
	
	String movieName = "Tere Bin Nahi Jeena Nahi Fir se";
	
	public AddMovieParllelTest() {
		super();
	}

	@BeforeClass
	public void init() {
		addMovie  = new AddMovie();
		moviePage = new MoviesPage();
	}

	@AfterMethod
	public void logout() {
		UiPage.logout();
	}
	
	
	@Test(priority=1)
	public void addMovieDetails() {
		addMovie.addMovieDetails(movieName, "Rohit Kumar Sahu", "Comedy Drama for Family", "Comedy", '2' , "https://urlabctest.com");
	}

	@Test(priority=2)
	public void verifyMovie() throws InterruptedException {
		loginPage.login(prop.getProperty("normalUser"), prop.getProperty("normalPwd"));
		Assert.assertEquals(moviePage.getMovieText(), movieName);
	}
	
}

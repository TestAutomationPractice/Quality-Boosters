package com.qualityboosters.qa.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qualityboosters.qa.base.TestBase;

public class AddMovieTest extends TestBase {

	LoginPage loginPage;
	AddMovie addMovie;
	
	public AddMovieTest() {
		super();
	}
	
	@BeforeClass
	public void init() {
		addMovie  = new AddMovie();
	}
	
	@Test
	public void addMovieDetails() {
		addMovie.addMovieDetails("Tere Bin Nahi Jeena", "Rohit Kumar Sahu", "Comedy Drama for Family", "Comedy", '2' , "https://urlabctest.com");
	}
	
}

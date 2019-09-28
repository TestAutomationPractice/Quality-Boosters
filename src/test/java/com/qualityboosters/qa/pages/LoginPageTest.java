package com.qualityboosters.qa.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qualityboosters.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeClass
	public void init() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void login() throws InterruptedException {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
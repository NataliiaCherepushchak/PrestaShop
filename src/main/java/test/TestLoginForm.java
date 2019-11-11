package main.java.test;

import static org.testng.Assert.*;

import io.qameta.allure.*;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.tools.OurWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestLoginForm {
	@BeforeTest
	private void setUpWebDriver(){
		OurWebDriver webDriver = new OurWebDriver();
	}
	
	@AfterTest
	private void closeWebDriver(){
		OurWebDriver.driver.quit ();
	}
	
	@Severity ( SeverityLevel.CRITICAL )
	@Description( "Verify if customer can log in" )
	@Test
	public void testLoginForm () {
		UserPage userPage = new UnlogUserInfo ().clickSignIn () .getLoginForm()
				.logIn ("admin@gmail.com", "admin" );
		String expected = "Admin admin";
		String actual = userPage.createHeader ().getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader();
		assertEquals ( actual, expected );
	}
}

package main.java.test;

import static org.testng.Assert.*;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.tools.WebDriver;
import org.testng.annotations.Test;


public class TestLoginForm {
	@Test
	public void testLoginForm () {
		WebDriver webDriver = new WebDriver ();
		UserPage userPage = new UnlogUserInfo ().clickSignIn ()
				.writeDefaultCredantials ("admin@gmail.com", "admin" );
		String expected = "Admin admin";
		String actual = userPage.createHeader ().initLogUser ().getUserAccount ();
		assertEquals ( actual, expected );
		webDriver.closeDriver ();
	}
}

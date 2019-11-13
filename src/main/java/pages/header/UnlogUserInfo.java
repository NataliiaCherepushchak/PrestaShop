package main.java.pages.header;



import main.java.pages.login.LoginPage;
import main.java.tools.OurWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class UnlogUserInfo extends LogUserInformation {

    /**
     * element signInHeaderFull on HeaderFull
     */
    private WebElement signInHeaderFull;

    /**
     * Default constructor
     */
    public UnlogUserInfo() {

        signInHeaderFull = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));

    }

    /**
     * method opens LoginForm method
     */

//    public LoginForm clickSignInHeaderFull() {
//        signInHeaderFull.click();
//        return new LoginForm();
//    }
    public LoginPage clickSignInHeaderFull() {

        signInHeaderFull.click();
       return new LoginPage ();

   }
}
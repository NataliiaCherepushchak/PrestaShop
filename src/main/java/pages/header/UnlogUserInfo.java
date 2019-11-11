package main.java.pages.header;

import main.java.pages.login.LoginForm;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class UnlogUserInfo {

    /**
     * element signInHeaderFull on HeaderFull
     */
    private WebElement signInHeaderFull;

    /**
     * Default constructor
     */
    public UnlogUserInfo() {
        signInHeaderFull = WebDriver.driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));
    }

    /**
     * method opens LoginForm method
     */
    public LoginForm clickSignInHeaderFull() {
        signInHeaderFull.click();
        return new LoginForm ();
    }
}
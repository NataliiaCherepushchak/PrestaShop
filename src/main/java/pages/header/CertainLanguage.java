package main.java.pages.header;


import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CertainLanguage {

    private WebElement language;
    private WebElement english;
    private WebElement ukrainian;
    private WebElement arrow;
    private WebElement dropDownListLanguage;
   // private final By languageLocator = By.xpath("//div[@id='_desktop_language_selector']//span[@class='expand-more']");

    public CertainLanguage() {
        initCertainLanguage();
    }

    public void initCertainLanguage() {
        getLanguage();
        getArrow();
        // return new CertainLanguage();
    }

    /**
     * method puts webElement value to the field language;
     *
     * @return language webElement.
     */
    public WebElement getLanguage() {
        language = OurWebDriver.driver.findElement(By.xpath("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        return language;
    }

    public CertainLanguage clickLanguage() {
        getLanguage().click();
        return new CertainLanguage();
    }

    //May be make a List of elements that contains 2 x languages?????///////////////////////////////

    /**
     * method puts webElement value to the field arrow;
     *
     * @return arrow.
     */
    public WebElement getArrow() {
        arrow = OurWebDriver.driver.findElement(By.xpath("//div[@id='_desktop_language_selector']//i[@class='material-icons expand-more']"));
        return arrow;
    }

    /**
     * method opens dropDown list of languages;
     */
    public void clickLanguageArrow() {
        getArrow().click();
    }

    /**
     * method puts webElement value to the field english;
     *
     * @return english webElement.
     */
    public WebElement getEnglish() {
        english = OurWebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='en']"));
        return english;
    }

    /**
     * method find english webElement in dropDown list!
     * find only when arrow is pressed.
     *
     * @return language webElement.
     */
    public CertainLanguage clickEnglishInDropDown() {
        getEnglish().click();
        return new CertainLanguage();
    }

    /**
     * method puts webElement value to the field ukrainian;
     *
     * @return ukrainian webElement.
     */
    public WebElement getUkrainian() {
        ukrainian = OurWebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='uk']"));
        return ukrainian;
    }

    /**
     * method find ukrainian webElement in dropDown list!
     * find only when arrow is pressed.
     *
     * @return language webElement.
     */

    public WebElement clickUkrainianInDropDown() {
        getUkrainian().click();
        return language;
    }

    /**
     * method puts webElement value to the dropDown list of Languages;
     *
     * @return dropDown element.
     */
    public WebElement getDropDownListLanguage() {
        dropDownListLanguage = OurWebDriver.driver.findElement(By.xpath(
                "//div[@class='language-selector dropdown js-dropdown open']//ul[@class='dropdown-menu hidden-sm-down']"));
        return dropDownListLanguage;
    }

}


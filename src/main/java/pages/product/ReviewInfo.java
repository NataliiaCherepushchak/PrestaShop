package main.java.pages.product;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 *
 */
public class ReviewInfo {

    private WebElement reviewTitle;
    private WebElement reviewDetail;
    private WebElement editButton;
    private WebElement deleteButton;

    /**
     * Default constructor
     */
    public ReviewInfo() {
        initReviewInfo();
    }


    public void initReviewInfo() {

        reviewTitle = OurWebDriver.driver.findElement(By.xpath("//p[@class='revws-review-title']"));
        reviewDetail = OurWebDriver.driver.findElement(By.xpath("//p[@class='revws-review-content']"));
        editButton = OurWebDriver.driver.findElement(By.xpath("//a[text()='Edit review']"));
        deleteButton = OurWebDriver.driver.findElement(By.xpath("//a[text()='Delete review']"));
    }

    public String getReviewTitleText() {
        return reviewTitle.getText();
    }


    public String getReviewDetailText() {
        return reviewDetail.getText();
    }


    public WebElement getButtonEditReview() {
        return editButton;
    }


    public WebElement getButtonDelete() {
        return deleteButton;
    }


    public ManageReview clickButtonEditReview(boolean isNewReview, String rating, String textTitleReview, String textDetailReview) {
        editButton.click();
        return new ManageReview(isNewReview, rating, textTitleReview, textDetailReview);
    }


    public DeleteReview clickButtonDeleteReview() {
        deleteButton.click();
        return new DeleteReview();
    }

}
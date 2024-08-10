package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//img[@class='header__logo-image']")
    WebElement freakImage;

    @FindBy(id = "deny")
    WebElement doLaterBtn;

    @FindBy(xpath = "//form[@role=\"search\"]/input[2]")
    WebElement searchBarClick;

    @FindBy(xpath = "//input[@id='boost-sd__search-bar-input']")
    WebElement searchBarEnterValue;

    @FindBy(id = "webpush-onsite")
    WebElement selectIFrame;

    @FindBy(xpath = "//a[@class='header__icon-wrapper tap-area ']")
    WebElement cartBtnOnHomepage;


    public void openWebsite(){
        driver.get("https://freakins.com/");
    }

    public Boolean isHomePageDisplayed(){
        return freakImage.isDisplayed();
    }

    public void clickOnDoLaterButton(){
        driver.switchTo().frame(selectIFrame);
        doLaterBtn.click();
        driver.switchTo().defaultContent();
    }

    public void clickOnSearchButton(){
        searchBarClick.click();
    }

    public void doSearchForShirts(String shirt){
        searchBarEnterValue.sendKeys(shirt);
    }

    public void clicksOnCartButtonInHomepage(){
        cartBtnOnHomepage.click();
    }

}

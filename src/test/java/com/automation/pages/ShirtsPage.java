package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShirtsPage extends BasePage{

    @FindBy(xpath = "//ul[@class='boost-sd__instant-search-product-list-items']//li[1]/a")
    WebElement selectShirtItem;

    @FindBy(id = "AddToCart")
    WebElement addToCartBtn;

    public void clickOnShirtItem(){
        selectShirtItem.click();
    }

    public Boolean verifyShirtsPageDisplayed(){
        return addToCartBtn.isDisplayed();
    }

    public void clickOnAddToCart(){
        addToCartBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//cart-drawer[@id='mini-cart']/header/button")));
        button.click();
    }

}
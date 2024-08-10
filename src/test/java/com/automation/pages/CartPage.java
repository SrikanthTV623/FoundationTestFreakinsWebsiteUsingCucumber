package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//p[text()='1 item']")
    WebElement cartCount;

    @FindBy(xpath = "//a[@class='quantity-selector__button'][1]")
    WebElement minusButtonInCart;

    @FindBy(xpath = "//div[@class='drawer__content drawer__content--center']/p")
    WebElement cartEmpty;

    public String verifyItemIsAddedToCart() {
        return cartCount.getText();
    }

    public void clickOnMinusButtonToRemoveItem(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement minusButtonInCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='quantity-selector__button'][1]")));
        minusButtonInCart.click();
    }

    public String verifyCartEmpty(){
        return cartEmpty.getText();
    }
}

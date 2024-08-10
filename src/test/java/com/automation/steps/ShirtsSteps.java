package com.automation.steps;

import com.automation.pages.ShirtsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShirtsSteps {
    ShirtsPage shirt = new ShirtsPage();

    @And("user select on first shirt item")
    public void userSelectOnFirstShirtItem() {
        shirt.clickOnShirtItem();
    }

    @Then("verify user is on shirt description page")
    public void verifyUserIsOnShirtDescriptionPage() {
        Assert.assertTrue("Shirt Page is not opened",shirt.verifyShirtsPageDisplayed());
    }

    @Then("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        shirt.clickOnAddToCart();
    }
}

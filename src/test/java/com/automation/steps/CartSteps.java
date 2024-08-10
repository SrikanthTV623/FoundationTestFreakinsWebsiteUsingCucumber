package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {

    CartPage cart = new CartPage();


    @Then("verify item is added into cart")
    public void verify_item_is_added_into_cart() {
        Assert.assertEquals("1 ITEM", cart.verifyItemIsAddedToCart());
    }

    @Then("verify item is added into carts")
    public void verifyItemIsAddedIntoCarts() {
        Assert.assertEquals("0 ITEM", cart.verifyItemIsAddedToCart());
    }


    @And("user remove the product in cart page")
    public void userRemoveTheProductInCartPage() {
        cart.clickOnMinusButtonToRemoveItem();
    }

    @Then("verify cart is empty")
    public void verifyCartIsEmpty() {
        Assert.assertEquals("Your cart is empty",cart.verifyCartEmpty());
    }
}

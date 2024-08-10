package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage home = new HomePage();

    @Given("user opens website")
    public void user_opens_website() {
        home.openWebsite();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue("Homepage is not loading properly",
                home.isHomePageDisplayed());
    }

    @When("user clicks on the do later button")
    public void user_clicks_on_the_do_later_button() {
        home.clickOnDoLaterButton();
    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        home.clickOnSearchButton();
    }

    @And("searches for {string}")
    public void searchesFor(String shirtKey) {
        home.doSearchForShirts(ConfigReader.getConfigValue(shirtKey));
    }

    @When("user clicks cart button which is displayed in home page")
    public void userClicksCartButtonWhichIsDisplayedInHomePage() {
        home.clicksOnCartButtonInHomepage();
    }

}

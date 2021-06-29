package com.advantageshopping.automation.stepdefinitions;

import com.advantageshopping.automation.pageobjects.SearchPage;
import com.advantageshopping.automation.steps.HomePageSteps;
import com.advantageshopping.automation.steps.RegisterPageSteps;
import com.advantageshopping.automation.steps.SearchPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class SuccessfulPurchaseStepDefinitions {
    @Steps
    HomePageSteps homePageSteps;
    @Steps
    RegisterPageSteps registerPageSteps;
    @Steps
    SearchPageSteps searchPageSteps;

    @Given("^that a web user wants to buy a product in advantage shopping$")
    public void thatAWebUserWantsToBuyAProductInAdvantageShopping() throws InterruptedException, IOException {
        homePageSteps.openBrowser();
        homePageSteps.login();
    }


    @When("^he fills all the requested fields and he follows the steps$")
    public void heFillsAllTheRequestedFieldsAndHeFollowsTheSteps() throws IOException, InterruptedException {
        homePageSteps.searchProduct();
        searchPageSteps.successfulPurchase();
    }

    @Then("^he should see the invoice data\\.$")
    public void heShouldSeeTheInvoiceData() {
    }

}

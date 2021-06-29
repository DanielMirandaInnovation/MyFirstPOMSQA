package com.advantageshopping.automation.stepdefinitions;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.steps.HomePageSteps;
import com.advantageshopping.automation.steps.RegisterPageSteps;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegisterNewUserStepDefinitions {

    DataInjection dataInjection = new DataInjection();
    @Steps
    HomePageSteps homePageSteps;
    @Steps
    RegisterPageSteps registerPageSteps;

    @Given("^that a web user wants to register in advantage shopping$")
    public void thatAWebUserWantsToRegisterInAdvantageShopping() throws InterruptedException {
        homePageSteps.openBrowser();
        homePageSteps.selectCreateNewAccount();
    }


    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() throws InterruptedException, IOException {
        registerPageSteps.registerWithExcel();
    }

    @Then("^he should see him username in the portal$")
    public void heShouldSeeHimUsernameInThePortal() throws IOException {
        registerPageSteps.registerSuccessfulValidation();
    }

    @When("^he fills all the requested fields with wrong data$")
    public void heFillsAllTheRequestedFieldsWithWrongData() throws InterruptedException {
        registerPageSteps.registerUser(dataInjection.getWrongUsername());
    }

    @But("^he shouldn't see him username in the portal$")
    public void heShouldnTSeeHimUsernameInThePortal() {

    }



}

package com.advantageshopping.automation.steps;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.pageobjects.HomePage;
import com.advantageshopping.automation.utils.Excel;
import com.advantageshopping.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Wait;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class HomePageSteps {

    Times times = new Times();
DataInjection dataInjection = new DataInjection();
Excel excel = new Excel();

    Wait wait = new Wait() {
        @Override
        public Object until(Function isTrue) {
            return null;
        }
    };

    HomePage homePage = new HomePage();
    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectCreateNewAccount() throws InterruptedException {
        homePage.clickUserMenu();
        //wait.until(ExpectedConditions.elementToBeClickable(homePage.createNewAccountOption));
        times.wait(5000);
        homePage.clickCreateNewAccountOption();
    }

    @Step
    public void login() throws InterruptedException, IOException {
        homePage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        homePage.clickUserMenu();
        homePage.setUsernameInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,0));
        homePage.setPasswordInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,2));
        times.wait(3000);
        homePage.clickSignIn();
        homePage.loginSuccessfulValidation(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameValidations(),0,0));
    }

    @Step
    public void searchProduct() throws IOException, InterruptedException {
        homePage.enter();
        times.wait(2000);
        homePage.setSearch(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameData(), 0,0));
        times.wait(2000);
        homePage.enter();
    }
}

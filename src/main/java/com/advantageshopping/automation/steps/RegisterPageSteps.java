package com.advantageshopping.automation.steps;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.pageobjects.HomePage;
import com.advantageshopping.automation.pageobjects.RegisterPage;
import com.advantageshopping.automation.utils.Excel;
import com.advantageshopping.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();
    DataInjection dataInjection = new DataInjection();
    HomePage homePage = new HomePage();
    Times times = new Times();
    Excel excel = new Excel();


    @Step
    public void registerWithExcel() throws IOException, InterruptedException {
        registerPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        registerPage.setUsernameInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,0));
        registerPage.setEmailInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,1));
        registerPage.setPasswordInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,2));
        registerPage.setPasswordConfirmInput(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,3));
        registerPage.setCity(excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameCredentials(),0,4));
        registerPage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        times.wait(2000);
        registerPage.clickAcceptTerms();
        registerPage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        times.wait(1000);
        registerPage.clickRegisterButton();
    }


    @Step
    public void registerUser(String username) throws InterruptedException {
        registerPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        registerPage.setUsernameInput(username);
        registerPage.setEmailInput(dataInjection.getSheetNameCredentials());
        registerPage.setPasswordInput(dataInjection.getSheetNameValidations());
        registerPage.setPasswordConfirmInput(dataInjection.getSheetNameData());
        registerPage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        times.wait(1000);
        registerPage.clickAcceptTerms();
        registerPage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        times.wait(1000);
        registerPage.clickRegisterButton();
    }

    @Step
    public void registerSuccessfulValidation() throws IOException {
        homePage.loginSuccessfulValidation(
                excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameValidations(), 0,0)
        );
    }
}

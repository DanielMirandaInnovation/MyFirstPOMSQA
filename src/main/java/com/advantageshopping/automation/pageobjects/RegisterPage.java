package com.advantageshopping.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

   public By usernameInput = By.name("usernameRegisterPage");
   public By emailInput = By.name("emailRegisterPage");
    public By passwordInput = By.name("passwordRegisterPage");
    public By confirmPasswordInput = By.name("confirm_passwordRegisterPage");
    public By iAgreeCheckbox = By.name("i_agree");
   public  By registerButton = By.id("register_btnundefined");
   public By city = By.name("cityRegisterPage");

    public void setUsernameInput(String string){
        getDriver().findElement(usernameInput).sendKeys(string);
    }

    public void setEmailInput(String string){
        getDriver().findElement(emailInput).sendKeys(string);
    }

    public void setPasswordInput(String string){
        getDriver().findElement(passwordInput).sendKeys(string);
    }

    public void setPasswordConfirmInput(String string){
        getDriver().findElement(confirmPasswordInput).sendKeys(string);
    }

    public void clickAcceptTerms(){
        getDriver().findElement(iAgreeCheckbox).click();
    }

    public void clickRegisterButton(){
        getDriver().findElement(registerButton).click();
    }

    public void setCity(String string){
        getDriver().findElement(city).sendKeys(string);
    }

}

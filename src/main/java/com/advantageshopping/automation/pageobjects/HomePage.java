package com.advantageshopping.automation.pageobjects;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.utils.Excel;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


@DefaultUrl("https://www.advantageonlineshopping.com/#")
public class HomePage extends PageObject {

    public By userMenu = By.id("menuUserLink");
    public By createNewAccountOption = By.xpath("//a[@class='create-new-account ng-scope']");
    public By loginSuccessful = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
    public By usernameInput = By.name("username");
    public By passwordInput = By.name("password");
    public By signInButton = By.id("sign_in_btnundefined");
    public By searchBarInput = By.id("autoComplete");
    public By searchButton = By.id("search");

    public void clickUserMenu (){
        getDriver().findElement(userMenu).click();
    }

    public void clickCreateNewAccountOption(){
        getDriver().findElement(createNewAccountOption).click();
    }

    public void loginSuccessfulValidation(String expectedString){
        assertEquals(getDriver().findElement(loginSuccessful).getText(), expectedString);
    }

    public void setUsernameInput(String string) {
        getDriver().findElement(usernameInput).sendKeys(string);
    }

    public void setPasswordInput(String string) {
        getDriver().findElement(passwordInput).sendKeys(string);
    }

    public void setSearch(String string) {
        getDriver().findElement(searchBarInput).sendKeys(string);
    }

    public void clickSignIn(){
        getDriver().findElement(signInButton).click();
    }

    public void enter(){
        getDriver().findElement(searchBarInput).sendKeys(Keys.ENTER);
    }
}

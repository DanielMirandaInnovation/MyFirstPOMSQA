package com.advantageshopping.automation.pageobjects;

import com.advantageshopping.automation.utils.Times;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SearchPage extends PageObject {
    Times times = new Times ();
    public By laptop = By.id("7");
    public By addToCartButton = By.name("save_to_cart");
    public By checkoutOption = By.id("shoppingCartLink");
    public By orderPaymentValidation = By.xpath("//h3[@class='roboto-regular sticky fixedImportant ng-scope']");
    public By nameOfProductValidation = By.xpath("(//h3[@class='ng-binding'])[last()]");
    public By checkoutButton = By.id("checkOutButton");

    public void selectLaptop() throws InterruptedException {
        getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        getDriver().findElement(laptop).click();
        getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        times.wait(1000);
        getDriver().findElement(addToCartButton).click();
        times.wait(1000);
        getDriver().findElement(checkoutOption).click();
        times.wait(1000);
        getDriver().findElement(checkoutButton).click();

    }

    public void searchValidations(String expectedString1, String expectedString2){
        getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        assertEquals(getDriver().findElement(orderPaymentValidation).getText(), expectedString1);
        assertEquals(getDriver().findElement(nameOfProductValidation).getText(),expectedString2);
    }


}

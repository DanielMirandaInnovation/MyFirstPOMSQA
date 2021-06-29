package com.advantageshopping.automation.steps;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.pageobjects.SearchPage;
import com.advantageshopping.automation.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class SearchPageSteps {
    DataInjection dataInjection = new DataInjection();
    SearchPage searchPage = new SearchPage();
    Excel excel = new Excel();

    @Step
    public void successfulPurchase() throws InterruptedException, IOException {
        searchPage.selectLaptop();
        searchPage.searchValidations(
                excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameValidations(),0,1),
                excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetNameValidations(),0,2)
                );
    }
}

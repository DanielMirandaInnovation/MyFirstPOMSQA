package com.advantageshopping.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String filepath, sheetNameCredentials, sheetNameValidations, sheetNameData, wrongUsername;
    int cellNumber, rowNumber;

    public DataInjection(){

        this.filepath = "C:\\Users\\pcc\\Desktop\\prueba2.xlsx";
        this.sheetNameCredentials = "Credentials";
        this.sheetNameValidations = faker.expression("Validations");
        this.sheetNameData = "DataInjection";
        this.wrongUsername = "sssssssssssssssasdasdsssssssssssssss";
        this.cellNumber = 0;
        this.rowNumber = 0;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getWrongUsername() {
        return wrongUsername;
    }

    public String getSheetNameCredentials() {
        return sheetNameCredentials;
    }

    public String getSheetNameValidations() {
        return sheetNameValidations;
    }

    public String getSheetNameData() {
        return sheetNameData;
    }
}

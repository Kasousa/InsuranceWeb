package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDataPage extends BasePage {

    @FindBy(css="#entervehicledata > span")
    private WebElement counterField;

    @FindBy(id="make")
    private WebElement makeField;

    @FindBy(id="model")
    private WebElement modelField;

    @FindBy(id="cylindercapacity")
    private WebElement cylinderCapacityField;

    @FindBy(id="engineperformance")
    private WebElement enginePerformanceField;

    @FindBy(id="dateofmanufacture")
    private WebElement dateOfManufactureField;

    @FindBy(id="numberofseats")
    private WebElement numberOfSeatsField;

    @FindBy(css="#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span")
    private WebElement RightHandDriveYes;

    @FindBy(css="#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span")
    private WebElement RightHandDriveNo;

    @FindBy(id="numberofseatsmotorcycle")
    private WebElement numberOfSeatsMotorcycleField;

    @FindBy(id="fuel")
    private WebElement fuelTypeField;

    @FindBy(id="payload")
    private WebElement payloadField;

    @FindBy(id="totalweight")
    private WebElement totalWeightField;

    @FindBy(id="listprice")
    private WebElement listPriceField;

    @FindBy(id="licenseplatenumber")
    private WebElement licensePlateNumberField;

    @FindBy(id="annualmileage")
    private WebElement annualMileageField;

    @FindBy(id="nextenterinsurantdata")
    private WebElement btnNext;

    public VehicleDataPage (WebDriver driver) {
        super(driver);
    }

    public void writeMake (String value) { write (makeField, value); }
    public void writeModel (String value) { write (modelField, value); }
    public void writeCylinderCapacity (String value) { write (cylinderCapacityField, value); }
    public void writeEnginePerformance (String value) { write (enginePerformanceField, value); }
    public void writeDateOfManufacture (String value) { write (dateOfManufactureField, value); }
    public void writeNumberOfSeats (String value) { write (numberOfSeatsField, value); }
    public void writeNumberOfSeatsMotorcycle (String value) { write (numberOfSeatsMotorcycleField, value); }
    public void writeFuelType (String value) { write (fuelTypeField, value); }
    public void writePayload (String value) { write (payloadField, value); }
    public void writeTotalWeight (String value) { write (totalWeightField, value); }
    public void writelistPrice (String value) { write (listPriceField, value); }
    public void writelicensePlateNumber (String value) { write (licensePlateNumberField, value); }
    public void writeAnnualMileage (String value) { write (annualMileageField, value); }

    public void clickRightHandDriveYes () {  click(RightHandDriveYes); }
    public void clickRightHandDriveNo () {  click(RightHandDriveNo); }
    public void clickNext () {  click(btnNext); }

    public String getCounter () { return getText(counterField); }
}
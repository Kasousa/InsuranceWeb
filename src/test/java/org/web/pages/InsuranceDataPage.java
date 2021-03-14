package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceDataPage extends BasePage {

    @FindBy(css="#enterinsurantdata > span")
    private WebElement counterField;

    @FindBy(id="firstname")
    private WebElement firstNameField;

    @FindBy(id="lastname")
    private WebElement lastNameField;

    @FindBy(id="birthdate")
    private WebElement dateOfBirthField;

    @FindBy(css="#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span")
    private WebElement btnMale;

    @FindBy(css="#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span")
    private WebElement btnFemale;

    @FindBy(id="streetaddress")
    private WebElement streetAddressField;

    @FindBy(id="country")
    private WebElement countryField;

    @FindBy(id="zipcode")
    private WebElement ZIPCodeField;

    @FindBy(id="city")
    private WebElement cityField;

    @FindBy(id="occupation")
    private WebElement occupationField;

    @FindBy(css="#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
    private WebElement btnSpeeding;

    @FindBy(id="website")
    private WebElement websiteField;

    @FindBy(id="nextenterproductdata")
    private WebElement btnNext;

    public InsuranceDataPage(WebDriver driver) {
        super(driver);
    }

    public void writeFirstName (String firstName) { write (firstNameField, firstName); }
    public void writeLastName (String lastName) { write (lastNameField, lastName); }
    public void writeDateOfBirth (String dateOfBirth) { write (dateOfBirthField, dateOfBirth); }
    public void writeStreetAddress (String streetAddress) { write (streetAddressField, streetAddress); }
    public void writeCountry (String country) { write (countryField, country); }
    public void writeZIPCode (String ZIPCode) { write (ZIPCodeField, ZIPCode); }
    public void writeCity (String city) { write (cityField, city); }
    public void writeOccupation (String occupation) { write (occupationField, occupation); }
    public void writeWebsite (String website) { write (websiteField, website); }

    public void clickMale () { click (btnMale); }
    public void clickFemale () { click (btnFemale); }
    public void clickSpeeding () { click (btnSpeeding); }
    public void clickNext () { click (btnNext); }

    public String getCounter () { return getText (counterField); };
}
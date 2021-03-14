package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDataPage extends BasePage {

    @FindBy(css="#enterproductdata > span")
    private WebElement counterField;

    @FindBy(id="startdate")
    private WebElement startDateField;

    @FindBy(id="insurancesum")
    private WebElement insuranceSumField;

    @FindBy(id="meritrating")
    private WebElement meritRatingField;

    @FindBy(id="damageinsurance")
    private WebElement damageInsuranceField;

    @FindBy(css="#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
    private WebElement btnEuroProtection;

    @FindBy(id="courtesycar")
    private WebElement courtesyCarField;

    @FindBy(id="nextselectpriceoption")
    private WebElement btnNext;

    public ProductDataPage(WebDriver driver) {
        super(driver);
    }

    public void writeStartDate (String startDate) { write(startDateField, startDate); }
    public void writeInsuranceSum (String insuranceSum) { write(insuranceSumField, insuranceSum); }
    public void writeMeritRating (String meritRating) { write(meritRatingField, meritRating); }
    public void writeDamageInsurance (String damageInsurance) { write(damageInsuranceField, damageInsurance); }
    public void writeCourtesyCar (String courtesyCar) { write(courtesyCarField, courtesyCar); }

    public void clickEuroProtection () {click (btnEuroProtection); }
    public void clickNext () {click (btnNext); }

    public String getCounter () { return getText (counterField); }
}
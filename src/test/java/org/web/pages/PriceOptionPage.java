package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceOptionPage extends BasePage {

    @FindBy(css="#selectpriceoption > span")
    private WebElement counterField;

    @FindBy(css="#priceTable > tfoot > tr > th.group > label:nth-child(1) > span")
    private WebElement btnSilverOption;

    @FindBy(css="#priceTable > tfoot > tr > th.group > label:nth-child(2) > span")
    private WebElement btnGoldOption;

    @FindBy(css="#priceTable > tfoot > tr > th.group > label:nth-child(3) > span")
    private WebElement btnPlatinumOption;

    @FindBy(css="#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")
    private WebElement btnUltimateOption;

    @FindBy(id="nextsendquote")
    private WebElement btnNext;

    public PriceOptionPage(WebDriver driver) {
        super(driver);
    }

    public void clickSilverOption () { click (btnSilverOption); }
    public void clickGoldOption () { click (btnGoldOption); }
    public void clickPlatinumOption () { click (btnPlatinumOption); }
    public void clickUltimateOption () { click (btnUltimateOption); }
    public void clickNext () { click (btnNext); }

    public String getCounter () { return getText (counterField); }
}
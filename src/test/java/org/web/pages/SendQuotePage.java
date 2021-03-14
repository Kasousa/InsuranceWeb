package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendQuotePage extends BasePage {

    @FindBy(css="#sendquote > span")
    private WebElement counterField;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="phone")
    private WebElement phoneField;

    @FindBy(id="username")
    private WebElement usernameField;

    @FindBy(id="password")
    private WebElement passwordField;

    @FindBy(id="confirmpassword")
    private WebElement confirmPasswordField;

    @FindBy(id="Comments")
    private WebElement commentsField;

    @FindBy(id="sendemail")
    private WebElement btnSend;

    @FindBy(css="body > div.sweet-alert.showSweetAlert.visible > h2")
    private WebElement confirmationStatus;

    public SendQuotePage(WebDriver driver) {
        super(driver);
    }

    public void writeEmail (String email) { write (emailField, email); }
    public void writePhone (String phone) { write (phoneField, phone); }
    public void writeUsername (String username) { write (usernameField, username); }
    public void writePassword (String password) { write (passwordField, password); }
    public void writeConfirmPassword (String confirmPassword) { write (confirmPasswordField, confirmPassword); }
    public void writeComments (String comments) { write (commentsField, comments); }

    public void clickSend () { click (btnSend); }

    public String getCounter () { return getText (counterField); }
    public String getConfirmationStatus () { return getText (confirmationStatus); }
}
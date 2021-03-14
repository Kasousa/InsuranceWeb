package org.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.web.actions.WriteActions;

public class BasePage extends WriteActions {

    public BasePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

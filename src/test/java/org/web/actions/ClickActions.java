package org.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class ClickActions extends BaseActions{
    private static Logger logger = Logger.getLogger(ClickActions.class.getName());

    // Metódo que checa a presença do elemento e depois realiza o clique
    public void click (WebElement element) {
        try {
            logger.info ("clicando no elemento " + element.toString());
            if (element.isDisplayed()) element.click();
        } catch (Exception e) {
            logger.info("Não foi possivel clicar no elemento " + e.getMessage());
        }
    }
}

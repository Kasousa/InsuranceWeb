package org.web.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class WriteActions extends ReadActions {

    private static Logger logger = Logger.getLogger(WriteActions.class.getName());

    // Metódo que checa a presença do elemento e depois escreve nele
    public void write (WebElement element, String value) {
        try {
            logger.info ("Enviando texto: " + value + " ao elemento: " + element.toString());
            if (element.isDisplayed()) element.sendKeys(value);
        } catch (Exception e) {
            logger.info("Não foi possivel enviar o texto ao elemento " + e.getMessage());
        }
    }
}

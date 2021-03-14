package org.web.actions;

import org.openqa.selenium.WebElement;
import java.util.logging.Logger;

public class ReadActions extends ClickActions{
    private static Logger logger = Logger.getLogger(ReadActions.class.getName());

    // Metódo que checa a presença do elemento e depois retorna seu texto
    public String getText (WebElement element) {
        try {
            logger.info ("Lendo texto no elemento: " + element.toString());
            if (element.isDisplayed())  return element.getText();
        } catch (Exception e) {
            logger.info("Não foi possivel recuperar o texto no elemento " + e.getMessage());
        }
        return "";
    }
}

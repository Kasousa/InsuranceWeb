package org.web.actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import static org.web.support.ThreadDriver.getTDriver;

public class BaseActions {
    public WebDriverWait wait15;
    public WebDriverWait wait4;

    public BaseActions(){
        wait15 = new WebDriverWait(getTDriver(),15);
        wait4 = new WebDriverWait(getTDriver(), 4);
    }
}

package org.web.support;

import org.openqa.selenium.WebDriver;

public class ThreadDriver {

    private static ThreadLocal<WebDriver> _driver = new ThreadLocal<>();

    public synchronized static void setTDriver (WebDriver driver) { _driver.set(driver); }

    public synchronized static WebDriver getTDriver () { return _driver.get(); }

}
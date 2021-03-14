package org.web.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.web.support.ConfigFileReader;

import java.util.concurrent.TimeUnit;

import static org.web.support.ThreadDriver.getTDriver;
import static org.web.support.ThreadDriver.setTDriver;

public class BaseStep {
    WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(ConfigFileReader.getInstance().getTimeoutElements(), TimeUnit.SECONDS);
        driver.get(ConfigFileReader.getInstance().getBaseUrl());
        setTDriver(driver);
    }

    @After
    public void afterScenario() {
        getTDriver().close();
    }
}

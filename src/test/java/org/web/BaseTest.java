package org.web;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/web/features",
        glue = "org.web.steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class BaseTest {
}

package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        dryRun = false
)
public class Runner  extends AbstractTestNGCucumberTests {
}

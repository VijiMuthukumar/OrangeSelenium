package runnerB;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features//Login.feature",
		glue = {"stepDefinition"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Automation.html", "pretty", "json:target/cucumber-reports/Automation.json"},
		tags= {"@login"},
		monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}

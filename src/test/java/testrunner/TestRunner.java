package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-html-report"},
		features ="src\\main\\java\\Features\\test.feature",
        glue = {"stepDefinitions"},
        tags = {"@MainUITests"},
        dryRun = false,
		monochrome = true
        
)
public class TestRunner {

	
	

	
	
}
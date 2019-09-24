package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//Excel Test Runner 

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-html-report"},
		features ="src\\main\\java\\Features\\ExcelTest.feature",
        glue = {"stepDefinitions"},
        tags = {"@ExcelTest"},
        dryRun = false,
		monochrome = true
        
)
public class ExcelTestRunner {

	
	
	
	
}
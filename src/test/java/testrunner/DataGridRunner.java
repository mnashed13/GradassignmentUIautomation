package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


// DataGrid test Runner 


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-html-report"},
		features ="src\\main\\java\\Features\\DataGrid.feature",
        glue = {"stepDefinitions"},
        tags = {"@FireFoxBrowserDatagridTest"},
        dryRun = false,
		monochrome = true
        
)
public class DataGridRunner {

	
	

	
	
	
}
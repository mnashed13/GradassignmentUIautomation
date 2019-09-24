package co.testerpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomepageTest {
	WebDriver driver;
	
	public HomepageTest(WebDriver driver) {
			this.driver=driver;
}
	@Test
	public void HomePageTitleTest() throws InterruptedException{
		  String expectedTitle = "Personal & Business Insurance - QBE Insurance | QBE AU";
		  String actualTitle = driver.getTitle();
		  System.out.println("Title is correct");
	  }
	
	
	}

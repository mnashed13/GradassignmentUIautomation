package co.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class GreenSlipUItest {
	WebDriver driver;
	
	public GreenSlipUItest(WebDriver driver){
		this.driver = driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Car & Vehicle')]")
	@CacheLookup
		WebElement CarButton;

	
	
	public void GreenSlipPress() throws InterruptedException {
		Thread.sleep(4000);
		CarButton.click();
		Thread.sleep(4000);
		
		
	}
	
}

package co.uipackage;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;


public class GreenslipQuote {
	WebDriver driver;

	public GreenslipQuote(WebDriver driver) {
		this.driver=driver;
}
	
	@FindBy(how=How.CSS,using="#button_get-quote")
	@CacheLookup
		WebElement GreenSlipQuiteButton;

	

	
	
	public void GreenSlipButtonPress() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Button click started");
		 GreenSlipQuiteButton.click();
		System.out.println("button click worked");
		Thread.sleep(3000);

	}

	
	
	
	
	
	
}
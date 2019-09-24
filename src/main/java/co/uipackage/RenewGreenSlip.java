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


public class RenewGreenSlip {
	WebDriver driver;

	public RenewGreenSlip(WebDriver driver) {
		this.driver=driver;
}
	
	@FindBy(how=How.CSS,using="li:nth-child(2) .action-bar__text")
	@CacheLookup
		WebElement GreenslipButton;

	
	

	
	
	public void RenewGreenSlip() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Button click started");
		GreenslipButton.click();
		System.out.println("button click worked");
		Thread.sleep(3000);

	}
	
	
	public void VerifyTextTest() throws InterruptedException{
		System.out.println("Starting to verify Text");
//		driver.findElement(By.xpath("//h2[contains(text(),'Compulsory Third Party NSW Green Slip Insurance')])"));
		if(driver.getPageSource().contains("Compulsory Third Party NSW Green Slip Insurance")) {
			System.out.println("this text is present");
		}else {
			System.out.println("This text is not present");
		}
		
		
	}
	
}
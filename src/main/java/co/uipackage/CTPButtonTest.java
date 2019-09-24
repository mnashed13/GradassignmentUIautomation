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


public class CTPButtonTest {
	WebDriver driver;

	public CTPButtonTest(WebDriver driver) {
		this.driver=driver;
}
	

	@FindBy(how=How.CSS,using=".c-mega-menu__dropdown:nth-child(1) .list-group-item:nth-child(2) > .hyperlink")
	@CacheLookup
		WebElement CTP;
	@FindBy(how=How.CSS,using=".c-columnContent__content:nth-child(1) > .c-columnContent__buttonContent:nth-child(2) > .c-columnContent__hyperlink")
	@CacheLookup
		WebElement FindOut;
	
	
	
	
	
	
	
	public void CTPButtonWordpress() throws InterruptedException {
		
		Thread.sleep(3000);
		CTP.click();
		System.out.println("CTP Button Click Worked");
		Thread.sleep(3000);
		FindOut.click();
		System.out.println("Find Out more button Click Worked");
		
	}
	}
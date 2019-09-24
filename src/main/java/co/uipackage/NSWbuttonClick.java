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


public class NSWbuttonClick {
	WebDriver driver;

	public NSWbuttonClick(WebDriver driver) {
		this.driver=driver;
}
	

	
	@FindBy(how=How.CSS,using="//ul[@id='actionbar']/li[2]/a/div[2]/h4/span")
	@CacheLookup
		WebElement FindOut;
	
	
	
	
	
	
	
	public void NSWButtonWordpress() throws InterruptedException {
		
		
		Thread.sleep(3000);
		FindOut.click();
		System.out.println("Find Out more button Click Worked");
		Thread.sleep(3000);
	}
	}
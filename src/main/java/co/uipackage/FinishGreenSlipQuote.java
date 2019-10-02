package co.uipackage;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FinishGreenSlipQuote {
	WebDriver driver;

	public FinishGreenSlipQuote(WebDriver driver) {
		this.driver=driver;
	
}
	
	@FindBy(how=How.CSS,using=".glyphicon-chevron-right")
	@CacheLookup
		WebElement FinishButtonClick;	
	
	
	public void FinalQuoteCheck() throws InterruptedException {
		WebElement FinalQuote= driver.findElement(By.cssSelector("div.container:nth-child(6) div.qbe-content:nth-child(6) div.row div.col-sm-5 span.qbe-insert-offer-box div.panel.panel-default.panel-standout div.panel-body:nth-child(1) div.visible-md-block.visible-lg-block > span:nth-child(1)"));
		String innerText= FinalQuote.getText();
		System.out.println("The Final Quote is " + innerText);
		Thread.sleep(3000);
		
	}
	
	public void FinishButtonWordpress() throws InterruptedException {
		
		Thread.sleep(3000);
		FinishButtonClick.click();
		Thread.sleep(3000);
//		driver.close();
		
		 
	}
	
}
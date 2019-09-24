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


public class DetailsPageTest {
	WebDriver driver;

	public DetailsPageTest(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(how=How.CSS,using="#q1 .radio:nth-child(1) > label")
	@CacheLookup
		WebElement TypeOfCustomerButtonClick;	
	@FindBy(how=How.CSS,using="#q2 .radio:nth-child(1) .qbe-action-radio")
	@CacheLookup
		WebElement DurationOfInsurance;	

	@FindBy(how=How.CSS,using="#q3 .radio:nth-child(2) .qbe-action-radio")
	@CacheLookup
		WebElement TaxCredit;

	@FindBy(how=How.CSS,using="#dob")
	@CacheLookup
		WebElement DateOfBirth;
	
	
	@FindBy(how=How.CSS,using="#q5 .radio:nth-child(2) .qbe-action-radio")
	@CacheLookup
		WebElement DriverAge;
	
	@FindBy(how=How.CSS,using="#button_forward")
	@CacheLookup
		WebElement Continue;
	
	
	

	
	public void PersonalDetailFormInputs(String use) throws InterruptedException {
		TypeOfCustomerButtonClick.click();
		Thread.sleep(3000);
		 DurationOfInsurance.click();
		 Thread.sleep(3000);
		 TaxCredit.click();
		 Thread.sleep(3000);
		 DateOfBirth.sendKeys(use);
		 Thread.sleep(3000);
		 DriverAge.click();
		 Thread.sleep(3000);
		 Continue.click();
		 Thread.sleep(3000);
		 
	}
	
	public void isElementPresent1() { // positive test case
	if(isElementPresent1(By.cssSelector("#button_forward")))
	System.out.println("The element present");
	else
	System.out.println("this element is missing");
	 

	if(driver.findElements(By.id("button_forward")).size()>0)
	 
	{
	   System.out.println("The element present");
	}else
	{
	   System.out.println("this element is missing");
	}
	}

	private boolean isElementPresent1(By cssSelector) {
		// TODO Auto-generated method stub
		return false;
	}
}
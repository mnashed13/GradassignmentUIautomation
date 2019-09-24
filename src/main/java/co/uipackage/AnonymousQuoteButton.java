package co.uipackage;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class AnonymousQuoteButton {
	WebDriver driver;

	public AnonymousQuoteButton(WebDriver driver) {
		this.driver=driver;
}
	
	@FindBy(how=How.CSS,using=".radio:nth-child(3) b")
	@CacheLookup
		WebElement QuoteRadioButton;
	@FindBy(how=How.CSS,using="#form-3 > #rms_vehicle_origin_group #rms_vehicle_origin")
	@CacheLookup
		WebElement FormButton1;
	@FindBy(how=How.CSS,using="#form-3_start_date")
	@CacheLookup
		WebElement InsuranceStartDateButton;
	@FindBy(how=How.CSS,using="#form-3_start_date")
	@CacheLookup
		WebElement SubmitDate;
	
	@FindBy(how=How.CSS,using="#form-3 #btn_continue")
	@CacheLookup
		WebElement ContinueButton;
	
	
	
	
	
	public void RadioButtonPress(String pass) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Button click started");
		QuoteRadioButton.click();
		System.out.println("button click worked");
		Select Formbutton1 = new Select(FormButton1);
		Formbutton1.getOptions().get(1).click();
		Thread.sleep(3000);
		InsuranceStartDateButton.sendKeys(pass);
		Thread.sleep(3000);
		SubmitDate.sendKeys(Keys.RETURN);
		System.out.println("input values for start date");
		Thread.sleep(3000);
		ContinueButton.click();
	}
	
	
	
	
	
	
	public void TitleTest() throws InterruptedException {
		String ExpectedTitle =  "QBE Insurance Group - NSW Green Slips";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		System.out.println("The Title on this page is correct");
		
		
		
		
		
		
		
	}
	
	
	
}
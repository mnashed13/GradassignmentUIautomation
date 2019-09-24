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


public class VehicleScreenDetails {
	WebDriver driver;

	public VehicleScreenDetails(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(how=How.CSS,using="#a1")
	@CacheLookup
		WebElement YearOfManufactureButtonclick;	
	@FindBy(how=How.CSS,using="#a1")
	@CacheLookup
		WebElement YearOfManufactureButton;	
//	dropdown 
	@FindBy(how=How.CSS,using="#a2")
	@CacheLookup
		WebElement MakeOfVehicleButton;
// dropdown	
	@FindBy(how=How.CSS,using="#a3")
	@CacheLookup
		WebElement VehicleShape;
// dropdown
	@FindBy(how=How.CSS,using="#a4")
	@CacheLookup
		WebElement VehicleUsage;
// dropdown	
	@FindBy(how=How.CSS,using="#a5")
	@CacheLookup
		WebElement postcode;
	
	@FindBy(how=How.CSS,using="#button_forward")
	@CacheLookup
		WebElement Continue;
	

	
	
	public void DetailFormInputs(String use) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("input detail teststarted ");
		YearOfManufactureButton.sendKeys(use);
		Thread.sleep(5000);
		System.out.println("input detail test success");
		System.out.println("check for button click");
		MakeOfVehicleButton.click();
		Select  MakeOfVehicleBtn = new Select(MakeOfVehicleButton);
		MakeOfVehicleBtn.getOptions().get(1).click();
		System.out.println("This test worked");
		Thread.sleep(5000);
		Select  VehicleShapeBtn = new Select(VehicleShape);
		VehicleShapeBtn.getOptions().get(4).click();
		Thread.sleep(5000);
		Select  VehicleUsageBtn = new Select(VehicleUsage);
		VehicleUsageBtn.getOptions().get(1).click();
		Thread.sleep(5000);
		Select  postcodeBtn = new Select(postcode);
		postcodeBtn.getOptions().get(2).click();
		Thread.sleep(5000);
		Continue.click();
		Thread.sleep(5000);
	
	}
	
	

	
}
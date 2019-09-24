package co.uipackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import co.ExcelDataPackage.ReadExcelData;





public class VehicleScreenDetailExcelSheetParamterization{
	WebDriver driver;
	public void ExcelSheet1() {
		ReadExcelData reader = new ReadExcelData("C:\\Users\\798014\\eclipse-workspace\\GradAssignmentSelenium\\src\\main\\java\\co\\ExcelDataPackage\\SeleniumQBEValues.xlsx");
		int rowCount = reader.getRowCount("DataValues");
		for (int rowNum = 2;rowNum <= rowCount; rowNum++) {
		 String Year = reader.getCellData("DataValues", "Year", rowNum);
		 System.out.println(Year);
		 String Make = reader.getCellData("DataValues", "Make", rowNum);
		 System.out.println(Make);
		 String Shape = reader.getCellData("DataValues", "Shape", rowNum);
		 System.out.println(Shape);
		 String Usage = reader.getCellData("DataValues", "Usage", rowNum);
		 System.out.println(Usage);
		 String postcodeData = reader.getCellData("DataValues", "PostCode", rowNum);
		 System.out.println(postcodeData);
// webElement 
			WebElement YearElement = driver.findElement(By.cssSelector("#a1"));
			YearElement.sendKeys(Year);
			WebElement MakeOfVehicleButton = driver.findElement(By.cssSelector("#a2"));
			Select  MakeOfVehicleBtn = new Select(MakeOfVehicleButton);
			MakeOfVehicleBtn.selectByVisibleText(Make);
			
			WebElement VehicleShape = driver.findElement(By.cssSelector("#a3"));
			Select  ShapeOfVechileBtn = new Select(VehicleShape);
			ShapeOfVechileBtn.selectByVisibleText(Shape);
			
			WebElement VehicleUsage = driver.findElement(By.cssSelector("#a4"));
			Select   VehicleUsageBtn = new Select(VehicleUsage);
			VehicleUsageBtn.selectByVisibleText(Usage);
			
			WebElement postcode = driver.findElement(By.cssSelector("#a5"));
			Select   postcodeBtn = new Select(postcode);
			postcodeBtn.selectByVisibleText(postcodeData);
			WebElement ContinueBtn = driver.findElement(By.cssSelector("#button_forward"));
			ContinueBtn.click();
		}

	}
	
	@FindBy(how=How.CSS,using="#a1")
	@CacheLookup
		WebElement YearElement;
	
	@FindBy(how=How.CSS,using="#a2")
	@CacheLookup
		WebElement MakeofVehicleBtn;
	
	@FindBy(how=How.CSS,using="#a3")
	@CacheLookup
		WebElement ShapeOfVechileBtn;
	
	@FindBy(how=How.CSS,using="#a4")
	@CacheLookup
		WebElement VehicleUsageBtn;
	
	@FindBy(how=How.CSS,using="#a5")
	@CacheLookup
		WebElement postcodeBtn;
	
	@FindBy(how=How.CSS,using="#button_forward")
	@CacheLookup
		WebElement ContinueBtn;

	
	public void VehicleScreenDetailTestPress(String Year,String Make,String Shape,String Usage, String Postcode) {
	
		YearElement.sendKeys(Year);
		((Select) MakeofVehicleBtn).selectByVisibleText(Make);
		((Select) ShapeOfVechileBtn).selectByVisibleText(Shape);
		((Select) VehicleUsageBtn).selectByVisibleText(Usage);
		((Select) VehicleUsageBtn).selectByVisibleText(Postcode);
		ContinueBtn.click();
	}
	
}




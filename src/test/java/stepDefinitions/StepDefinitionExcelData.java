package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import co.ExcelDataPackage.ReadExcelData;
import co.testerpackage.HomepageTest;
import co.uipackage.AnoymousQuoteButtonTestDataGrid;
import co.uipackage.CTPButtonTest;
import co.uipackage.DetailPageTestDataGridTest;
import co.uipackage.FinishGreenSlipQuote;
import co.uipackage.GreenslipQuote;
import co.uipackage.MenuUITest;
import co.uipackage.NumberOfLinksTest;
import co.uipackage.RenewGreenSlip;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionExcelData {
	public WebDriver driver;
	@Given("^that this is a Excel Test the console will show this$")
	public void ExcelSheettestStart() throws Throwable{
		System.out.println("This is a Excel Sheet Paramertization test has started");
	}
	@Then("^the user will open the browser again and go the qbe homepage for the Excel test$")
	public void BrowserOpenExcelSheetTest() throws Throwable{
		System.out.println("Browser has opened ");
		System.out.println("The Test has started");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");					     
		driver = new ChromeDriver();
		System.out.println("Chrome browser has started");
		driver.get("https://www.qbe.com/au");	
	}
	@When("^I am on the homepage and click on Car and vehicle in the menu bar for the Excel test$")
	public void CarAndVehcileClickExcelTest() throws Throwable{
		NumberOfLinksTest MenuCount = PageFactory.initElements(driver, NumberOfLinksTest.class);
		MenuCount.MenuLinkCountTest();
		HomepageTest HomePageTitleTest = PageFactory.initElements(driver, HomepageTest.class);
		HomePageTitleTest.HomePageTitleTest();
		System.out.println("title verfication worked");
		MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
		MenuUI.MenuUIWordpress();
		System.out.println("menu button click worked");	
	}
	@Then("^when I arrive to the drop down menu where we can click on the CTP Button for the excel test$")
	public void dropdownMenuExcelTest() throws Throwable{
		CTPButtonTest CTPButtontest = PageFactory.initElements(driver, CTPButtonTest.class);
		CTPButtontest.CTPButtonWordpress();
		System.out.println("CTP button worked");
	}
	@Given("^the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the excel test$")
	public void RenewGreenslipExcelSheetTest() throws Throwable{
		RenewGreenSlip GreenslipTest = PageFactory.initElements(driver, RenewGreenSlip.class);
		GreenslipTest.RenewGreenSlip();	
		System.out.println("GreenSlip test works");
		GreenslipTest.VerifyTextTest();
		System.out.println("Heading has been Verified");
		
		
	}
	
//	@Then("^the user should click on get a greenslip quote for the excel test$")
//	public void GreenslipQuoteButtonExcelSheetTest()throws Throwable{
//		GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
//		GreenslipTest.GreenSlipButtonPress();
//		System.out.println("GreenSlip Button test works");	
//	}

//	
//	@Then ("^the user should click on the radio button that says anonymous quote for the excel test$")
//	public void anonymousQuoteButtonclickExcelTest() throws Throwable{
//		AnoymousQuoteButtonTestDataGrid Quotebutton = PageFactory.initElements(driver,AnoymousQuoteButtonTestDataGrid.class);
//		Quotebutton.RadioButtonPress("12/12/2019");
//		System.out.println("this is where the data input test will start");
//		System.out.println("We were able to get the data from table");
//		Quotebutton.RadioButtonPress2();
//		System.out.println("Radio Button test works");
//		Quotebutton.TitleTest();
//		System.out.println("The title on this page is correct");
//		
//	}

//	@Then ("^the user should input all the nessary details in the Vechile Screen they include the excel as a \"([^\\\"]*)\" and click Continue for the excel test$")
//	public void vehicledetailsScreen(String args1) throws Throwable{
//		ReadExcelData reader = new ReadExcelData("C:\\Users\\798014\\eclipse-workspace\\GradAssignmentSelenium\\src\\main\\java\\co\\ExcelDataPackage\\SeleniumQBEValues.xlsx");
//		String YearValue = reader.getCellData("DataValues", "Year", 2);
//		WebElement Year = driver.findElement(By.cssSelector("#a1"));
//		Year.sendKeys(YearValue);
//		
//		WebElement MakeOfVehicleButton = driver.findElement(By.cssSelector("#a2"));
//		String Make = reader.getCellData("DataValues", "Make", 2);
//		Select  MakeOfVehicleBtn = new Select(MakeOfVehicleButton);
//		MakeOfVehicleBtn.selectByVisibleText(Make);
//		
//		WebElement VehicleShape = driver.findElement(By.cssSelector("#a3"));
//		String Shape = reader.getCellData("DataValues", "Shape", 2);
//		Select  ShapeOfVechileBtn = new Select(VehicleShape);
//		ShapeOfVechileBtn.selectByVisibleText(Shape);
//		
//		WebElement VehicleUsage = driver.findElement(By.cssSelector("#a4"));
//		String Usage = reader.getCellData("DataValues", "Usage", 2);
//		Select   VehicleUsageBtn = new Select(VehicleUsage);
//		VehicleUsageBtn.selectByVisibleText(Usage);
//		
//		WebElement postcode = driver.findElement(By.cssSelector("#a5"));
//		String postcodeData = reader.getCellData("DataValues", "PostCode", 2);
//		Select   postcodeBtn = new Select(postcode);
//		postcodeBtn.selectByVisibleText(postcodeData);
//		
//		
//
//		String YearValue2 = reader.getCellData("DataValues", "Year", 3);
//		WebElement Year2 = driver.findElement(By.cssSelector("#a1"));
//		Year2.sendKeys(YearValue2);
//		
//				
//		WebElement ContinueBtn = driver.findElement(By.cssSelector("#button_forward"));
//		ContinueBtn.click();
//	}
	
	@Then ("^the user should input all the nessary details in the Vechile Screen they include the excel as a \"([^\\\"]*)\" and click Continue for the excel test$")
	public void vehicledetailsScreen1(String args1) throws Throwable{
//		VehicleScreenDetailExcelSheetParamterization VehicleScreenTest = PageFactory.initElements(driver, VehicleScreenDetailExcelSheetParamterization.class);
//		 VehicleScreenTest.ExcelSheet1();
//		driver.close();
		ReadExcelData reader = new ReadExcelData("src\\main\\java\\co\\ExcelDataPackage\\SeleniumQBEValues.xlsx");
		int rowCount = reader.getRowCount("DataValues");
	 
		for (int rowNum = 2;rowNum <= rowCount; rowNum++) {
//			driver= new ChromeDriver();
//			driver.get("https://greenslip.qbe.com/CTP_Internet_Quotes/GetQuote?BNDE=xt6lvGSAnWI=#_ga=2.77235158.2123969445.1569196017-1139173979.1567996292");
			GreenslipQuote GreenslipTest1 = PageFactory.initElements(driver,GreenslipQuote.class);
			GreenslipTest1.GreenSlipButtonPress();
			System.out.println("GreenSlip Button test works");	
		
			AnoymousQuoteButtonTestDataGrid Quotebutton = PageFactory.initElements(driver,AnoymousQuoteButtonTestDataGrid.class);
			Quotebutton.RadioButtonPress("12/12/2019");
			System.out.println("this is where the data input test will start");
			System.out.println("We were able to get the data from table");
			Quotebutton.RadioButtonPress2();
			System.out.println("Radio Button test works");
			Quotebutton.TitleTest();
			System.out.println("The title on this page is correct");
				
			
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
//		 webElement
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
			
			DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
			Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1976");
			Detailinputbuttonclick.isElementPresent1();
			System.out.println("All elements have been verfied");
			System.out.println("This test worked");
			
			FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
			FinishButtonClick.FinalQuoteCheck();
			FinishButtonClick.FinishButtonWordpress();
			System.out.println("This test worked");
		}
		
		System.out.println("Excel Test is complete and has passed all scenrios ");
		driver.close();
		
		
		
	}
}

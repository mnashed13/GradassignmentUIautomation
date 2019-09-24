package stepDefinitions;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.ExcelDataPackage.ReadExcelData;

import co.testerpackage.HomepageTest;
import co.uipackage.AnonymousQuoteButton;
import co.uipackage.AnoymousQuoteButtonTestDataGrid;
import co.uipackage.CTPButtonTest;
import co.uipackage.DetailPageTestDataGridTest;
import co.uipackage.DetailsPageTest;
import co.uipackage.FinishGreenSlipQuote;
import co.uipackage.GreenslipQuote;
//import co.browserfactory.BroswserFactory;
//import co.browserfactory.Hooks;
import co.uipackage.MenuUITest;
import co.uipackage.NSWbuttonClick;
import co.uipackage.NumberOfLinksTest;
import co.uipackage.RenewGreenSlip;
import co.uipackage.VehicleScreenDetailExcelSheetParamterization;
import co.uipackage.VehicleScreenDetails;
import co.uipackage.VehicleScreenDetailsDataGridtest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps{
	public WebDriver driver;
	
	


	
	 @Given("Step from {string} in {string} feature file")
	    public void step(String scenario, String file) {
	        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
	        Thread.currentThread().getId(), scenario,file);
	    }
	
	
	@Given("^open the google chrome browser and start the application$")
	public void test() throws Throwable{
		
		
		System.out.println("Browser has opened ");
//		browser.setup();
		System.out.println("The Test has started");
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
		driver = new ChromeDriver();
		System.out.println("Chrome browser has started");
		
//		FireFox Browser Support
		
//		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		System.out.println("Firefox browser has started");
//		driver.manage().window().maximize();
	

		
	}
	@When("^I go to the homepage$")
	public void I_go_to_the_homepage() throws Throwable{
		System.out.println("Started The Test");
		driver.get("https://www.qbe.com/au");
		NumberOfLinksTest MenuCount = PageFactory.initElements(driver, NumberOfLinksTest.class);
		MenuCount.MenuLinkCountTest();
		HomepageTest HomePageTitleTest = PageFactory.initElements(driver, HomepageTest.class);
		HomePageTitleTest.HomePageTitleTest();
		System.out.println("title verfication worked");
	}
	@Then("^I am on the homepage and click on Car and vehicle in the menu bar$")
	public void I_am_on_the_homepage_and_click_on_Car_and_vehicle_in_the_menu_bar() throws Throwable{
		MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
		MenuUI.MenuUIWordpress();
		System.out.println("menu button click worked");	
	}
	
	@When("^when I arrive to the drop down menu we can click on CTP$")
	public void when_I_arrive_to_the_dropdown_menu_we_can_click_on_CTP() throws Throwable{
		CTPButtonTest CTPButtontest = PageFactory.initElements(driver, CTPButtonTest.class);
		CTPButtontest.CTPButtonWordpress();
		System.out.println("CTP button worked");
	}

	@Given ("^the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW$")
	public void the_user_has_clicked_on_the_NSW_the_user_should_click_on_renew_greenslip_and_the_title_of_this_page_should_be_Compulsory_Third_Party_NSW() throws Throwable{
		RenewGreenSlip GreenslipTest = PageFactory.initElements(driver, RenewGreenSlip.class);
		GreenslipTest.RenewGreenSlip();
		
		System.out.println("GreenSlip test works");
		GreenslipTest.VerifyTextTest();
		System.out.println("Heading has been Verified");
	}
	


	@Then ("^the user should click on get a greenslip quote$")
	public void the_user_should_click_on_get_a_greenslip_quote() throws Throwable{
		GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
		GreenslipTest.GreenSlipButtonPress();
		System.out.println("GreenSlip Button test works");
		
		
		
		
	}
	
	@Then ("^the user should click on the radio that says anonymous quote$")
	public void the_user_should_click_on_the_radio_that_says_anonymous_quote() throws Throwable{
		AnonymousQuoteButton Quotebutton = PageFactory.initElements(driver,AnonymousQuoteButton.class);
		Quotebutton.RadioButtonPress("12/12/2019");
		System.out.println("Radio Button test works");
		Quotebutton.TitleTest();
		System.out.println("The title on this page is correct");
		

	
	}
	@Then("^the user should input all the nessary details in the Vechile Screen and click Continue$")
	public void the_user_should_input_all_the_nessary_details_in_the_Vechile_Screen_and_click_Continue() throws Throwable{
		
		VehicleScreenDetails DetailInput = PageFactory.initElements(driver,VehicleScreenDetails.class);
		DetailInput.DetailFormInputs("2016");
		System.out.println("This test worked");
		
	}
	
	@Then("^the user should input all the nessary details in the details Screen and click Continue$")
	public void the_user_should_input_all_the_nessary_details_in_the_details_Screen_and_click_Continue() throws Throwable{
		
		DetailsPageTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailsPageTest .class);
		Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1994");
		Detailinputbuttonclick.isElementPresent1();
		System.out.println("All elements have been verfied");
		System.out.println("This test worked");
		
	}
	
	@Given("^the user has done these steps the user should be able to click on finish$")
	public void the_user_has_done_these_steps_the_user_should_be_able_to_click_on_finish$() throws Throwable{
		
		FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
		FinishButtonClick.FinalQuoteCheck();
		FinishButtonClick.FinishButtonWordpress();
		System.out.println("This test worked");
	}	
}
//	First method of putting all tests in one feature file


//	This is where the DataGrid Test starts 
//  This is where i input the data dynamcally 
//	
//	@Given("^that this is a DataGrid Test the console will show this$")
//	public void DataGridtest() throws Throwable{
//		System.out.println("This is a data grid test");
//	}
//	@Then("^the user will open the browser again and go the qbe homepage$")
//	public void BrowserOpen() throws Throwable{
//
//		System.out.println("Browser has opened ");
//		System.out.println("The Test has started");
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
//		driver = new ChromeDriver();
//		System.out.println("Chrome browser has started");
//		driver.get("https://www.qbe.com/au");
//	
//	}
//	@When("^ I am on the homepage and click on Car and vehicle in the menu bar $")
//	public void CarAndVehcileClick() throws Throwable{
//		NumberOfLinksTest MenuCount = PageFactory.initElements(driver, NumberOfLinksTest.class);
//		MenuCount.MenuLinkCountTest();
//		HomepageTest HomePageTitleTest = PageFactory.initElements(driver, HomepageTest.class);
//		HomePageTitleTest.HomePageTitleTest();
//		System.out.println("title verfication worked");
//		MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
//		MenuUI.MenuUIWordpress();
//		System.out.println("menu button click worked");	
//	}
//	
//	
//	@Then("^when I arrive to the drop down menu where we can click on the CTP Button$")
//	public void dropdownMenu() throws Throwable{
//		CTPButtonTest CTPButtontest = PageFactory.initElements(driver, CTPButtonTest.class);
//		CTPButtontest.CTPButtonWordpress();
//		System.out.println("CTP button worked");
//	}
//	
//	@Given("^the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the datagrid test$")
//	public void RenewGreenslip() throws Throwable{
//		RenewGreenSlip GreenslipTest = PageFactory.initElements(driver, RenewGreenSlip.class);
//		GreenslipTest.RenewGreenSlip();
//		
//		System.out.println("GreenSlip test works");
//		GreenslipTest.VerifyTextTest();
//		System.out.println("Heading has been Verified");
//		
//	}
//	
//	@Then("^the user should click on get a greenslip quote for the datagrid test$")
//	public void GreenslipQuoteButton()throws Throwable{
//		GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
//		GreenslipTest.GreenSlipButtonPress();
//		System.out.println("GreenSlip Button test works");	
//	}
//	
//	@Then ("^the user should click on the radio button that says anonymous quote for the date grid test$")
//	public void anonymousQuoteButtonclick() throws Throwable{
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
//	
//
//
//	@Then ("^the user should input all the nessary details in the Vechile Screen they include Year as a \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\" and click Continue for the datagrid test$")
//	public void vehicledetailsScreen(String Year, String Make,String Shape, String Usage, String PostCode) throws Throwable{
//		VehicleScreenDetailsDataGridtest DetailInput = PageFactory.initElements(driver,VehicleScreenDetailsDataGridtest.class);
//		DetailInput.DetailFormInputsDataGrid(Year,Make,Shape,Usage,PostCode);
//		System.out.println("This test worked");
//		
//	}
//	
//	
//	@Then("^the user should input all the nessary details in the details Screen and click Continue in datagrid test$")
//	public void PersonalDetailScreenDataGrid() throws Throwable{
//		DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
//		Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1976");
//		Detailinputbuttonclick.isElementPresent1();
//		System.out.println("All elements have been verfied");
//		System.out.println("This test worked");
//		
//	}
////	
////	@Then("^the user should input all the nessary details in the details Screen which include \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\", \"(.*)\" and click Continue$")
////	public void PersonalDetailScreenDataGrid(String Type,String Duration, String Tax,String DOB, String Age) throws Throwable{
////		DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
////		Detailinputbuttonclick.PersonalDetailFormInputs(Type,Duration,Tax,DOB,Age);
////		Detailinputbuttonclick.isElementPresent1();
////		System.out.println("All elements have been verfied");
////		System.out.println("This test worked");
////		
////	}
//	
//	@Given("^the user has done these steps the user should be able to click on finish for the datagrid test$")
//	public void FinishdataGridtest() throws Throwable{
//		
//		FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
//		FinishButtonClick.FinishButtonWordpress();
//		FinishButtonClick.FinalQuoteCheck();
//		System.out.println("This test worked");
//		driver.close();
//		
//	}
	
	
	
//	Excel Sheet Parametrization
	
	
	
// Excel Test Starts Here
	
	
//
//	@Given("^that this is a Excel Test the console will show this$")
//	public void ExcelSheettestStart() throws Throwable{
//		System.out.println("This is a Excel Sheet Paramertization test has started");
//	}
//	
//	@Then("^the user will open the browser again and go the qbe homepage for the Excel test$")
//	public void BrowserOpenExcelSheetTest() throws Throwable{
//		System.out.println("Browser has opened ");
//		System.out.println("The Test has started");
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
//		driver = new ChromeDriver();
//		System.out.println("Chrome browser has started");
//		driver.get("https://www.qbe.com/au");
//		
//	}
//	
//	
//	@When("^I am on the homepage and click on Car and vehicle in the menu bar for the Excel test$")
//	public void CarAndVehcileClickExcelTest() throws Throwable{
//		NumberOfLinksTest MenuCount = PageFactory.initElements(driver, NumberOfLinksTest.class);
//		MenuCount.MenuLinkCountTest();
//		HomepageTest HomePageTitleTest = PageFactory.initElements(driver, HomepageTest.class);
//		HomePageTitleTest.HomePageTitleTest();
//		System.out.println("title verfication worked");
//		MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
//		MenuUI.MenuUIWordpress();
//		System.out.println("menu button click worked");	
//	}
//	
//	
//	@Then("^when I arrive to the drop down menu where we can click on the CTP Button for the excel test$")
//	public void dropdownMenuExcelTest() throws Throwable{
//		CTPButtonTest CTPButtontest = PageFactory.initElements(driver, CTPButtonTest.class);
//		CTPButtontest.CTPButtonWordpress();
//		System.out.println("CTP button worked");
//	}
//	
//	@Given("^the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the excel test$")
//	public void RenewGreenslipExcelSheetTest() throws Throwable{
//		RenewGreenSlip GreenslipTest = PageFactory.initElements(driver, RenewGreenSlip.class);
//		GreenslipTest.RenewGreenSlip();
//		
//		System.out.println("GreenSlip test works");
//		GreenslipTest.VerifyTextTest();
//		System.out.println("Heading has been Verified");
//		
//	}
//	
////	@Then("^the user should click on get a greenslip quote for the excel test$")
////	public void GreenslipQuoteButtonExcelSheetTest()throws Throwable{
////		GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
////		GreenslipTest.GreenSlipButtonPress();
////		System.out.println("GreenSlip Button test works");	
////	}
//	
//	
//	
////	
////	@Then ("^the user should click on the radio button that says anonymous quote for the excel test$")
////	public void anonymousQuoteButtonclickExcelTest() throws Throwable{
////		AnoymousQuoteButtonTestDataGrid Quotebutton = PageFactory.initElements(driver,AnoymousQuoteButtonTestDataGrid.class);
////		Quotebutton.RadioButtonPress("12/12/2019");
////		System.out.println("this is where the data input test will start");
////		System.out.println("We were able to get the data from table");
////		Quotebutton.RadioButtonPress2();
////		System.out.println("Radio Button test works");
////		Quotebutton.TitleTest();
////		System.out.println("The title on this page is correct");
////		
////	}
//
////	@Then ("^the user should input all the nessary details in the Vechile Screen they include the excel as a \"([^\\\"]*)\" and click Continue for the excel test$")
////	public void vehicledetailsScreen(String args1) throws Throwable{
////		ReadExcelData reader = new ReadExcelData("C:\\Users\\798014\\eclipse-workspace\\GradAssignmentSelenium\\src\\main\\java\\co\\ExcelDataPackage\\SeleniumQBEValues.xlsx");
////		String YearValue = reader.getCellData("DataValues", "Year", 2);
////		WebElement Year = driver.findElement(By.cssSelector("#a1"));
////		Year.sendKeys(YearValue);
////		
////		WebElement MakeOfVehicleButton = driver.findElement(By.cssSelector("#a2"));
////		String Make = reader.getCellData("DataValues", "Make", 2);
////		Select  MakeOfVehicleBtn = new Select(MakeOfVehicleButton);
////		MakeOfVehicleBtn.selectByVisibleText(Make);
////		
////		WebElement VehicleShape = driver.findElement(By.cssSelector("#a3"));
////		String Shape = reader.getCellData("DataValues", "Shape", 2);
////		Select  ShapeOfVechileBtn = new Select(VehicleShape);
////		ShapeOfVechileBtn.selectByVisibleText(Shape);
////		
////		WebElement VehicleUsage = driver.findElement(By.cssSelector("#a4"));
////		String Usage = reader.getCellData("DataValues", "Usage", 2);
////		Select   VehicleUsageBtn = new Select(VehicleUsage);
////		VehicleUsageBtn.selectByVisibleText(Usage);
////		
////		WebElement postcode = driver.findElement(By.cssSelector("#a5"));
////		String postcodeData = reader.getCellData("DataValues", "PostCode", 2);
////		Select   postcodeBtn = new Select(postcode);
////		postcodeBtn.selectByVisibleText(postcodeData);
////		
////		
////
////		String YearValue2 = reader.getCellData("DataValues", "Year", 3);
////		WebElement Year2 = driver.findElement(By.cssSelector("#a1"));
////		Year2.sendKeys(YearValue2);
////		
////				
////		WebElement ContinueBtn = driver.findElement(By.cssSelector("#button_forward"));
////		ContinueBtn.click();
////	}
//	
//	@Then ("^the user should input all the nessary details in the Vechile Screen they include the excel as a \"([^\\\"]*)\" and click Continue for the excel test$")
//	public void vehicledetailsScreen1(String args1) throws Throwable{
////		VehicleScreenDetailExcelSheetParamterization VehicleScreenTest = PageFactory.initElements(driver, VehicleScreenDetailExcelSheetParamterization.class);
////		 VehicleScreenTest.ExcelSheet1();
//		ReadExcelData reader = new ReadExcelData("C:\\Users\\798014\\eclipse-workspace\\GradAssignmentSelenium\\src\\main\\java\\co\\ExcelDataPackage\\SeleniumQBEValues.xlsx");
//		int rowCount = reader.getRowCount("DataValues");
//	 
//		for (int rowNum = 2;rowNum <= rowCount; rowNum++) {
////			driver= new ChromeDriver();
////			driver.get("https://greenslip.qbe.com/CTP_Internet_Quotes/GetQuote?BNDE=xt6lvGSAnWI=#_ga=2.77235158.2123969445.1569196017-1139173979.1567996292");
//			GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
//			GreenslipTest.GreenSlipButtonPress();
//			System.out.println("GreenSlip Button test works");	
//		
//			AnoymousQuoteButtonTestDataGrid Quotebutton = PageFactory.initElements(driver,AnoymousQuoteButtonTestDataGrid.class);
//			Quotebutton.RadioButtonPress("12/12/2019");
//			System.out.println("this is where the data input test will start");
//			System.out.println("We were able to get the data from table");
//			Quotebutton.RadioButtonPress2();
//			System.out.println("Radio Button test works");
//			Quotebutton.TitleTest();
//			System.out.println("The title on this page is correct");
//			
//			
//			
//			
//			
//		 String Year = reader.getCellData("DataValues", "Year", rowNum);
//		 System.out.println(Year);
//		 String Make = reader.getCellData("DataValues", "Make", rowNum);
//		 System.out.println(Make);
//		 String Shape = reader.getCellData("DataValues", "Shape", rowNum);
//		 System.out.println(Shape);
//		 String Usage = reader.getCellData("DataValues", "Usage", rowNum);
//		 System.out.println(Usage);
//		 String postcodeData = reader.getCellData("DataValues", "PostCode", rowNum);
//		 System.out.println(postcodeData);
//		 
////		 webElement 
//	 
//			WebElement YearElement = driver.findElement(By.cssSelector("#a1"));
//			YearElement.sendKeys(Year);
//			WebElement MakeOfVehicleButton = driver.findElement(By.cssSelector("#a2"));
//			Select  MakeOfVehicleBtn = new Select(MakeOfVehicleButton);
//			MakeOfVehicleBtn.selectByVisibleText(Make);
//			
//			WebElement VehicleShape = driver.findElement(By.cssSelector("#a3"));
//			Select  ShapeOfVechileBtn = new Select(VehicleShape);
//			ShapeOfVechileBtn.selectByVisibleText(Shape);
//			
//			WebElement VehicleUsage = driver.findElement(By.cssSelector("#a4"));
//			Select   VehicleUsageBtn = new Select(VehicleUsage);
//			VehicleUsageBtn.selectByVisibleText(Usage);
//
//			WebElement postcode = driver.findElement(By.cssSelector("#a5"));
//			Select   postcodeBtn = new Select(postcode);
//			postcodeBtn.selectByVisibleText(postcodeData);
//			WebElement ContinueBtn = driver.findElement(By.cssSelector("#button_forward"));
//			ContinueBtn.click();
//			
//			DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
//			Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1976");
//			Detailinputbuttonclick.isElementPresent1();
//			System.out.println("All elements have been verfied");
//			System.out.println("This test worked");
//			
//			FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
//			FinishButtonClick.FinalQuoteCheck();
//			FinishButtonClick.FinishButtonWordpress();
//			System.out.println("This test worked");
//			
//			
//			
//			
//		}
//		
//		System.out.println("Excel Test is complete and has passed all scenrios ");
//		driver.close();
//		
//		
//		
//	}
	
	
//	@Then("^the user should input all the nessary details in the details Screen and click Continue in excel test$")
//	public void PersonalDetailScreenDataGrid() throws Throwable{
//		DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
//		Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1976");
//		Detailinputbuttonclick.isElementPresent1();
//		System.out.println("All elements have been verfied");
//		System.out.println("This test worked");
//		
//	}
//	
//	@Given("^the user has done these steps the user should be able to click on finish for the excel test$")
//	public void FinishdataGridtest() throws Throwable{
//		
//		FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
//		FinishButtonClick.FinishButtonWordpress();
//		System.out.println("This test worked");
//		driver.close();
//		
//	}

	



package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import co.testerpackage.HomepageTest;
import co.uipackage.AnoymousQuoteButtonTestDataGrid;
import co.uipackage.CTPButtonTest;
import co.uipackage.DetailPageTestDataGridTest;
import co.uipackage.FinishGreenSlipQuote;
import co.uipackage.GreenslipQuote;
import co.uipackage.MenuUITest;
import co.uipackage.NumberOfLinksTest;
import co.uipackage.RenewGreenSlip;
import co.uipackage.VehicleScreenDetailsDataGridtest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public class DataGridSteps {
	
	public WebDriver driver;
//	This is where the DataGrid Test starts 
	@Given("^that this is a DataGrid Test the console will show this$")
	public void DataGridtest() throws Throwable{
		System.out.println("This is a data grid test");
	}
	@Then("^the user will open the browser again and go the qbe homepage$")
	public void BrowserOpen() throws Throwable{
//		Chrome Browser Support
//		System.out.println("Browser has opened ");
//		System.out.println("The Test has started");
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
//		driver = new ChromeDriver();
//		System.out.println("Chrome browser has started");
//		driver.get("https://www.qbe.com/au");
		
//		-------------------------------------------------------------------------------------------------------------
		
//		FireFox Browser Support
		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Firefox browser has started");
		driver.get("https://www.qbe.com/au");

	
	}
	@When("^I am on the homepage and click on Car and vehicle in the menu bar for the datagrid test$")
	public void CarAndVehcileClick() throws Throwable{
		NumberOfLinksTest MenuCount = PageFactory.initElements(driver, NumberOfLinksTest.class);
		MenuCount.MenuLinkCountTest();
		HomepageTest HomePageTitleTest = PageFactory.initElements(driver, HomepageTest.class);
		HomePageTitleTest.HomePageTitleTest();
		System.out.println("title verfication worked");
		MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
		MenuUI.MenuUIWordpress();
		System.out.println("menu button click worked");	
	}
	@Then("^when I arrive to the drop down menu where we can click on the CTP Button$")
	public void dropdownMenu() throws Throwable{
		CTPButtonTest CTPButtontest = PageFactory.initElements(driver, CTPButtonTest.class);
		CTPButtontest.CTPButtonWordpress();
		System.out.println("CTP button worked");
	}
	
	@Given("^the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the datagrid test$")
	public void RenewGreenslip() throws Throwable{
		RenewGreenSlip GreenslipTest = PageFactory.initElements(driver, RenewGreenSlip.class);
		GreenslipTest.RenewGreenSlip();
		
		System.out.println("GreenSlip test works");
		GreenslipTest.VerifyTextTest();
		System.out.println("Heading has been Verified");
		
	}
	
	@Then("^the user should click on get a greenslip quote for the datagrid test$")
	public void GreenslipQuoteButton()throws Throwable{
		GreenslipQuote GreenslipTest = PageFactory.initElements(driver,GreenslipQuote.class);
		GreenslipTest.GreenSlipButtonPress();
		System.out.println("GreenSlip Button test works");	
	}
	
	@Then ("^the user should click on the radio button that says anonymous quote for the date grid test$")
	public void anonymousQuoteButtonclick() throws Throwable{
		AnoymousQuoteButtonTestDataGrid Quotebutton = PageFactory.initElements(driver,AnoymousQuoteButtonTestDataGrid.class);
		Quotebutton.RadioButtonPress("12/12/2019");
		System.out.println("this is where the data input test will start");
		System.out.println("We were able to get the data from table");
		Quotebutton.RadioButtonPress2();
		System.out.println("Radio Button test works");
		Quotebutton.TitleTest();
		System.out.println("The title on this page is correct");
		
	}
	


	@Then ("^the user should input all the nessary details in the Vechile Screen they include Year as a \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\" and click Continue for the datagrid test$")
	public void vehicledetailsScreen(String Year, String Make,String Shape, String Usage, String PostCode) throws Throwable{
		VehicleScreenDetailsDataGridtest DetailInput = PageFactory.initElements(driver,VehicleScreenDetailsDataGridtest.class);
		DetailInput.DetailFormInputsDataGrid(Year,Make,Shape,Usage,PostCode);
		System.out.println("This test worked");
		
	}
	
	
	@Then("^the user should input all the nessary details in the details Screen and click Continue in datagrid test$")
	public void PersonalDetailScreenDataGrid() throws Throwable{
		DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
		Detailinputbuttonclick.PersonalDetailFormInputs("12/12/1976");
		Detailinputbuttonclick.isElementPresent1();
		System.out.println("All elements have been verfied");
		System.out.println("This test worked");
		
	}
//	
//	@Then("^the user should input all the nessary details in the details Screen which include \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\", \"(.*)\" and click Continue$")
//	public void PersonalDetailScreenDataGrid(String Type,String Duration, String Tax,String DOB, String Age) throws Throwable{
//		DetailPageTestDataGridTest Detailinputbuttonclick = PageFactory.initElements(driver,DetailPageTestDataGridTest.class);
//		Detailinputbuttonclick.PersonalDetailFormInputs(Type,Duration,Tax,DOB,Age);
//		Detailinputbuttonclick.isElementPresent1();
//		System.out.println("All elements have been verfied");
//		System.out.println("This test worked");
//		
//	}
	
	@Given("^the user has done these steps the user should be able to click on finish for the datagrid test$")
	public void FinishdataGridtest() throws Throwable{
		
		FinishGreenSlipQuote FinishButtonClick = PageFactory.initElements(driver,FinishGreenSlipQuote.class);
		FinishButtonClick.FinishButtonWordpress();
		FinishButtonClick.FinalQuoteCheck();
		System.out.println("This test worked");
		driver.close();
		
	}
	
	

}

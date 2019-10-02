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
	
	@Given("^open the google chrome browser and start the application$")
	public void test() throws Throwable{
		
		System.out.println("Browser has opened ");
		System.out.println("The Test has started");
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome browser has started");
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
		System.out.println("This test worked all scenarios passed");
		driver.close();
	}	
}

	



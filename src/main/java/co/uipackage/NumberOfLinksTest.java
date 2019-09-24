package co.uipackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NumberOfLinksTest {
	WebDriver driver;

	public NumberOfLinksTest(WebDriver driver) {
		this.driver=driver;
}


	public void MenuLinkCountTest() {
		
	     List<WebElement> TagName = driver.findElements(By.tagName("li"));

	     System.out.println("Total menu are "+TagName.size());
	     int no=1;
	     for (int i = 1; i<TagName.size(); i=i+1)      
	     {      
	         if(TagName.get(i).getText().isEmpty()) {

	         }
	         else
	         {
	             System.out.println(TagName.get(i).getText());
	            no++;               
	         }       
	     }  
	     System.out.println("Total final menu are "+no);        
	    }
		
		
		
	}
	

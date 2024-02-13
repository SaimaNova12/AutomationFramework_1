package SaimaNova.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import SaimaNova.drivers.PageDriver;
import SaimaNova.utility.common;

public class dashboardPage extends common{
	
     public dashboardPage() {
    	 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
     }
     
     @FindBys({
    	 @FindBy(xpath = "//span[contains(text(),'Home & Lifestyle')]")
     })
     WebElement lifestyle;
     
     public void clicklifestyle () {
    	 try {
    		 if(lifestyle.isDisplayed()) {
    			 lifestyle.click();
    			 timeout();
    		 }
    	 }
    	 catch(Exception e){
    		 System.out.println("Error!!");
    	 }
     }
     
}

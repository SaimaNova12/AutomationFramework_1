package SaimaNova.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import SaimaNova.drivers.PageDriver;
import SaimaNova.utility.common;

//import driver.PageDriver;

public class login extends common{
	
	public login() {
    	PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    
    @FindBys({
    	//@FindBy(xpath = "//input[@name = 'username']"),
    	//@FindBy(xpath = "//input[@placeholder = 'Email Address']"),
    	@FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
    })
    WebElement username;
    
    @FindBys({
    	//@FindBy(xpath = "//input[@name = 'password']"),
    	@FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    })
    WebElement password; 
    
    @FindBys({
    	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
    })
    WebElement submit;
    
    
    public void loginPage() throws InterruptedException {
    	timeout();
    	try {
    		if(username.isDisplayed()) {
    			username.sendKeys("01644417057");
    			timeout();
    		}
    	}
    	catch(Exception e){
    		System.out.println("Error!!");
    	}
    	
    	try {
    		if(password.isDisplayed()) {
    			password.sendKeys("saima34");
    			timeout();
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Error!!");
    	}
    	try {
    		if(submit.isDisplayed()) {
    			submit.click();
    			timeout(3000);
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Error!!");
    	}
    }
}

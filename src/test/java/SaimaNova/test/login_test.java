package SaimaNova.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SaimaNova.Pages.dashboardPage;
import SaimaNova.Pages.login;
import SaimaNova.drivers.BaseDriver;
import SaimaNova.drivers.PageDriver;

public class login_test extends BaseDriver {
	
      @BeforeClass	
      public void openurl() {
    	  PageDriver.getCurrentDriver().manage().window().maximize();
    	  PageDriver.getCurrentDriver().get(url);
      }
      
      @Test(priority = 0)
      public void loginTest() throws InterruptedException {
    	 login loginpage = new login();
    	 loginpage.loginPage();
    	 
     	dashboardPage dash = new dashboardPage();
     	dash.clicklifestyle();
      }
}

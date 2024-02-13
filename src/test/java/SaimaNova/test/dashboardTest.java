package SaimaNova.test;

import org.testng.annotations.Test;

import SaimaNova.Pages.dashboardPage;
import SaimaNova.drivers.BaseDriver;

public class dashboardTest extends BaseDriver{
    
    @Test(priority=0)
    public void dashboardTest() throws InterruptedException {
    	dashboardPage dash = new dashboardPage();
    	dash.clicklifestyle();
    }
}

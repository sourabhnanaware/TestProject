package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.pack.Base;
import pomclasses.login;

public class NewTest extends Base {
	 WebDriver driver;
	login login;
	SoftAssert softassert;
	
	@BeforeClass
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	

	@BeforeMethod
	public void openApplication() {
		
		
		login = new login(driver);
		softassert = new SoftAssert();
	}
	
   
    @Test
    public void VerifyLoginButton() {
    	login.clickLoginButton();
    	String url = driver.getCurrentUrl();
    	Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }
    
    @AfterMethod
    //public void cleanObjects() {
    //	login = null;
    //	softassert = null;
   // }
    
    @AfterClass
    public void closeBrowser() {
    	driver.quit();
    	
    	
    }
    
    
}
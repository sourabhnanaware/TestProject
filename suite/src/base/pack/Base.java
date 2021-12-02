package base.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver openChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		return driver;
		
	}

}

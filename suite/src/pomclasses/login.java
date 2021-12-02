package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login {
	private WebDriver driver;
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement loginbutton;

	
	
	public login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendUserName() {
		username.sendKeys("Admin");
		String user= username.getText();
		Assert.assertEquals(user, "Admin"); 
		System.out.println(user);
		
		
	}
	
	public void sendPassword() {
	     password.sendKeys("admin123");
	     String text = password.getText();
	     System.out.println(text);
		
		
	}
	
	public void clickLoginButton() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
	}

}

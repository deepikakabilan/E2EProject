package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebDriver driver;
	By Email =By.cssSelector("[id='user_email']");
	By Pwd   =By.cssSelector("[type='password']");
	By Login =By.cssSelector("[value='Log In']");
	
	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	public WebElement getEmail(){
		return driver.findElement(Email);
		
	}
	public WebElement getPwd(){
		return driver.findElement(Pwd);
		
	}
	public WebElement getLogin(){
		return driver.findElement(Login);
		
	}

}

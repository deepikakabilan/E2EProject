package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public static WebDriver driver;
	By Login =By.linkText("Login");
	By Title =By.cssSelector("html.js.csstransitions body#homepage section#content div.container div.text-center h2");
	By NavBarContact =By.linkText("Contact");
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	public WebElement getLogin(){
		return driver.findElement(Login);
		
	}
	public WebElement getTitle(){
		return driver.findElement(Title);
		
	}
	public WebElement getNavBarContact(){
		return driver.findElement(NavBarContact);
		
	}



	
	

}

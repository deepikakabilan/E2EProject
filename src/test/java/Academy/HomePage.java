package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObject;
import resources.Base;


public class HomePage extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void IntializeDriver() throws IOException{
		driver =intializeDriver();
		log.info("Successfully intialized");
		
		
	}
	@Test
	public void basePageNavigation() throws IOException{
		driver.get(prop.getProperty("Url"));
		log.info("Successfully launched home page");
		HomePageObjects home = new HomePageObjects(driver);
		home.getLogin().click();
		LoginPageObject log = new LoginPageObject(driver);
		log.getEmail().sendKeys("sdasd");;
		log.getPwd().sendKeys("vdfsd");;
		log.getLogin().submit();
		
		
	
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
		driver=null;
	}
	
}


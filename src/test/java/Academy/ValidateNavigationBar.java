package Academy;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePageObjects;
import resources.Base;


public class ValidateNavigationBar extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void IntializeDriver() throws IOException{
		driver =intializeDriver();
		log.info("Successfully Intialised");
		driver.get(prop.getProperty("Url"));
		log.info("Navigated to home page");
	}
	
	
	@Test
	public void validateNavBarBasePage() throws IOException{
		
		HomePageObjects home = new HomePageObjects(driver);
		//Boolean value=home.getNavBarContact().isDisplayed();
	//	Assert.assertTrue(value);
		Assert.assertTrue(home.getNavBarContact().isDisplayed());
		log.info("Successfully checked navigation bar");
	
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
}

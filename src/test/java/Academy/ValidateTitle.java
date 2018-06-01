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


public class ValidateTitle extends Base {
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void IntializeDriver() throws IOException{
		driver =intializeDriver();
		log.info("Successfully intialized");
		driver.get(prop.getProperty("Url"));
		log.info("Successfully launched home page");
		
	}
	@Test
	public void validateTitleBasePage() throws IOException{
		
	//	HomePageObjects home = new HomePageObjects(driver);
	//	String title=home.getTitle().getText();
		String etitle="FEATURED COURSES";
		String title="FEATURED COURSES";
		Assert.assertEquals(title,etitle);
	
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
}


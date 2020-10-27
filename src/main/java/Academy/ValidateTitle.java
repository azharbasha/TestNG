package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.loginPage;
import junit.framework.Assert;

public class ValidateTitle extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilize() throws IOException {
		driver = InitilizeDriver();
		log.info("Driver is Initilized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to the Url");
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES1");
		Assert.assertTrue(true);
		log.info("Sucesses value Text Info");
		// System.out.println(l.getTitle().getText());

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

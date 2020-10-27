package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.loginPage;
import junit.framework.Assert;

public class validateNavbar extends base {

	@BeforeTest
	public void initilize() throws IOException {
		driver = InitilizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNav().isDisplayed());
		Assert.assertTrue(true);
		// System.out.println(l.getTitle().getText());

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}

package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.loginPage;

public class Homepage extends base {

	@BeforeTest
	public void initilize() throws IOException {
		driver = InitilizeDriver();

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String UserName, String Password) throws IOException {

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();
		// System.out.println(l.getTitle().getText());

		loginPage lp = new loginPage(driver);
		lp.getemail().sendKeys(UserName);
		lp.getPassword().sendKeys(Password);
		lp.getlogin().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "abc@qaclick.com";
		data[0][1] = "123456";

		data[1][0] = "xyz@azclick.com";
		data[1][1] = "abc@123";

		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public static WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.cssSelector("#user_email");

	public WebElement getemail() {
		return driver.findElement(email);
	}

	By password = By.cssSelector("#user_password");

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	By login = By.xpath("//input[@value='Log In']");

	public WebElement getlogin() {
		return driver.findElement(login);
	}
}

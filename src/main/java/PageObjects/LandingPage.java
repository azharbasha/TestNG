package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Academy.base;

public class LandingPage extends base {

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.cssSelector("a[href*='sign_in']");

	public WebElement getlogin() {
		return driver.findElement(signin);
	}

	By nav = By.cssSelector(".nav.navbar-nav.navbar-right");

	public WebElement getNav() {
		return driver.findElement(nav);
	}

	By Title = By.cssSelector(".text-center>h2");

	public WebElement getTitle() {
		return driver.findElement(Title);
	}
}

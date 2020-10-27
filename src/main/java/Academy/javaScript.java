package Academy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScript {
	
	WebDriver driver= null;
	
	@Test
	public void WebPageScroll() {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

}

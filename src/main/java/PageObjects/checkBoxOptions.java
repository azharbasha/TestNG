package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\WebDriver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		
		Dimension checkboxcount = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label")).getSize();
		System.out.println("Size of checkboxes "+checkboxcount);
	}

}

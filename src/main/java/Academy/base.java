package Academy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;



public class base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver InitilizeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\sjdemo\\e2Eproject\\src\\main\\java\\Academy\\data.properites");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\sjdemo\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtil.copyFile(src,new File("C://sjdemo//e2Eproject//" + result + "screenshot.png"));
	}
}

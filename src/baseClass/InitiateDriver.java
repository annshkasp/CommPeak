package baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateDriver {

public WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException, IOException {		
			System.setProperty("webdriver.chrome.whitelistedIps", "");
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
			driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	
	@AfterMethod
	public void closebrowse() {
		driver.quit();
	}
}

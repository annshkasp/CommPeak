package library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	
	WebDriver driver = null;
	WebDriverWait wait;
	public PageActions(WebDriver driver) {
		this.driver = driver;		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
	}

}

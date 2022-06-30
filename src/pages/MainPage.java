package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@name='q']") @CacheLookup  WebElement searchTextBox;	

	public void searchGoogle(String searchString) {
		
		searchTextBox.sendKeys(searchString);
			
	}
	
	public void clickSearchButton() {
		
		searchTextBox.sendKeys(Keys.ENTER);
		
	}
}

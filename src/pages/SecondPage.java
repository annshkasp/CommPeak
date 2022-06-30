package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SecondPage {

	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Download')]") @CacheLookup  WebElement searchTheLink;	

    public void clickOnLink() {
		
    	searchTheLink.click();
		
	}
}

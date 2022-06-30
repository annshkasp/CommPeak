package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class verify {
	
	public static boolean validateTextPresentOnElement(WebDriver driver, String element) 
	{
		boolean result = false;
		String valueOnButton = "";
		String valueOnLink = "";
		

		try
		{
			
			WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1))
			.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
						
			valueOnButton = wait.getText();
			String versionOnButton=valueOnButton.substring(16, valueOnButton.length());
									
			valueOnLink = wait.getAttribute("href");
			String versionOnLink=valueOnLink.substring(34, 40);
							
						
			if (versionOnButton.equalsIgnoreCase(versionOnLink))
			{
				result = true;
			}						
		
		} catch (Exception e)
		{
			
		}
		
		return result;
	}

	public static boolean validateReleaseEnd(WebDriver driver, String element, String releaseEnd) {
				
		boolean result = false;
		String releaseEndText = "";
		

		try
		{
			
			WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1))
			.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
																							
			releaseEndText = wait.getText();		
													
			if (releaseEndText.equalsIgnoreCase(releaseEnd))
			{
				result = true;
			}						
		
		} catch (Exception e)
		{
			
		}
		
		return result;
	}

}

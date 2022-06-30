package testCase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import verification.verify;
import baseClass.InitiateDriver;
import pages.MainPage;
import pages.SecondPage;


public class TestCase_1 extends InitiateDriver{
	
	@Test
	//Check the same version on button and link
	public void tc_001() throws IOException {
		
		MainPage mainPage = new MainPage();
		PageFactory.initElements(driver, mainPage);
		SecondPage secondPage = new SecondPage();
		PageFactory.initElements(driver, secondPage);
		
		
		mainPage.searchGoogle("python");
		mainPage.clickSearchButton();
		secondPage.clickOnLink();
		
		Assert.assertEquals(verify.validateTextPresentOnElement(driver,"//h1[contains(text(),'Download the latest version for Windows')]/following-sibling::p/a"), true);
			
		
	}
	
	@Test
	//Check that python version 3.8 has end of support as '2024-10'
	public void tc_002() throws IOException {
		
		MainPage mainPage = new MainPage();
		PageFactory.initElements(driver, mainPage);
		SecondPage secondPage = new SecondPage();
		PageFactory.initElements(driver, secondPage);
		
		
		mainPage.searchGoogle("python");
		mainPage.clickSearchButton();
		secondPage.clickOnLink();
		
		Assert.assertEquals(verify.validateReleaseEnd(driver,"//span[@class=\"release-version\" and text()='3.8']/following-sibling::span[@class=\"release-end\"]", "2024-10"), true);
			
		
	}
	
}

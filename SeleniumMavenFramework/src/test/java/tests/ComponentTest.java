package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.componentModule;

public class ComponentTest {
	WebDriver driver;
	@BeforeMethod
		public void setUp() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
	}
	@Test
	public void verifyComponents() {
		componentModule component=new componentModule(driver);
		component.clickOnComponent();
//		component.waitForElement();
		component.clickOnMonitors();
	}
}

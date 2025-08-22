package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.componentModule;

public class ComponentTest extends BaseTest{
	WebDriver driver;
	@BeforeMethod
		public void setUp() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
	}
	@Test
	 @Severity(SeverityLevel.NORMAL)
    @Story("Buy Monitor")
    @Description("This test verifies the monitor buying")
	public void verifyComponents() {
		componentModule component=new componentModule(driver);
		component.clickOnComponent();
//		component.waitForElement();
		component.clickOnMonitors();
	}
}

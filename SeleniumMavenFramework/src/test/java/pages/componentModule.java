package pages;

import java.time.Duration;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class componentModule {
		
	WebDriver driver;
	@FindBy(linkText = "Components")
	WebElement Components;
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	WebElement Monitors;
	
	 public componentModule(WebDriver driver) {
    	 this.driver = driver;
	        PageFactory.initElements(driver, this);
    }
	 public void clickOnComponent() {
			WebElement dropdownTrigger = Components;
			dropdownTrigger.click();				
		}
	 @Step("Click on Monitors value")
	public void clickOnMonitors() {	
		 Monitors.click();
		 System.out.println("Click on Monitors");

	}
}

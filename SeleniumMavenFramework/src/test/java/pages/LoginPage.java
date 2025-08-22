package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
    @FindBy(xpath="//span[text()=\"My Account\"]")
    WebElement myAccount;
    @FindBy(linkText = "Login")
    WebElement LoginOnHeader;
    @FindBy(xpath = "//input[@id=\"input-email\"]")
    WebElement username;
    @FindBy(xpath = "//input[@id=\"input-password\"]")
    WebElement password;
    @FindBy(xpath ="//input[@value=\"Login\"]" )
    WebElement loginButton;   
    @FindBy (linkText = "Logout")
    WebElement logoutBtn;

    public LoginPage(WebDriver driver) {
    	 this.driver = driver;
	        PageFactory.initElements(driver, this);
    }
    
	public void myAccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//span[text()='My Account']")));
		myAccount.click();
	}
	public void clickLoginOnHeader() {
		LoginOnHeader.click();
	}
	public void username() {
	username.sendKeys(Constants.loginEmail);
	}
	public void password() {
	password.sendKeys(Constants.loginPass);
	}
	public void loginToApp() {
	loginButton.click();
	}
	public void verifyLogoutIsDsplayed() {
		Assert.assertTrue(logoutBtn.isDisplayed(), "User is not logged in");	
	}
	public void waitForElement() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));	
	}
}

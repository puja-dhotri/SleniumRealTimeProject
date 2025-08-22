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
  private  @FindBy(xpath="//span[text()=\"My Account\"]") 
  
    WebElement myAccount;
    
  private @FindBy(linkText = "Login")
    WebElement LoginOnHeader;
    
  private  @FindBy(xpath = "//input[@id=\"input-email\"]")
    WebElement username;
    
  private @FindBy(xpath = "//input[@id=\"input-password\"]")
    WebElement password;
    
  private @FindBy(xpath ="//input[@value=\"Login\"]" )
    WebElement loginButton;   
    
  private @FindBy (linkText = "Logout")
    WebElement logoutBtn;

    public LoginPage(WebDriver driver) {
    	 this.driver = driver;
	        PageFactory.initElements(driver, this);
    }
    
	public void myAccount() {
		
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

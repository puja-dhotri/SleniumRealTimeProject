package pages;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import tests.BaseTest;

public class RegisterPage extends BaseTest {
	   WebDriver driver;

	   public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);  // <-- this line is mandatory
	    }
//	    public static final String firstName="//span[text()=\"My Account\"]";
	    @FindBy(xpath="//span[text()=\"My Account\"]")
	    WebElement myAccount;
	    
	    @FindBy(linkText="Register")
	    WebElement register;
	    
	    @FindBy(xpath="//input[@name=\"firstname\"]")
	    WebElement firstName;
	    
	    @FindBy(xpath="//input[@name=\"lastname\"]")
	    WebElement lastName;
	    
	    @FindBy(xpath="//input[@name=\"email\"]")
	    WebElement email;
	    
	    @FindBy(xpath="//input[@type=\"checkbox\"]")
	    WebElement agreeCheckbox;
	    
	    @FindBy(xpath = "//input[@value=\"Continue\"]")
	    WebElement contButton;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
	    WebElement actualMessage;

	public void registerAccount() {
	    	myAccount.click();
	    	register.click();
	    	firstName.sendKeys(Constants.firstName);
	    	lastName.sendKeys(Constants.lastName);
	    	email.sendKeys(generateEmail());

		driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys(Constants.tephone);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Constants.password);
		driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys(Constants.confirmPass);
		
		firstName.clear();
    	firstName.sendKeys(Constants.firstName);
    	agreeCheckbox.click();
    	contButton.click();
    
    	String expectedMessage="Your Account Has Been Created!";
    	assertEquals(expectedMessage, actualMessage.getText());
    	
	}
	    
	public String generateEmail() {
		return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "")+"+@gmail.com";
		
	}
	}
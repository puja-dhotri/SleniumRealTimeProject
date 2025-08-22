package pages;
import static org.testng.Assert.assertEquals;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage  {
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
	    @FindBy(xpath = "//input[@name=\"telephone\"]")
	    WebElement telephone;
	    @FindBy(xpath = "//input[@name=\"password\"]")
	    WebElement password;
	    @FindBy(xpath = "//input[@name=\"confirm\"]")
	    WebElement confirmPass;

	    public void myAccount() {
	    	myAccount.click();
		}
	    
	    public void register() {
    	register.click();
		}
	    
	    public void firstName() {
    	firstName.sendKeys(Constants.firstName);
		}
	    
	    public void lastName() {
	    lastName.sendKeys(Constants.lastName);
		}
	    
	    public void email() {
	    email.sendKeys(generateEmail());
		}
	    
	    public void telephone() {
			telephone.sendKeys(Constants.tephone);
		}
	    
	    public void password() {
	    	password.sendKeys(Constants.password);	
		}
	    
	    public void confirmPass() {
	    	confirmPass.sendKeys(Constants.password);
		}
	    
	    public void agreeCheckbox() {
			agreeCheckbox.click();
		}
	    public void continueButton() {
			contButton.click();
		}
	    
	    public void accRegistrationSuccessful() {
	    	Assert.assertTrue(actualMessage.isDisplayed(), "Account is not created");
			
		}
    	public String generateEmail() {
		return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "")+"@gmail.com";	
	}
	}
package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;
import utils.DriverFactory;

public class RegisterTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Make sure ChromeDriver executable is on system path or set property
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
    }
    //Register Account
    @Test
    public void registerTest() {
	RegisterPage register=new RegisterPage(driver);
	register.myAccount();
	register.register();
	register.firstName();
	register.lastName();
	register.email();
	register.telephone();
	register.password();
	register.confirmPass();
	register.agreeCheckbox();
	register.continueButton();
	register.accRegistrationSuccessful();
    }
   
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;
import utils.DriverFactory;

public class SampleTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Make sure ChromeDriver executable is on system path or set property
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
    }
    @Test
    public void loginTest() {
		RegisterPage register=new RegisterPage(driver);
 	   register.registerAccount();
        
    }
   
}

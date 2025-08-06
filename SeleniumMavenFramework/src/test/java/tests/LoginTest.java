package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	
WebDriver driver;
@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
	}
	//Login to Account
    @Test
    public void LoginTestP()
    {
    LoginPage userLogin=new LoginPage(driver);
    userLogin.myAccount();
    userLogin.clickLoginOnHeader();
    userLogin.username();
    userLogin.password();
    userLogin.loginToApp();
    userLogin.myAccount();
    userLogin.waitForElement();
    userLogin.verifyLogoutIsDsplayed();
    }
}

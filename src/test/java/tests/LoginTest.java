package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.testng.Tag;
import pages.LoginPage;
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class LoginTest extends BaseTest {
	
WebDriver driver;
@BeforeMethod
//	public void setUp() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//        driver.get("https://tutorialsninja.com/demo/"); // Use your actual URL
//	}
	//Login to Account
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login functionality")
    @Description("This test verifies the login functionality")
    @Tag("login")
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

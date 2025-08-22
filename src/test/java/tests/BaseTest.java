package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class BaseTest {
//WebDriver driver;
//    @BeforeMethod
//    public void setUp() {
//        DriverFactory.initDriver();
//        
//    }
//   
////    @AfterMethod
////    public void tearDown() {
////        DriverFactory.quit();
////    }
//
//    public WebDriver getDriver() {
//        return DriverFactory.getDriver(); // directly from ThreadLocal
//    }
//}
public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://example.com");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
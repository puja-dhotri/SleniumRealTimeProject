package tests;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import utils.DriverFactory;

public class BaseTest {
WebDriver driver;
    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
        
    }

    
    
//    @AfterMethod
//    public void tearDown() {
//        DriverFactory.quit();
//    }
}

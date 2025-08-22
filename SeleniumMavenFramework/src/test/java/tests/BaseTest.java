package tests;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
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

    public WebDriver getDriver() {
        return DriverFactory.getDriver(); // directly from ThreadLocal
    }
}

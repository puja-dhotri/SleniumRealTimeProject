package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utils.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
    }

//    @AfterMethod
//    public void tearDown() {
//        DriverFactory.quitDriver();
//    }
}

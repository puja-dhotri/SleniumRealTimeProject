//package utils;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DriverFactory {
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//    public static void initDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver.set(new ChromeDriver());
//        getDriver().manage().window().maximize();
//        getDriver().get("https://tutorialsninja.com/demo/");
////       
////        WebDriverManager.edgedriver().setup();
////        driver.set(new EdgeDriver());
////        getDriver().manage().window().maximize();
////        getDriver().get("https://tutorialsninja.com/demo/");
//    }
//
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//
////    public static void quitDriver() {
////        getDriver().quit();
////        driver.remove();
////    }
//}

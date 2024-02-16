package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public enum DriverSource {

    //only one instance
    INSTANCE;
    ChromeOptions options = new ChromeOptions();
    private WebDriver driver;

    //    public WebDriver getDriver(){
//        if (driver == null){
//            driver = new ChromeDriver();
//            //options.addArguments("--headless");// addArguments kullandık.
//            //driver = new ChromeDriver(options);
//            options.addArguments("headless");
//            driver = new ChromeDriver(options);
//        }
//        return driver;
//    }
    public WebDriver getDriver(){
        if (driver == null){
            options.addArguments("--headless"); // Headless argümanı eklendi
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

    /**
        This is Utility class to get WebDriver object (web Browser)  with all needed settings
     */
    //-----------------------------------------------------------------------------------------------//

    public static WebDriver getDriver(String browserName){

        //1. Declare the driver
        WebDriver driver;

        //2. switch() between browsers
        switch (browserName.toLowerCase()){
            case "chrome" :
                WebDriverManager.chromedriver().setup();    //chrome
                driver = new ChromeDriver();
                break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();   //firefox
                driver = new FirefoxDriver();
                break;
            case "opera" :
                WebDriverManager.operadriver().setup();     //opera
                driver = new OperaDriver();
                break;
            case "edge" :
                WebDriverManager.edgedriver().setup();      //edge
                driver = new EdgeDriver();
                break;
            case "safari" :
                WebDriverManager.safaridriver().setup();    //safari
                driver = new SafariDriver();
                break;

            default:
                System.out.println("UNKNOWN BROWSER TYPE: " + browserName);
                driver = null;
        }

        //3.
        driver.manage().window().maximize();

        //4.
        return driver;

    }
    //-----------------------------------------------------------------------------------------------//


}

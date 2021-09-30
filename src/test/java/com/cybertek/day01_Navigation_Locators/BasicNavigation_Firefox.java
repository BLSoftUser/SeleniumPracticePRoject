package com.cybertek.day01_Navigation_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_Firefox {
    public static void main(String[] args) {

        //1. SetUp Firefox Driver, so Selenium can use it to automate chrome
        WebDriverManager.firefoxdriver().setup();
        //2. Create Chrome Driver object to open browser
        WebDriver driver = new FirefoxDriver();
        //3. Navigate to https://cybertek.com
        driver.navigate().to("https://cybertek.com");

        //4. Add an note for closing the browser
        System.out.println("Closing the browser");

        //5. quit()
        driver.quit();
    }
}

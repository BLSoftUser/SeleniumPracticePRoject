package com.cybertek.day01_Navigation_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {
    public static void main(String[] args) {
        //1. SetUp Chrome Driver, so Selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();
        //2. Create Chrome Driver object to open browser
        WebDriver driver = new ChromeDriver();
        //3. Navigate to https://
        driver.get("https://www.google.com/");

        /*
            - maximize the browser window
            - make the browser window full screen
         */
        //4. maximize the browser window
        driver.manage().window().maximize();

        //5. make the browser window full screen
        driver.manage().window().fullscreen();

        //6. closing browser:
        driver.quit();
    }
}

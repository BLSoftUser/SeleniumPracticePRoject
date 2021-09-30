package com.cybertek.day01_Navigation_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
    public static void main(String[] args) {

        //1. SetUp Chrome Driver, so Selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();

        //2. Create Chrome Driver object to open browser
        WebDriver driver = new ChromeDriver();

        //3. Navigate to https://google.com
        driver.navigate().to("https://google.com");


    }
}

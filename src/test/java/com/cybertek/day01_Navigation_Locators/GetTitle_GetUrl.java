package com.cybertek.day01_Navigation_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GetUrl {
    public static void main(String[] args) {
        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        //2. getTitle()
        System.out.println("getTitle() = " + driver.getTitle());

        //3. getCurrentUrl()
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //4. getPageSource()
        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        //5.quit the browser
        driver.quit();
    }
}

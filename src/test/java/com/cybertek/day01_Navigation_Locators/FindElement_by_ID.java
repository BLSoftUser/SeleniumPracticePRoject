package com.cybertek.day01_Navigation_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_by_ID {
    public static void main(String[] args) throws InterruptedException {
        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://yahoo.com");

        //2. locate search box and enter сиськи
        WebElement searchBox =  driver.findElement(By.id("ybar-sbq"));
        searchBox.sendKeys("сиськи");

        //3. locate the search button and click (or submit)
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();
        // searchBtn.submit(); works only with button in the form!!!

        //4. Wait for 5 sec
        Thread.sleep(5000);

        //5.quit the browser
        driver.quit();
    }
}

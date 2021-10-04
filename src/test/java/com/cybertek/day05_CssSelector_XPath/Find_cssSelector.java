package com.cybertek.day05_CssSelector_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_cssSelector {
    public static void main(String[] args) {
    //1. setup driver and navigate to...
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://searchyahoo.com/");
        driver.manage().window().maximize();
    //2. use cssSelector to identify the search button and enter "css selector"
        //#sbq-wrap>#yschsp
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        searchBox.sendKeys("css selector");
    //3. click on "x" icon to clear the text
        WebElement clearIcon = driver.findElement(By.cssSelector("#sbq-clear > span.sprite"));
        clearIcon.click();
    //4. enter "selenium locators" into search icon
        searchBox.sendKeys("selenium locators");
    //5. search button click()
        WebElement searchBtn = driver.findElement(By.cssSelector("#sf > button > span"));
        searchBtn.click();
    //6. quit the browser
        driver.quit();
    }
}

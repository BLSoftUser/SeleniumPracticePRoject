package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_by_LinkText_PartialLinkText_Practice {
    public static void main(String[] args) {
        //1. setup and navigate to http://practice.cybertekschool.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        //2. click on 1st link (A/B texting)
            // WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
            // firstLink.click();
        driver.findElement(By.linkText("A/B Testing")).click();     //second option of automate

        //3. navigate back
        driver.navigate().back();

        //4. maximize the screen window
        driver.manage().window().maximize();

        //5.1. click on 2nd link by.LinkText
            // driver.findElement(By.linkText("Add/RemoveAdd/Remove Elements")).click();
        //5.2. click on 2nd link by.PartialLinkText
            WebElement addOrRemoveLink = driver.findElement(By.partialLinkText("Add/Remove"));
            addOrRemoveLink.click();

        //6. click HomeBtn
        driver.findElement(By.linkText("Home")).click();

        //7. click on "Redirect Link"
        driver.findElement(By.linkText("Redirect Link")).click();

        //6. quite the browser
        driver.close();
    }
}

package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements__by_TagName_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://practice.cybertekschool.com/");

        WebElement firstLnk = driver.findElement(By.tagName("a"));
            System.out.println("firstLnk.getText() = " + firstLnk.getText());
        System.out.println("------------------------------------------------------------------");

                    //  Multiple results:
        List<WebElement> allATagElements = driver.findElements(By.tagName("a"));
            System.out.println("allATagElements.size() = " + allATagElements.size()); // Result: 50
        for (WebElement eachATagElement : allATagElements ) {
            System.out.println("eachATagElement.getText() = " + eachATagElement.getText());        }
        System.out.println("------------------------------------------------------------------");

        WebElement secondLnk = allATagElements.get(1);
            System.out.println("secondLnk.getText() = " + secondLnk.getText());
        WebElement thirdLnk = allATagElements.get(2);
            System.out.println("thirdLnk.getText() = " + thirdLnk.getText());

        Thread.sleep(500);
        driver.quit();
    }
}

package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement_by_ClassName {
    public static void main(String[] args) {

        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        WebElement element1 = driver.findElement(By.className("h1y"));
            System.out.println("element1.getText() = " + element1.getText());

        //find just one className item
        WebElement firstItem = driver.findElement(By.className("list-group-item"));
            System.out.println("firstItem.getText() = " + firstItem.getText());

        //find multiple className items
        List<WebElement> allLiTagElements = driver.findElements(By.className("list-group-item"));
            System.out.println("allLiTagElements.size() = " + allLiTagElements.size());

            //iterate all elements and getText of each
        for (WebElement eachElement : allLiTagElements ) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }
        driver.quit();
    }
}

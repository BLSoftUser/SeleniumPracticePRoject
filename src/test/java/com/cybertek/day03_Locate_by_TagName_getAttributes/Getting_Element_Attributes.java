package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_Element_Attributes {
    public static void main(String[] args) {
        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //2. identify and save the "searchBox" element and enter "Selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java");
            //2.1. Get tagName of the "searchBox" element
            System.out.println("2.1. searchBox.getTagName() = " + searchBox.getTagName());
                        //  Result: 2.1. searchBox.getTagName() = input
            //2.2. Get Value Attribute of the "searchBox" element
            System.out.println("2.2. searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));
                        //  Result: 2.2. searchBox.getAttribute("value") = Java

        //3. identify and save the "searchBtn" element
        WebElement searchBtn = driver.findElement(By.name("btnK"));
            //3.1. Get tagName of the "searchBtn" element
            System.out.println("3.1. searchBtn.getTagName() = " + searchBtn.getTagName());
                        //  Result: 3.1. searchBtn.getTagName() = input
            //3.2. Get class Attribute of the "searchBtn" element
            System.out.println("3.2. searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));
                        //  Result: 3.2. searchBtn.getAttribute("class") = gNO89b
            //3.3. click on "searchBtn"
            searchBtn.submit();

        //4. identify the element that holds "search result number"
        WebElement searchResult = driver.findElement(By.id("result-stats"));
            //4.1. Get text of the "search result number" element
            String resultText = searchResult.getText();
            System.out.println("resultText = " + resultText);

        driver.quit();
    }
}

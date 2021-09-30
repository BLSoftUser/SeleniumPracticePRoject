package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement_by_TagName {
    public static void main(String[] args) {

        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //2. identify and save the first element with <a> tag
        WebElement firstLnk = driver.findElement(By.tagName("a"));

        //3. print out the text
        System.out.println("3. firstLnk.getText() = " + firstLnk.getText());

        //4. identify and save all the elements with <a> tag
        List<WebElement>allLinks = driver.findElements(By.tagName("a"));
        System.out.println("4. allLinks.size() = " + allLinks.size());
        System.out.println("--------------------------------------------------");

        //5. iterate over the list and get the text of all link WebElement
        for(WebElement eachLink : allLinks){
            System.out.println("5. Link text is: " + eachLink.getText()); }

        //6. click on the home link
        firstLnk.click();

        //7. close the browser
        driver.quit();
    }
}

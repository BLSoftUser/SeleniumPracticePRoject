package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1. navigate to https://google.com
        driver.get("https://google.com");

        //2. search for `selenium`. identify google search box  using both  name
        WebElement searchBox = driver.findElement(By.name("q"));
                    searchBox.sendKeys("selenium");

        //3. click google search button  locate the search button and click (or submit)
        WebElement searchBtn = driver.findElement(By.name("btnK"));
                    searchBtn.submit();

        //4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        WebElement aboutLink = driver.findElement(By.id("result-stats"));

        //5. get the text of that element
        System.out.println("5. aboutLink.getText() = " + aboutLink.getText());
        System.out.println("----------------------------------------------------------------------------");


        //6. Optionally , if you want some java practice,
        // extract the number of result and save it into long variable OPTIONALLY
                //System.out.println("aboutLink.getSize() = " + aboutLink.getSize());

        //7. get all the links that contain text `selenium` into a List<WebElement>
        List<WebElement>  seleniumLinks = driver.findElements(By.partialLinkText("https://www."));
        for(WebElement eachSeleniumLink : seleniumLinks){
            System.out.println("7. eachSeleniumLink.getText() = " + eachSeleniumLink.getText());
        }

        System.out.println("----------------------------------------------------------------------------");
        //8. get the count of the the links that contain text `selenium` into a List<WebElement>
        System.out.println("8. seleniumLinks.size() = " + seleniumLinks.size());

        //9. get the first one text
        WebElement firstLink = seleniumLinks.get(0);
        System.out.println("9. firstLink.getText() = " + firstLink.getText());

        //10. get the last one text
        WebElement lastLink = seleniumLinks.get(seleniumLinks.size()-1);
        System.out.println("10. lastLink.getText() = " + lastLink.getText());

        //11. iterate over the list and print the text of each link
        for ( WebElement eachElementLink : seleniumLinks ) {
            System.out.println("11. eachElementLink.getText() = " + eachElementLink.getText());
        }

        //
        driver.quit();
        /*
        Homework 1:
1. navigate to https://google.com
2. search for `selenium`
3. click google search button
4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
5. get the text of that element
6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
7. get all the link that contain text `selenium` into a List<WebElement>
8. get the count
9. get the first one text
10. get the last one text
11. iterate over the list and print the text of each link
12. watch the short to learn more about `findElement(By.tagName("tag here"))`
13. watch the short to learn more about `element.getAttribute("attribute goes here")`
         */
    }
}

package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Find_MultipleElements {
    public static void main(String[] args) {
        //1. setup and navigate to http://practice.cybertekschool.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        //2. Find_MultipleElements
            // get all the links that have partialText "A" in it
        List<WebElement>  allLinks = driver.findElements(By.partialLinkText("A"));

        //3. get the size of the LIST with having partialText "A" in it
        System.out.println("allLinks.size() = " + allLinks.size());
                    // Result:  allLinks.size() = 7

        //4. get the first item and getText()
        WebElement firstItem = allLinks.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());

        //5. get the last item and getText()
        WebElement lastItem = allLinks.get(allLinks.size()-1);
        System.out.println("lastItem.getText() = " + lastItem.getText());

        //6. get the second item and getText()
        WebElement secondItem = allLinks.get(1);
        System.out.println("secondItem.getText() = " + secondItem.getText());
        System.out.println("------------------------------------------------");

        //6. getText() for the whole list and print out the text
        for( WebElement eachElement :allLinks ){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }           /* Result:
                        eachElement.getText() = A/B Testing
                        eachElement.getText() = Add/Remove Elements
                        eachElement.getText() = Autocomplete
                        eachElement.getText() = Basic Auth
                        eachElement.getText() = Entry Ad
                        eachElement.getText() = Form Authentication
                        eachElement.getText() = JavaScript Alerts   */
        //4. quite the browser
        driver.close();
    }
}

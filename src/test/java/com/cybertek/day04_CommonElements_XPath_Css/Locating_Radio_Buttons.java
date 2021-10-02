package com.cybertek.day04_CommonElements_XPath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locating_Radio_Buttons {
    public static void main(String[] args) {
    //1. setup driver and navigate to...
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
    //2. identify blue radio button
        WebElement blueRB = driver.findElement(By.id("blue"));
        System.out.println("2. blueRB.isSelected() = " + blueRB.isSelected()); //Result:   blueRB.isSelected() = true
    // 3. identify red radio button
        WebElement redRB = driver.findElement(By.id("red"));
        System.out.println("3. redRB.isSelected() = " + redRB.isSelected());   //Result:   redRB.isSelected() = false
        System.out.println("----------------------------------------------------------------");
    //4. click redRB
        redRB.click();
        System.out.println("4. after red is clicked, blueRB.isSelected() = " + blueRB.isSelected()); //Result:   blueRB.isSelected() = false
        System.out.println("4. after red is clicked, redRB.isSelected() = " + redRB.isSelected());   //Result:   redRB.isSelected() = true
    //5. identify green radio button
        WebElement greenRB = driver.findElement(By.id("green"));
        System.out.println("5. greenRB.isSelected() = " + greenRB.isSelected());    //Result:   greenRB.isSelected() = false
        System.out.println("5. greenRB.isEnabled() = " + greenRB.isEnabled());  //Result:   greenRB.isEnabled() = false
    //6. get list of all elements
        System.out.println("----------------------------------------------------------------");
        List<WebElement> groupRB = driver.findElements(By.name("color"));
        System.out.println("6. groupRB.size() = " + groupRB.size());   //Result:   groupRB.size() = 5
    //7. click on 3rd element from the list
        groupRB.get(2).click();
    //8.loop each of them to get attributes: id, isSelected, isEnabled
        for (WebElement eachRB : groupRB ) {
            System.out.println("----------");
            System.out.println("8. eachRB.getAttribute(\"id\") = " + eachRB.getAttribute("id"));
            System.out.println("8. eachRB.isSelected() = " + eachRB.isSelected());
            System.out.println("8. eachRB.isEnabled() = " + eachRB.isEnabled());
        }
        driver.quit();
    }
}

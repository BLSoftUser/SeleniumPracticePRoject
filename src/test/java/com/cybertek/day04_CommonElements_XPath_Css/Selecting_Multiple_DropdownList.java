package com.cybertek.day04_CommonElements_XPath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_DropdownList {
    public static void main(String[] args) {
    //1. setup driver and navigate to...
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

    //2. identify language Dropdown List
        WebElement languagesDropD = driver.findElement(By.name("Languages"));
        Select languagesSelectObj = new Select(languagesDropD);
        //2.1. check if it multiple selection list
            System.out.println("languagesSelectObj.isMultiple() = " + languagesSelectObj.isMultiple());
        //2.2. select item
            languagesSelectObj.selectByIndex(1);
            languagesSelectObj.selectByValue("java");
            languagesSelectObj.selectByVisibleText("Python");
        //2.3 De-select items
            languagesSelectObj.deselectByIndex(1);
            languagesSelectObj.deselectByValue("java");
            languagesSelectObj.deselectByVisibleText("Python");

    //3. deselect all
        languagesSelectObj.deselectAll();

    driver.quit();
    }
}

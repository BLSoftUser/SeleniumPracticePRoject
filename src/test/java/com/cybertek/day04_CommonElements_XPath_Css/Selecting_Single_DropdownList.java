package com.cybertek.day04_CommonElements_XPath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Single_DropdownList {
    public static void main(String[] args) {
    //1. setup driver and navigate to...
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

    //2. identify dropDown List Year and start create selector for it
        WebElement yearDropD = driver.findElement(By.id("year"));   //identify element
        Select yearSelectObj = new Select(yearDropD);               //
        //2.1. select item with: index, value, visible text.
            yearSelectObj.selectByIndex(2);             //select item with index 2
            yearSelectObj.selectByValue("1981");        //select item with value "1981"
            yearSelectObj.selectByVisibleText("1977");  //select item with visible text "1977"

    //3. identify dropDown List Year and start create selector for it
        WebElement monthDropD = driver.findElement(By.id("month"));
        Select monthSelectObj = new Select(monthDropD);
        //3.1 select item with: index, value, visible text.
            monthSelectObj.selectByIndex(5);
            monthSelectObj.selectByValue("10");
            monthSelectObj.selectByVisibleText("March");

    //4. identify dropDown List Year and start create selector for it
        WebElement dayDropD = driver.findElement(By.id("day"));
        Select daySelectObj = new Select(dayDropD);
        //4.1 select item with: index, value, visible text.
            // daySelectObj.selectByIndex(4);
            // daySelectObj.selectByValue("5");
            daySelectObj.selectByVisibleText("6");

        driver.quit();
    }
}

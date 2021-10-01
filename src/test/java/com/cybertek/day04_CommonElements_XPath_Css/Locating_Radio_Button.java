package com.cybertek.day04_CommonElements_XPath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Radio_Button {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRB = driver.findElement(By.id("blue"));
        System.out.println("blueRB.isSelected() = " + blueRB.isSelected());


        driver.quit();
    }
}

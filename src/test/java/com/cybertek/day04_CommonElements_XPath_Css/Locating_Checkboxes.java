package com.cybertek.day04_CommonElements_XPath_Css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Checkboxes {
    public static void main(String[] args) {
    //1. setup driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
    //2. identify first checkbox,  should be: checkbox1.isSelected() = false
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox1.getAttribute(\"checked\") = " + checkbox1.getAttribute("checked"));
    //3. identify second checkbox,  should be: checkbox2.isSelected() = true
        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
    //4.
        checkbox1.click();  // currently is unchecked, so click it to have it CHECKED
        checkbox2.click();  // currently is CHECKED, so click it to have it unchecked

        if (!checkbox1.isSelected()){   checkbox1.click();
            }else{      System.out.println("checkbox1 is already selected");  }
        if (!checkbox2.isSelected()) {  checkbox2.click();
            }else{      System.out.println("checkbox1 is already selected");  }
    //quit the browser
        driver.quit();
    }
}

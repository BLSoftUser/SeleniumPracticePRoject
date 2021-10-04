package com.cybertek.day05_CssSelector_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_by_XPath {
    public static void main(String[] args) {
    //1. setup driver and navigate to...
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
    //2. use the FULL XPath get the text: /html/body/div/div[2]/div/div/div/h1/span
        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());
                    //  Result: headerSpan.getText() = Test Automation Practice

    //3. use RELATIVE XPath to get the text: /h1/span
        WebElement headSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headSpan2.getText() = " + headSpan2.getText());
                    //  Result: headSpan2.getText() = Test Automation Practice

        driver.quit();


    }
}

package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_22 {
    public static void main(String[] args) {
        //1. open chrome and navigate to http://zero.webappsecurity.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://zero.webappsecurity.com/");

        //2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        System.out.println("2. driver.getTitle() = " + driver.getTitle());
                    //  Result: 2. driver.getTitle() = Zero - Personal Banking - Loans - Credit Cards

        //3. click on `signin button`
        WebElement signInBtn = driver.findElement(By.id("signin_button"));
        signInBtn.click();

        //4. verify the title is "Zero- Log in"
        System.out.println("4. driver.getTitle() = " + driver.getTitle());
                    //  Result: 4. driver.getTitle() = Zero - Log in

        //5. enter text as "username" into username box
        WebElement usernameBox = driver.findElement(By.id("user_login"));
        usernameBox.sendKeys("username");

        //6. enter text "password" into password box
        WebElement passwordBox = driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("password");

        //7. submit by clicking login button
        WebElement logInBtn = driver.findElement(By.name("submit"));
        logInBtn.click();

        //8. verify you are at "Zero - Account Summary" page by checking title
        System.out.println("8. driver.getTitle() = " + driver.getTitle());
                    //  Result: 8. driver.getTitle() = Privacy error
        driver.quit();
    }
}
/*
##  Homework 2

1. open chrome and navigate to http://zero.webappsecurity.com/
2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
3. click on `signin button`
4. verify the title is "Zero- Log in"
5. enter text as "username" into username box
6. enter text "password" into password box
7. submit by clicking login button
8. verify you are at "Zero - Account Summary" page by checking title
9. now use your imagination to play around here and explore , automate within the capacity we already have so far.
 */

package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_by_ID_Name_LinkText {
    public static void main(String[] args) throws InterruptedException {
        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");

        //2. Find loginBox, type login
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("tralala@gmail.com");

        //3. Find passwordBox, type password
        WebElement passwordBox = driver.findElement(By.name("pass"));
        passwordBox.sendKeys("123456789");

        //4. Find LogIn button and click()
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();

        //5. Wait 5 sec to see the result
        Thread.sleep(5000);

        //6. Find ForgotLink, click() on it
        WebElement forgotLink = driver.findElement(By.linkText("Forgot Password?"));
        forgotLink.click();

        //7. quit the browser
        driver.quit();
    }
}

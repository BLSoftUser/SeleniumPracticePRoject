package com.cybertek.Tests.day06_JUnit5_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_PracticeTest {

    WebDriver driver;     //1. Declare instance variable
    @BeforeEach     public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();    }
    @AfterEach  public void closingBrowser(){
        driver.quit();    }




    // navigate to the form page http://practice.cybertekschool.com/registration_form
    // identify the error message exists but not displayed
    // enter text "a" and check the error message displayed
    @Test   public void testErrorMessage(){
        driver.get("http://practice.cybertekschool.com/registration_form");

        String ErrorMsgString = "//small[text()='first name must be more than 2 and less than 64 characters long']";
            WebElement strLengthErrorElement = driver.findElement(By.xpath(ErrorMsgString));
            System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
                    //  Result: strLengthErrorElement.isDisplayed() = false
            WebElement firstNameField = driver.findElement(By.name("firstname"));
            firstNameField.sendKeys("a");
            System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
                    //  Result: strLengthErrorElement.isDisplayed() = true
    }

}

package com.cybertek.Tests.day06_JUnit5_Practice;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class YahooSearchTest extends TestBase {
    //1. Make it extending to the superClass TestBase

    @Test
    public void testYahooSearchHomePage(){
        driver.get("https://search.yahoo.com/");

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        // assert the page title is equal to expected results
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {
        driver.get("https://search.yahoo.com/");

        // enter "selenium" in searchBox and enter
        driver.findElement(By.id("yschsp")).sendKeys("selenium" + Keys.ENTER);

        Thread.sleep(1000);

        System.out.println("driver.getTitle() = " + driver.getTitle());

        // assert the pageTitle if it starts with selenium
        Assertions.assertTrue(driver.getTitle().startsWith("selenium"));
    }



}

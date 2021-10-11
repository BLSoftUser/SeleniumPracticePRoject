package com.cybertek.Tests.day06_JUnit5_Practice;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() throws InterruptedException {

        /**
        // we can instruct WebDriver to wait maximum amount of time
        // before throwing NoSuchElement Exception by using implicit wait
        // If element is not available , it will wait for maximum of 10second
        // If element is found before 10s for example 1 second - > It will move on to next step
        */

    //-----------------------------------------------------------------------------------------------//

    //1. add implicitly waiting time for 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //2.
        driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");

    //3. lick on "Remove" button
        driver.findElement(By.xpath("//button[.='Remove']")).click();

    //4. add waiting time for Selenium.
        // it's not needed if implicitly waiting time  is used
        // Thread.sleep(5000);

    //5. identify the text appeared
        WebElement itsGoneELM = driver.findElement(By.id("message"));
        String textWanted=itsGoneELM.getText();
       // System.out.println("itsGoneELM.getText() = " + itsGoneELM.getText());
        System.out.println(textWanted);

    //-----------------------------------------------------------------------------------------------//

    }

}

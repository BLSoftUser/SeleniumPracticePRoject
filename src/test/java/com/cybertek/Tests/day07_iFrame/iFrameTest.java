package com.cybertek.Tests.day07_iFrame;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void testSimpleIframe(){

    //1. navigate
        driver.get("http://practice.cybertekschool.com/iframe");

    //2. first of all switch to iFrame, there are 3 ways to switch the frame
        //2.1. by index number, first index is always starts with 0
            // driver.switchTo().frame(0);
        //2.2. by name or id
            // driver.switchTo().frame("mce_0_ifr");
        //2.3. by passing the  iFrame element
            WebElement iframeELM = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
            driver.switchTo().frame(iframeELM);

    //3. locate the p Tag and get the text in it
        WebElement pTagIFrameELM = driver.findElement(By.tagName("p"));
        System.out.println("pTagIFrameELM.getText() = " + pTagIFrameELM.getText());
                //  Result: pTagIFrameELM.getText() = Your content goes here

    //4. Get out from the frame: there are 2 (two) ways:
        //4.1. jump one level up outside the frame
            // driver.switchTo().parentFrame();
        //4.2. jump all the way to the main content
            driver.switchTo().defaultContent();

        //5. click() on Home link
        driver.findElement(By.linkText("Home")).click();
    }
}

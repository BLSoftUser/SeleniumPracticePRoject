package com.cybertek.Tests.day07_iFrame;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework_day07 extends TestBase {

    /**
     * 1. Navigate to https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default
     * 2. Verify Header on the right with Text `This is a Heading` is Displayed
     * 3. Verify paragraph right under above element with Text `This is a paragraph` is Displayed
     * 4. Click on `Run` Button on menu bar
     */

    @Test
    public void homeworkDay07(){

        //* 1. Navigate to https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default");

        //* 2. Verify Header on the right with Text `This is a Heading` is Displayed
            //2.1. first of all switch to iFrame, there are 3 ways to switch the frame
            driver.switchTo().frame("iframeResult");
            //2.2.locate the p Tag and get the text in it
            WebElement TagIFrameELM = driver.findElement(By.tagName("h1"));
            System.out.println("pTagIFrameELM.getText() = " + TagIFrameELM.getText());
                        //  Result: pTagIFrameELM.getText() = This is a Heading

         //* 3. Verify paragraph right under above element with Text `This is a paragraph` is Displayed
            WebElement TagIframeELM2 = driver.findElement(By.tagName("p"));
            System.out.println("TagIframeELM2.getText() = " + TagIframeELM2.getText());
                        //  Result: TagIframeELM2.getText() = This is a paragraph

        //* 4. Click on `Run` Button on menu bar
            //4.1. switch out the frame
            driver.switchTo().defaultContent();

            //4.2.Run button click()
            driver.findElement(By.xpath("//*[@id=\"runbtn\"]")).click();
    }
}

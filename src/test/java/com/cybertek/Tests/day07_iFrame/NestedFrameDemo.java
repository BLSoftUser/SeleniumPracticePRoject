package com.cybertek.Tests.day07_iFrame;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NestedFrameDemo extends TestBase {

    /**
     * In main content we have two frames:
     *                                  1. Top Frame:
     *                                      1.1. Left frame
     *                                      1.2. Middle frame
     *                                      1.3. Right Frame
     *
     *                                  2. Bottom Frame
     */

    @Test
    public void nestedFrameTest(){
        //1. navigate to http://practice.cybertekschool.com/nested_frames
            driver.get("http://practice.cybertekschool.com/nested_frames");

        //2. switch to the bottom frame  and  get the content from the bottom frame
            driver.switchTo().frame("frame-bottom");    //  use the name of the frame to switch
            WebElement bottomFRMTagELM = driver.findElement(By.tagName("body"));    // use tag: head
            System.out.println("bottomFRMTagELM.getText() = " + bottomFRMTagELM.getText());
            String expctTextBottomFrm = "BOTTOM";
                Assertions.assertEquals(expctTextBottomFrm, bottomFRMTagELM.getText());

        //3. switch out from the bottom frame to the default frame
            driver.switchTo().defaultContent();

        //4. switch to the Top frame -->> to middle frame -->>  and  get the content from the middle frame
            driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-middle");
                WebElement middleFRMTagELM = driver.findElement(By.id("content"));
                System.out.println("middleFRMTagELM.getText() = " + middleFRMTagELM.getText());

        //5. switch to the Top frame -->> to right frame -- get the text from the right frame
            driver.switchTo().parentFrame();    // switch out from middle frame to the Top frame
                driver.switchTo().frame("frame-right");
                WebElement rightFRMTextELM = driver.findElement(By.tagName("body"));
                System.out.println("rightFRMTextELM.getText() = " + rightFRMTextELM.getText());
                String expctTextRightFrm = "RIGHT";
                    Assertions.assertEquals(expctTextRightFrm, rightFRMTextELM.getText());

        //6. switch out to default content
            driver.switchTo().defaultContent();
    }
}

package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsTest extends TestBase {

    @Test
    public void testHoverOverAction(){
        //1. navigate to
            driver.get("http://practice.cybertekschool.com/hovers");

        //2.locate first image and HoverOver it
            WebElement img1ELM = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
                // (//div[@class='figure']/img)[1]
                // (//div[@class='figure']/img)[2]
                // (//div[@class='figure']/img)[3]
        //3. create Actions class for passing driver object
            Actions action = new Actions(driver);
        //4. move to the img1ELM element
            action.moveToElement(img1ELM).perform();

        //5. add waiting time method from the utilities package
            BrowserUtil.waitFor(5);

        //6. verify if User profile is displayed over the img1ELM
            WebElement firstProfileELM = driver.findElement(By.tagName("h5"));
            System.out.println("firstProfileELM.getText() = " + firstProfileELM.getText());
                        //  Result: firstProfileELM.getText() = name: user1
            Assertions.assertTrue( firstProfileELM.isDisplayed() );

        //7. locate second image and get the text
            WebElement img2ELM = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
                action.moveToElement(img2ELM).perform();
                BrowserUtil.waitFor(5);

        //8. perform these action in this sequence
                // hover over to 1st image -->> pause 2 second -->> hover over to 2nd image -->> pause 2 second -->>
                // then hover over to 1st image again -->> pause 2 second -->> then second image -->> pause 2 second
                // PERFORM THE ACTION!!!
            action.moveToElement(img1ELM).pause(2000).moveToElement(img2ELM).pause(2000)
                    .moveToElement(img1ELM).pause(2000).moveToElement(img2ELM).pause(2000).perform();

    }
}

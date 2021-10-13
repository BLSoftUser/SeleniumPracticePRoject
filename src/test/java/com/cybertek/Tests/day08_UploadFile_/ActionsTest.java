package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsTest extends TestBase {

    //---------------------------------------------------------------------------------//

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

    //---------------------------------------------------------------------------------//

    @Test
    public void testDragAndDrop(){
        //1. navigate to
            driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            BrowserUtil.waitFor(3);

        //2. identify smallCirce and bigCircle
            WebElement smallCircleELM = driver.findElement(By.id("draggable"));
            WebElement bigCircleELM = driver.findElement(By.id("droptarget"));

        //3. declare actions and  made an action DragAndDrop smallCircle to bigCircle
            Actions actions = new Actions(driver);
            actions.dragAndDrop( smallCircleELM, bigCircleELM).perform(); // smallCircle into the bigCircle

        //4. assert if text is appearing
            BrowserUtil.waitFor(3);
            Assertions.assertEquals( "You did great!" , bigCircleELM.getText() );
    }

    //---------------------------------------------------------------------------------//

    @Test
    public void testKeyBoardAction() {
        //1. navigate to https://www.google.com
            driver.get("https://www.google.com");
        //2. identify the search box
            BrowserUtil.waitFor(3);
            WebElement searchBX = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
        //3. create Actions class instance
            Actions actions = new Actions(driver);

        //4. click on search box and wait for 2 sec
            actions.click(searchBX).pause(2000).perform();

        //5. hold the SHIFT  and  enter text "i love selenium" >>> YOU SHOULD SEE UPPERCASE
            actions.keyDown(Keys.SHIFT).sendKeys("i love selenium").pause(2000).perform();

        //6. CTRL "A" and backSpace to delete the text
            actions
                    .keyDown(Keys.CONTROL).sendKeys("A").pause(2000)
                    .keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).pause(2000)
                    .perform();
    }

    //---------------------------------------------------------------------------------//


}

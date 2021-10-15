package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorTest extends TestBase {

    //-----------------------------------------------------------------------------------------//

    @Test
    public void testScrollWholeWindow(){
        //1. navigate to:
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtil.waitFor(2);
        //2. use execute method to run the Javascript
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //3. get JavascriptExecutor reference from driver variable, so we can run this js code window.scrollBy(0,1000)
            // scroll down to 1000 pixels, and 0 to left or right
        jse.executeScript("window.scrollBy(0,10000)");
        BrowserUtil.waitFor(2);

        //4. use loop to repeat scrolling for 10 times
        for (int i = 1;  i < 10  ; i++) {
            jse.executeScript("window.scrollBy(0,10000)");
            BrowserUtil.waitFor(1);
        }

    }

    //-----------------------------------------------------------------------------------------//

    @Test
    public void testScrollElementIntoView(){
            /** scroll down by passing arguments/WebElements */

        //1.
            driver.get("http://practice.cybertekschool.com/large");

        //2. get jse
            JavascriptExecutor jse = (JavascriptExecutor) driver;

        //3. declare scrolling number and locate "CybertekSchool" link and "Home" link
                int myScrollNumber = 1000;
            WebElement cybertekLnk = driver.findElement(By.linkText("Cybertek School"));
                BrowserUtil.waitFor(2);

        //4. Run Javascript to scroll the element into the view up to myScrollNumber amount:
            jse.executeScript("window.scrollBy( 0 , arguments[0] )", myScrollNumber );
                BrowserUtil.waitFor(2);

        //5. Run Javascript to scroll the element into the view up to cybertekLnk:
            jse.executeScript("arguments[0].scrollIntoView(true)", cybertekLnk);
                BrowserUtil.waitFor(2);

        //6. locate Home link and scroll the element into the view up to homeLnk
            WebElement homeLnk = driver.findElement(By.linkText("Home"));
            jse.executeScript("arguments[0].scrollIntoView(true)", homeLnk);
                BrowserUtil.waitFor(2);
    }

    //-----------------------------------------------------------------------------------------//

}

package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class HomeWork_day08 extends TestBase {

    /**
     * 1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
     * 2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
     * 3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
     * 4. It will open the link in new tab
     * 5. Click on the Dropdown Link again to open it.
     * 6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
     * 7. It will open the link in another windows.
     * 8. Repeat the same process for Facebook
     * 9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
     * 10. Optionally , if the title contains Facebook, Close the window|tab.
     * 11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
     * "Try Prime" link , Verify it isDisplayed.
     * 12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
     * 13. These exercise can be done separately instead of switching to the window, do your best judgement to do them together or separately.
     */

    @Test
    public void testHomeWorkDay08(){

        //0. provide extends TestBase for the class

        //1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
            driver.get("http://practice.cybertekschool.com/dropdown");

            String currentHandle = driver.getWindowHandle();
            System.out.println("currentHandle = " + currentHandle);
                    //  Result: currentHandle = CDwindow-D9B19C0E39AA637E9A9C2184FF7BCA4B

        //2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
            Actions action = new Actions(driver);
            WebElement lastDropELM = driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]"));
                action.moveToElement(lastDropELM).click().perform();
                BrowserUtil.waitFor(1);


        //3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
            // It will open the link in new tab
            WebElement googleLink =
                    driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a[@href='https://www.google.com/']"));
            action.keyDown(Keys.CONTROL).moveToElement(googleLink).pause(1000).click().release().perform();
                BrowserUtil.waitFor(1);

        //4. Click on the Dropdown Link again to open it.
            // Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
            // It will open the link in another windows.
                action.moveToElement(lastDropELM).click().perform();
            WebElement amazonLink =
                driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a[@href='https://www.amazon.com/']"));
                action.keyDown(Keys.CONTROL).moveToElement(amazonLink).pause(1000).click().release().perform();
                BrowserUtil.waitFor(1);

        //6. Repeat the same process for Yahoo
                action.moveToElement(lastDropELM).click().perform();
            WebElement yahooLink =
                driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a[@href='https://www.yahoo.com/']"));
                action.keyDown(Keys.CONTROL).moveToElement(yahooLink).pause(1000).click().release().perform();
                BrowserUtil.waitFor(1);

        //7. Repeat the same process for Facebook
                action.moveToElement(lastDropELM).click().perform();
            WebElement facebookLink =
                driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a[@href='https://www.facebook.com/']"));
                action.keyDown(Keys.CONTROL).moveToElement(facebookLink).pause(1000).click().release().perform();
                BrowserUtil.waitFor(4);

        //8. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
            Set<String> allHandles = driver.getWindowHandles();
            allHandles = driver.getWindowHandles();
                for ( String eachHandle : allHandles ) {
                    System.out.println("eachHandle = " + eachHandle);
                    driver.switchTo().window(eachHandle);   //switch to another handle
                    System.out.println("driver.getTitle() = " + driver.getTitle());
                   /*if(driver.getTitle().equalsIgnoreCase("Facebook - Log In or Sign Up")){
                    driver.switchTo().window(currentHandle).close();
                   } */
                }


        //10. Optionally , if the title contains Facebook, Close the window|tab.
        //11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
        //     * "Try Prime" link , Verify it isDisplayed.
        //12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
        //13. These exercise can be done separately instead of switching to the window, do your best judgement to do them together or separately.
        //



    }
}

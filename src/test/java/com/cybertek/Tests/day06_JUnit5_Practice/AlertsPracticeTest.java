package com.cybertek.Tests.day06_JUnit5_Practice;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsPracticeTest extends TestBase {
    //0. extends TestBase

    /**
    JavaScript alerts  are pop up after clicking the button

        There are 3(three) types of pop ups:
                * regular (ok), only click on ok
                * confirm (ok  or  cancel)
                * prompt (enter text) and select ok/cancel


        Alerts has 4 methods only:
            - accept() -->> click "ok" button
            - dismiss() -->> click "cancel" button
            - sendKey(yourText) -->> Enter text into the prompt
            - getText() -->> get the text from the alert box
     */

    @Test
    public void javaScriptAlerts(){

        //0. navigate to http://practice.cybertekschool.com/javascript_alerts
            driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //-----------------------------------------------------------------------------------------------//

        //1.1. click on the button  "Click for JS Alert"
            // driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();
            driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        //1.2. get the text from the Alert:
            System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        //1.3. accept the Alert
            driver.switchTo().alert().accept();

        //-----------------------------------------------------------------------------------------------//

        //2.1. click on the button  "Click for JS Confirm"
            driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        //2.2. get the text from the Alert:
            System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        //2.3 accept or dismiss the alert
            //driver.switchTo().alert().accept();
            driver.switchTo().alert().dismiss();

        //-----------------------------------------------------------------------------------------------//

        //3.1.  click on the button  "Click for JS Prompt"
            driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        //3.2. get the text from the Alert:
            System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        //3.3. enter the text into the prompt box
            driver.switchTo().alert().sendKeys("Thanks for the Alert");
        //3.4. accept or dismiss the alert
            //driver.switchTo().alert().accept();
            driver.switchTo().alert().accept();

        //-----------------------------------------------------------------------------------------------//
        System.out.println("The end!");

    }

}

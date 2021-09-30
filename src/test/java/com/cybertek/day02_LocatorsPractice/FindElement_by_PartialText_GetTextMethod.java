package com.cybertek.day02_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_by_PartialText_GetTextMethod {
    public static void main(String[] args) {
        //1. setup and navigate to http://practice.cybertekschool.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/");

        //2. identify the link using the PartialLink "Disappearing Elements"
        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));

        //3. take out the PartialLink "Disappearing Elements" by getText()
        System.out.println("myLink.getText() = " + myLink.getText());
                    // Result:  myLink.getText() = Disappearing Elements

        //4. Assign the String to a result of method()
        String fullLinkText = myLink.getText();
        System.out.println("fullLinkText = " + fullLinkText);
                    // Result:  fullLinkText = Disappearing Elements

        //5. findElement. by PartialLinkText as letter "A"
        WebElement aLink = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());
                    // Result:  aLink.getText() = A/B Testing

        //6. quite the browser
        driver.close();
    }
}

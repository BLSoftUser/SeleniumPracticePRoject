package com.cybertek.Tests.day06_JUnit5_Practice;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

public class XPathPracticeWithIndex extends TestBase {
    //0. extends TestBase


    @Test
    public void XPathWithIndexTest(){

        //0. navigate to http://practice.cybertekschool.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/tables");

        //-----------------------------------------------------------------------------------------------//

        //1. table[@id='table1']//tr[4]/td[2], print the text of 4th column and second row
            WebElement sampleCell42 = driver.findElement(By.xpath("//table[@id='table1']//tr[4]/td[2]"));
            System.out.println("sampleCell42.getText() = " + sampleCell42.getText());

        //2. assert if equals to...
            assertEquals("Tim" ,sampleCell42.getText() ) ;

        //3. table[@id='table1']//td[ text()='Jason'], print the text of
            WebElement cellWithTextJason = driver.findElement(By.xpath("//table[@id='table1']//td[ text()='Jason']"));
            System.out.println("cellWithTextJason text = " + cellWithTextJason.getText());
        //4. assert if equals to...
            assertEquals("Jason" ,cellWithTextJason.getText() ) ;

    }

}

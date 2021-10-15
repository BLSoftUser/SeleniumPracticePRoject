package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.BrowserUtil;
import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowTest extends TestBase {

    @Test
    public void testWindowOrTab(){
        //1. navigate: http://practice.cybertekschool.com/windows
            driver.get("http://practice.cybertekschool.com/windows");   BrowserUtil.waitFor(1);
        //2. save "windowHandle" of this tab  into "currentHandle" variable
            String currentHandle = driver.getWindowHandle();
            System.out.println("1. currentHandle = " + currentHandle); //  Result: 1. currentHandle = CDwindow-83DDDF3486F7EAFF4115BD17D26BD392
        //3. get the set of the windows/tabs  by using getWindowHandles() and soutv
            Set<String> allHandles = driver.getWindowHandles();
            System.out.println("1. allHandles = " + allHandles);
                    //  Results: 1. allHandles = [CDwindow-7F64CE1712A5F2F6E3525DA5E9BADCF7]    // its only one handle is open
        //4. click on the link " to generate a new window|tab
            WebElement clickHere = driver.findElement(By.linkText("Click Here"));
                clickHere.click();  BrowserUtil.waitFor(1);
        //5. now print the current window handle and all window handles
        System.out.println("2. After clicking the link driver.getWindowHandle() = " + driver.getWindowHandle());
                //  Result: 2. After clicking the link driver.getWindowHandle()
                            //  = CDwindow-A508277F215DA4149D827D465DA20DDF
        System.out.println("2. After clicking the link driver.getWindowHandles() = " + driver.getWindowHandles());
                //  Result: 2. After clicking the link driver.getWindowHandles()
                            //  = [CDwindow-A508277F215DA4149D827D465DA20DDF,
                            //  CDwindow-A44773F90B57B816D3105E74C101CC92]
        //6. reassign the new list to allHandles to get the latest list of the handles
            allHandles = driver.getWindowHandles();
        //7. use forEach loop, to iterate over the collection and getTitle for each window|tab
            for ( String eachHandle : allHandles ) {
                System.out.println("eachHandle = " + eachHandle);
                    driver.switchTo().window(eachHandle);   //switch to another handle
                System.out.println("driver.getTitle() = " + driver.getTitle());
            } /*
                eachHandle = CDwindow-767B25BA248B8D528E1F529E70CA1FC6
                    driver.getTitle() = Practice
                eachHandle = CDwindow-7A7C1F2C8E8C300047F6DF64BD8A91B5
                    driver.getTitle() = New Window
                */
        //8. switch from "New Window"  back to "Practice" window
            driver.switchTo().window(currentHandle);
                BrowserUtil.waitFor(1);
        //9. assert if the switching window result
        Assertions.assertEquals( "Practice" , driver.getTitle() );
    }
}

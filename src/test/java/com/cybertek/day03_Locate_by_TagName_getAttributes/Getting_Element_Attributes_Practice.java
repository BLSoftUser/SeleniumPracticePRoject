package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_Element_Attributes_Practice {
    public static void main(String[] args) {
        //1. setup driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        //2. identify search box and type "Selenium"
        WebElement searchBx = driver.findElement(By.name("q"));
        searchBx.sendKeys("Selenium");
        //3. get the class attribute
        System.out.println("3. searchBx.getAttribute(\"class\") = " + searchBx.getAttribute("class"));
                    //  Result: 3. searchBx.getAttribute("class") = gLFyf gsfi
        //4. max length
        System.out.println("4. searchBx.getAttribute(\"maxlength\") = " + searchBx.getAttribute("maxlength"));
                    //  Result: 4. searchBx.getAttribute("maxlength") = 2048
        //5. title
        System.out.println("5. searchBx.getAttribute(\"title\") = " + searchBx.getAttribute("title"));
                    //  Result: 5. searchBx.getAttribute("title") = Search
        //6. autocapitalize
        System.out.println("6. searchBx.getAttribute(\"autocapitalize\") = " + searchBx.getAttribute("autocapitalize"));
                    //  Result: 6. searchBx.getAttribute("autocapitalize") = none
        //7. spellcheck
        System.out.println("7. searchBx.getAttribute(\"spellcheck\") = " + searchBx.getAttribute("spellcheck"));
                    //  Result: 7. searchBx.getAttribute("spellcheck") = false
        //8. role
        System.out.println("8. searchBx.getAttribute(\"role\") = " + searchBx.getAttribute("role"));
                    //  Result: 8. searchBx.getAttribute("role") = combobox
        //9. extract the text from the attribute
        System.out.println("9. searchBx.getAttribute(\"value\") = " + searchBx.getAttribute("value"));
                    //  Result: 9. searchBx.getAttribute("value") = Selenium
        //quit
        driver.quit();
    }
}

package com.cybertek.day05_CssSelector_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_by_cssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://search.yahoo.com/");
        driver.manage().window().maximize();

        // TODO: identify searchBx by using css Selecto: by Id, by name...
        //<input type="text" class="sbq" id="yschsp" name="p" value="" autocomplete="off"
            // autofocus="" tabindex="1" role="combobox" aria-autocomplete="both">

        // WebElement searchBx = driver.findElement(By.cssSelector("#yschsp"));
        // WebElement searchBx = driver.findElement(By.cssSelector("input[name='p']"));
        // WebElement searchBx = driver.findElement(By.cssSelector("input[id='yschsp]"));
        WebElement searchBx = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBx.sendKeys("css selector");

        WebElement xButton = driver.findElement(By.cssSelector("button#sbq-clear > span"));
        xButton.click();

        searchBx.sendKeys("Selenium find elements");

        WebElement searchBtn = driver.findElement(By.cssSelector("span[title='Search']"));
        searchBtn.click();


        //driver.quit();

    }
}

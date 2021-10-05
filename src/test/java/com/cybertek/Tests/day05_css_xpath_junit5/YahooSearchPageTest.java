package com.cybertek.Tests.day05_css_xpath_junit5;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {


    @Test
    public  void testYahooSearchHomePageTitle(){
            /*     1.
        testYahooSearchHomePageTitle()
        test when you navigate to yahoo search page
        the title should be "Yahoo Search - Web Search"
            */
    //1. setup chrome driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");
    //2. declare two Strings
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
    //3. quit the browser, because we already getTitle()
        driver.quit();
    //4. compare if two Strings are equal:
        assertEquals(expectedTitle, actualTitle); // import static for all assert methods
    }


    @Test
    public void testYahooSearchResultPageTitle(){
            /*     2.
        test method name : testYahooSearchResultPageTitle
        test navigate to yahoo page
        and search for Selenium
        the page title should start with selenium
            */
    //1. setup chrome driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");
    //2. identify "searchBox", input "Selenium", hit "Enter key" on keyboard
        WebElement searchBX = driver.findElement(By.cssSelector("input[id='yschsp']"));
        searchBX.sendKeys("Selenium" + Keys.ENTER);
        // driver.findElement(By.cssSelector("#sf > button > span")).click();
    //3. the page title should start with selenium
        String expectedTitleStartsWith = "Selenium";
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.startsWith("Selenium"));
    //4. quit the browser
    driver.quit();

    }

}

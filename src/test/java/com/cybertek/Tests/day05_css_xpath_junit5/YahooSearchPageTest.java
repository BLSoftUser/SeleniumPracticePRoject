package com.cybertek.Tests.day05_css_xpath_junit5;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.jupiter.api.*;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {
    WebDriver driver;     //1. Declare instance variable
    @BeforeAll    public static void setupWebDriverManager(){
        WebDriverManager.chromedriver().setup();    }

    @BeforeEach    public void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();    }

    @AfterEach    public void closingBrowser(){
        driver.quit();    }

    @AfterAll    public static void compleateInfo(){
        System.out.println("All Tests() are completed!");    }

    @Test    public  void testYahooSearchHomePageTitle(){    /*     1.
        testYahooSearchHomePageTitle()
        test when you navigate to yahoo search page
        the title should be "Yahoo Search - Web Search"
            */
        driver.get("https://search.yahoo.com/");
            String expectedTitle = "Yahoo Search - Web Search"; // declare two Strings
            String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle); // compare if two Strings are equal. import static for all assert methods
    }

    @Test    public void testYahooSearchResultPageTitle(){   /*     2.
        test method name : testYahooSearchResultPageTitle
        test navigate to yahoo page
        and search for Selenium
        the page title should start with selenium
            */
        driver.get("https://search.yahoo.com/");
            WebElement searchBX = driver.findElement(By.cssSelector("input[id='yschsp']"));
            searchBX.sendKeys("Selenium" + Keys.ENTER); // hit "Enter key" on keyboard
        String expectedTitleStartsWith = "Selenium";
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.startsWith("Selenium"));    // the page title should start with selenium
    }
}

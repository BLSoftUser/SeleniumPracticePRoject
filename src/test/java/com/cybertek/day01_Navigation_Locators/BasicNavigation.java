package com.cybertek.day01_Navigation_Locators;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
public class BasicNavigation {
    public static void main(String[] args) {
        //1. SetUp Chrome Driver, so Selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();
        //2. Create Chrome Driver object to open browser
        WebDriver driver = new ChromeDriver();
        //3. Navigate to https://amazon.com
        driver.navigate().to("https://amazon.com");
        /*
        navigate using:
            - get("url")
            - navigate().to("url")
            - navigate().back()
            - navigate().forward()
            - navigate().refresh()
         */
        //4. navigate().to("url")
        driver.navigate().to("https://google.com");

        //5. navigate().back
        driver.navigate().back();

        //6. navigate().forward()
        driver.navigate().forward();

        //7. navigate().refresh()
        driver.navigate().refresh();

        //8. closing browser:
            // * close(), will close the current tab
            // * quit(), will close all tabs if there is more than one
        driver.quit();
    }
}

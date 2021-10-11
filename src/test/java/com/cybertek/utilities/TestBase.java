package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    // We will create this class abstract, because it does not has any test

    /**
        This is an Super Class "TestBase" :
            to setup the driver and closing the browser, for all subClasses
        Because its going to be repeated more then 2 times
     */

    //-----------------------------------------------------------------------------------------------//

    //1.
    public WebDriver driver;     //1. Declare driver and make it Public to have it accessible in another classes

    //2.
    @BeforeEach
    public void setupDriver(){
        // WebDriverManager.chromedriver().setup();
        // driver = new ChromeDriver();
        // driver.manage().window().maximize();

    //1. use the preferable browser
        driver = WebDriverFactory.getDriver("chrome");
            // call the driver in the specific browser form WebDriverFactory utilities class

    //2. add implicitly waiting time for 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //3.
    @AfterEach
    public void closingBrowser(){
        driver.quit();
    }

    //-----------------------------------------------------------------------------------------------//



}

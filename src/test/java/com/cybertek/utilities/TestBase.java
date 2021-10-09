package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
    // We will create this class abstract, because it does not has any test

    /**
        This is an Super Class "TestBase" :
            to setup the driver and closing the browser, for all subClasses
        Because its going to be repeated more then 2 times
     */

    //-----------------------------------------------------------------------------------------------//

    //1.
    WebDriver driver;     //1. Declare driver

    //2.
    @BeforeEach
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //3.
    @AfterEach
    public void closingBrowser(){
        driver.quit();
    }

    //-----------------------------------------------------------------------------------------------//



}

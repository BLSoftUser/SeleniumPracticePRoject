package com.cybertek.Tests.day06_JUnit5_Practice;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import static org.junit.jupiter.api.Assertions.*;
public class isDisplayed_PracticeTest {
    WebDriver driver;     //1. Declare instance variable
    @BeforeEach     public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();    }
    @AfterEach  public void closingBrowser(){
        driver.quit();    }

    @Test   public void testErrorMessage(){
        //1. navigate to
            driver.get("http://practice.cybertekschool.com/registration_form");
        //2. create a String for future testing comparison
            String ErrorMsgString = "//small[text()='first name must be more than 2 and less than 64 characters long']";
        //3. identify xpath Element, and sout isDisplay() for error message
            WebElement strLengthErrorElement = driver.findElement(By.xpath(ErrorMsgString));
            System.out.println("1. strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
                    //  Result: 1. strLengthErrorElement.isDisplayed() = false
        //4. add assertions to test if isDisplay()
            assertTrue( ! strLengthErrorElement.isDisplayed()   );
            assertFalse(  strLengthErrorElement.isDisplayed()   );
        //5. identify firstName Box and input "a", and sout isDisplay() for error message
            WebElement firstNameField = driver.findElement(By.name("firstname"));
            firstNameField.sendKeys("a");
            System.out.println("2. strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
                    //  Result: 2. strLengthErrorElement.isDisplayed() = true
        //6. add assertions: to test if isDisplay()  after the step.5. implemented
            assertTrue(  strLengthErrorElement.isDisplayed()   );
            assertFalse( ! strLengthErrorElement.isDisplayed()   );
    }
}

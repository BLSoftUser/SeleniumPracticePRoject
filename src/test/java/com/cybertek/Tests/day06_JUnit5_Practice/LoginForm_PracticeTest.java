package com.cybertek.Tests.day06_JUnit5_Practice;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.jupiter.api.*;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoginForm_PracticeTest {
    WebDriver driver;     //1. Declare instance variable
    @BeforeEach     public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();    }
    @AfterEach  public void closingBrowser(){   driver.quit();    }
    @Test   public void testLogin(){
        driver.get("http://practice.cybertekschool.com/login");
    //1. get the text from the opened page
        WebElement header = driver.findElement(By.xpath("//h2[ .='Login Page' ]"));
        System.out.println("header.getText() = " + header.getText());
    //2. input username
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
    //3. input login
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");
    //4. login Button click()
        driver.findElement(By.id("wooden_spoon")).click();
    //5. on the next page continue: get the text from the opened page
        WebElement loggedInMessage = driver.findElement(By.xpath("//div[@id='flash']"));
    //6. assertion:
        String expectedResult = "You logged into a secure area!";
        //  assertEquals(expectedResult , loggedInMessage.getText());
            assertTrue(loggedInMessage.getText().startsWith(expectedResult));
    //7. use isDisplayed() method to check an element is displayed on the screen
        System.out.println("loggedInMessage.isDisplayed() = " + loggedInMessage.isDisplayed());
    }
}

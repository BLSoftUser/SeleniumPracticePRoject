package com.cybertek.day01_Navigation_Locators;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
public class FindElement_by_LinkText {
    public static void main(String[] args) throws InterruptedException {
        //1. setup and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");

        //2. identify google search box  using both  name and id
        WebElement searchBox = driver.findElement(By.name("q"));
                    searchBox.sendKeys("Toyota camry 2009");

        //3. locate the search button and click (or submit)
        WebElement searchBtn = driver.findElement(By.name("btnK"));
                    searchBtn.submit();     // works only with button in the form!!!

        //4. navigate back to the https://www.google.com/
        driver.navigate().back();
        //5. Wait for 5 sec
        Thread.sleep(3000);

        //6. click on the "about" link
        WebElement aboutLink = driver.findElement(By.linkText("about"));
                    aboutLink.click();
        //7. Wait for 5 sec
        Thread.sleep(3000);

        //8.quit the browser
        driver.quit();
    }
}

package com.cybertek.day05_CssSelector_XPath;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
public class Find_Element_by_XPath2 {
    public static void main(String[] args) {
    //1. setup chrome driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://search.yahoo.com/");
        driver.manage().window().maximize();
    //2.use XPath to identify "searchBox" and enter the "XPath"
        WebElement searchBX = driver.findElement(By.xpath("//input[@name='p' and @type='text']"));
        searchBX.sendKeys("XPath");
    //3. use XPath to identify "clearButton" and click()
        driver.findElement(By.xpath("//button[@id='sbq-clear']//span[@class='sprite']")).click();
    //4. enter "selenium locators" into "searchBox"
        searchBX.sendKeys("Selenium locators");
    //5. use XPath to identify "searchButton" to search and searchButton.click()
        //  //button[@class='sbb']//span[@class='ico-syc mag-glass']
        //  //span[@title='Search']
        WebElement searchBTN = driver.findElement(By.xpath("//button[@class='sbb']//span[@class='ico-syc mag-glass']"));
        searchBTN.click();
    //6. navigate back
        driver.navigate().back();
    //8. quit the browser
        driver.quit();
    }
}

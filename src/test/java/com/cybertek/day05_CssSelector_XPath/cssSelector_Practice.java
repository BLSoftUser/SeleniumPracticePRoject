package com.cybertek.day05_CssSelector_XPath;
    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
public class cssSelector_Practice {
    public static void main(String[] args) {
    //1. setup chrome driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
    //2. locate "Email box" element by css Selector
            /*  input[type='text'][name='email']
                form input[name='email']
                div>input[name='email']
                form[id='forgot_password'] input[name='email']      */
        WebElement emailBX = driver.findElement(By.cssSelector("form[id='forgot_password'] input[name='email']"));
        emailBX.sendKeys("alex.stepan@moscow.ru");
    //3. "Retrieve password" button.click()
            /*  #form_submit
                #form_submit.radius
                button[id='form_submit'][class='radius']        */
        driver.findElement(By.cssSelector("button[id='form_submit'][class='radius']")).click();
    //4. new window.getTitle()
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.findElement(By.cssSelector(\"h4[name='confirmation_message']\")).getText() = "
                + driver.findElement(By.cssSelector("h4[name='confirmation_message']")).getText());
                    //  Result: driver.findElement(By.cssSelector("h4[name='confirmation_message']")).getText() =
                    //  Your e-mail's been sent!
    //5. quit the browser
        driver.quit();
    }
}

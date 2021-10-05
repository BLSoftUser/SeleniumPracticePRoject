package com.cybertek.day05_CssSelector_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentificationElements_RegistrationForm_byXPath {
    public static void main(String[] args) {
        //1. setup chrome driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();

        //2. identify the "Registration From" text        /*
           //h2[text()='Registration form']
           //h2[.()='Registration form']
           //div/h2[text()='Registration form']
           //div[@class='page-header']/h2[text()='Registration form']         */
        System.out.println("------------------------------------------------------");
        WebElement infoText = driver.findElement(By.xpath("//div[@class='page-header']/h2[text()='Registration form']"));
        System.out.println("infoText.getText() = " + infoText.getText());
                    //  Result: infoText.getText() = Registration form
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("------------------------------------------------------");
        //3. First name: //form//input[@type='text' and @class='form-control' and @name='firstname']
            //           //form//input[@type='text' and @name='firstname']
        WebElement firstNameBX = driver.findElement(By.xpath("//form//input[@type='text' and @name='firstname']"));
        firstNameBX.sendKeys("Alex");
        //4. Last name://form//input[@type='text' and @name='lastname']
        WebElement lastNameBX = driver.findElement(By.xpath("//form//input[@type='text' and @name='lastname']"));
        lastNameBX.sendKeys("Stepan");
        //5. User name: //form//input[@type='text' and @name='username']
        WebElement userNameBX = driver.findElement(By.xpath("//form//input[@type='text' and @name='username']"));
        userNameBX.sendKeys("UserAlexStepan");
        //6. Email address: //form//input[@type='text' and @name='email']
        WebElement emailBX = driver.findElement(By.xpath("//form//input[@type='text' and @name='email']"));
        emailBX.sendKeys("alex.stepan@moscow.com");
        //7. password:  //form//input[@type='password' and @name='password']
        WebElement passwordBX = driver.findElement(By.xpath("//form//input[@type='password' and @name='password']"));
        passwordBX.sendKeys("Alex.best.password");
        //8. Phone number:  //form//input[@type='tel' and @name='phone']
        WebElement phoneNumberBX = driver.findElement(By.xpath("//form//input[@type='tel' and @name='phone']"));
        phoneNumberBX.sendKeys("571-230-1111");
        //9. gender.click():    //input[@type='radio' and @value='male']
                WebElement genderMaleBTN = driver.findElement(By.xpath("//input[@type='radio' and @value='male']"));
                genderMaleBTN.click();
        //10. date of birth:    //input[@type='text' and @name='birthday']
        WebElement birthdayBX = driver.findElement(By.xpath("//input[@type='text' and @name='birthday']"));
        birthdayBX.sendKeys("09/03/1985");
        //11. department/office.click():    //select[@name='department']//option[@value='TRO']
                driver.findElement(By.xpath("//select[@name='department']//option[@value='TRO']")).click();
        //12. job title:    //*[@id="registrationForm"]/div[10]/div/select/option[3]
                driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select/option[3]")).click();
        //13. select language(s):   //div[@class='form-check form-check-inline']//input[@value='java']
                driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@value='java']")).click();
        //14. signup.click():   //button[@type='submit' and @id='wooden_spoon']
                driver.findElement(By.xpath("//button[@type='submit' and @id='wooden_spoon']")).click();
        //15.
        String Title;
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.findElement(By.xpath(\"//h4[@class='alert-heading']\")).getText() = "
                + driver.findElement(By.xpath("//h4[@class='alert-heading']")).getText());
                    //  Result: driver.findElement(By.xpath("//h4[@class='alert-heading']")).getText() = Well done!
        /*16.*/ driver.quit();
    }
}

package com.cybertek.day03_Locate_by_TagName_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework_31 {
    public static void main(String[] args) {
    //1. Setup driver and navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://saucedemo.com");
        driver.manage().window().maximize();
    //2. get the page title and print it out
        String title = driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());
    //3. Enter username
        WebElement userNameBox = driver.findElement(By.id("user-name"));
        userNameBox.sendKeys("standard_user");
    //4. Enter login
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
    //5. Click login button
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.submit();
    //6. Get name and price of the first product
        WebElement firstProduct = driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProduct.getText() = " + firstProduct.getText());
        WebElement firstProductPrice = driver.findElement(By.className("inventory_item_price"));
        System.out.println("firstProductPrice.getText() = " + firstProductPrice.getText());
        System.out.println("--------------------------------------------------------------------------");
    //7. Get all product names into List<WebElement>
        List<WebElement> allProductsName = driver.findElements(By.className("inventory_item"));
    //8. Get the product count
        System.out.println("allProductsName.size() = " + allProductsName.size());
    //9. print out the text of all products
        for (WebElement eachProductName : allProductsName ) {
            System.out.println(">>>>> eachProductName.getText() = " + eachProductName.getText());        }
    // 10. Click on the shopping cart link
        WebElement cartLnk = driver.findElement(By.className("shopping_cart_link"));
        cartLnk.click();
    //11. Click Continue To Shop button, to come back to product page
        WebElement continueShoppingBtn = driver.findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();
    //12. Quit the browser
        driver.quit();
    }
}

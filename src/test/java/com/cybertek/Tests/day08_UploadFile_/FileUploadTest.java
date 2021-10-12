package com.cybertek.Tests.day08_UploadFile_;

import com.cybertek.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FileUploadTest extends TestBase {

    @Test
    public void testFileUpload(){
        //1. navigate to: http://practice.cybertekschool.com/upload
        driver.get("http://practice.cybertekschool.com/upload");

        //2. choose a file source for uploading
        String FilePath1 = "C:\\Users\\Alex PC\\Desktop\\HTML_Class\\krasa2.jpg";

        //3. identify "upload" box and send the FilePath1 file
            driver.findElement(By.id("file-upload")).sendKeys(FilePath1);

        //4. click() on Submit button
            driver.findElement(By.id("file-submit")).click();
    }
}

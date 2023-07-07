package com.cydeo.tests.review.week4;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99_Upload_Test {


    @Test
    public void guru99_upload_test(){

        // TC: Guru99 Upload Test
        //1. Go to  “https://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        //2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("/Users/aysundamar/Downloads/some-file.txt");

        //3. Click terms of service check box
        Driver.getDriver().findElement(By.id("terms")).click();

        //4. Click Submit File button
        Driver.getDriver().findElement(By.cssSelector("button#submitbutton")).click();

        BrowserUtils.sleep(3);

        //5. Verify expected message appeared.
        // Expected: “1 file
        // has been successfully uploaded.
        WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//center[.='1 file has been successfully uploaded.']"));

        String actualMsg = resultMsg.getText();
        String expectedMsg = "1 file\nhas been successfully uploaded.";

        BrowserUtils.sleep(3);

        Assert.assertEquals(actualMsg,expectedMsg,"Result Message verification failed!");

    }
}

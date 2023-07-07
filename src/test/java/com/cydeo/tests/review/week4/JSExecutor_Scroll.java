package com.cydeo.tests.review.week4;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSExecutor_Scroll {

    @Test
    public void etsy_scroll_test() throws InterruptedException {

//         Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

//         Scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // window.scrollBy(x, y)  ; x(right or left) stands for horizontal line and y stands for vertical line(up or down)
       // js.executeScript("window.scrollBy(0, 5000)");

        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",email);



//         Generate random email and enter into subscribe box
        //         Click on Subscribe
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress());
        Driver.getDriver().findElement(By.xpath("//button[normalize-space(text())='Subscribe']")).click();
        Thread.sleep(10000);

//         Verify "Great! We've sent you an email to confirm your subscription." is displayed
          WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//div[normalize-space(text())=\"Great! We've sent you an email to confirm your subscription.\"]"));
//
        Thread.sleep(10000);
        Assert.assertEquals(resultMsg.getText(),"Great! We've sent you an email to confirm your subscription.");

        Driver.closeDriver();
    }
}

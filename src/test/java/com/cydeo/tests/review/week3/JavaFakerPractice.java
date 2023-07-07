package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaFakerPractice extends TestBase {

    @Test
    public void java_faker_test(){
        // TC: Java Faker practice
        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        Faker faker = new Faker();

        // 3. Enter username using java faker
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(faker.name().username());

        // 4. Enter password using java faker
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(faker.internet().password());

        // 5. Click to Login button
        WebElement loginBtn1 = driver.findElement(By.id("wooden_spoon"));
        loginBtn1.click();

        BrowserUtils.sleep(3);

        // 6. Verify text displayed on page
        //    Expected: "Your username is invalid!"
        WebElement resultText = driver.findElement(By.xpath("//div[normalize-space(text()) ='Your username is invalid!']"));
        String actualResulText = resultText.getText();
        String expectedResultText = "Your username is invalid!";

        System.out.println("result text:" + resultText.getText());

        Assert.assertTrue(actualResulText.contains(expectedResultText));


    }
}

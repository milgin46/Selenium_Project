package com.cydeo.tests.review.week2;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticePageLogin {

    // TC#2: Practice page Login test

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/login
    // 3. Enter username: "tomsmith"
    // 4. Enter password: "SuperSecretPassword"
    // 5. Click to Login button
    // 6. Verify text displayed on page
    //    Expected: "You logged into a secure area!"

    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome browser
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        // it will give time to the web app until webelement found
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        WebElement username1 = driver.findElement(By.name("username"));
        WebElement username2 = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement username3 = driver.findElement(By.cssSelector("input[name='username']"));

        username1.sendKeys("tomsmith");

        Thread.sleep(3000);

        // 4. Enter password: "SuperSecretPassword"
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("SuperSecretPassword");


        // 5. Click to Login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Login']"));
        loginBtn.click();


        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"

        WebElement resultText1 = driver.findElement(By.cssSelector(".flash.success"));
        WebElement resultText2 = driver.findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));

        System.out.println(resultText1.getText());

        String actualText = resultText1.getText();
        String expectedText = "You logged into a secure area!";

        if(actualText.contains(expectedText)){
            System.out.println("Text verification passed!");
        }else{
            System.out.println("Text verification failed!");
        }

        driver.quit();
    }
}

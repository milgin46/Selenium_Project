package com.cydeo.tests.review.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations_GetMethods {

    // TC#1: Navigations and Get methods Practice

    // 1. Open a chrome browser
    // 2. Go to: https://www.etsy.com
    // 3. Navigate to https://www.amazon.com/
    // 4. Navigate back, forward and refresh
    // 5. Write “selenium” in search box
    // 6. Press search button to search
    // 7. Verify title is "Amazon.com : selenium"
    // 8. Verify url contains "selenium"

    public static void main(String[] args) {

        // setting up driver browser with WebDriver manager was used in selenium 3 version
        // selenium 4 version doesn't need anymore
        WebDriverManager.chromedriver().setup();

        // 1. Open a chrome browser

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        // 2. Go to: https://www.etsy.com
        driver.get("https://www.etsy.com");

        // 3. Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // 4. Navigate back, forward and refresh
        driver.navigate().back(); // it will take us to the previous page which is etsy

        driver.navigate().forward(); // it will take us to the forward page which is amazon

        driver.navigate().refresh(); // it will refresh the current page

        // 5. Write “selenium” in search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        // if test steps was saying just search for "selenium you can use Keys.ENTER
       // searchBox.sendKeys("selenium"+ Keys.ENTER);

        // 6. Press search button to search
       WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
       searchButton.click();

        // 7. Verify title is "Amazon.com : selenium"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : selenium";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Amazon search title verification passed!");
        }else{
            System.out.println("Amazon search title verification failed!");
        }

        // 8. Verify url contains "selenium"
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "selenium";

        if(actualURL.contains(expectedURL)){
            System.out.println("Amazon search URL verification passed!");
        }else{
            System.out.println("Amazon search URL verification failed!");
        }

        // if you have more than 1 tab/windows, it will only close currently open tab
        // you can still use driver instance in other tabs/windows
      driver.close();

        // if you have multiple tab/windows open, it will close everything
        // it will kill driver session and you will not be able to use driver anymore
      driver.quit();




    }
}

package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebDriverWaitPage {

    // TC: WebdriverWait practice
// 1. Go to https://practice.cydeo.com/dynamic_loading/1
// 2. Click to start
// 3. Wait until loading bar disappears
// 4. Assert username inputbox is displayed
// 5. Enter username: tomsmith
// 6. Enter password: incorrectpassword
// 7. Click to Submit button
// 8. Assert “Your password is invalid!” text is displayed.

    public WebDriverWaitPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy(id="loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@placeholder='Enter username']")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn;

    @FindBy(id="flash")
    public WebElement errorMsg;






}

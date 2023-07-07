package com.cydeo.tests.review.week4;


import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest  {
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void guru99DragAndDropTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("draganddrop.url"));

        WebElement bank = Driver.getDriver().findElement(By.linkText("BANK"));
        WebElement accountType = Driver.getDriver().findElement(By.id("bank"));

        actions.dragAndDrop(bank, accountType).build().perform();

        WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
        WebElement bankAmount = Driver.getDriver().findElement(By.id("amt7"));

       //actions.dragAndDropBy(fiveK, 121, 50).perform();
       actions.dragAndDrop(fiveK , bankAmount).perform();

        Driver.closeDriver();

    }


}

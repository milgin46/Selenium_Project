package com.cydeo.tests.review.week4;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setup(){

        Driver.getDriver().get(ConfigurationReader.getProperty("webtable.url"));

    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();

        // You can also implement taking screenshot method here to take a screenshot after each test
    }
}

package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    //Java is tracking some information about our computer, our project, and username etc.
    //Let's print them out!
    @Test
    public void java_properties_reading_test(){

        //key = value
        //we pass the key, it will return the value.
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }

}

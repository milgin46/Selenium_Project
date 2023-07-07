package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //STEPS TO READ FROM PROPERTIES TYPE OF FILE

        //1- Create object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in the Java memory using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties file in the Properties object
        properties.load(file);

        //4- Use the "properties" object to read value from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.get(\"username\") = " + properties.get("username"));

        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));

    }

}

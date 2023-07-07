package com.cydeo.tests.day09_review_javafaker_driverUtil;

public class Singleton {

    //#1- Create private constructor
    private Singleton(){}

    //#2- Private static String
    private static String word; //by default word is null

    //#3- Utility method to return the 'private String' we just created
    public static String getWord(){

        if(word == null){
            //System.out.println("First time call. Word object is null.");
            System.out.println("First time call. Driver object is null.");
            System.out.println("Assigning value to it now.");
            //word = "something";
            word = "driver_adsf9876asdf9876asdf9876";
        }else{
            System.out.println("Driver already has a value.");
            //System.out.println("Word already has a value.");
        }

        return word;

    }

}

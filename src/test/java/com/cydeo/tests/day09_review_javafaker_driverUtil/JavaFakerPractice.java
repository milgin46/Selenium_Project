package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        //Create Java Faker object.
        Faker faker = new Faker();

        //Print out a random first name using Faker object
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        //Print out a random last name using Faker
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //Print out a full name
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //Print out a city
        System.out.println("faker.address().city() = " + faker.address().city());

        //Print out a zip code
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        //numerify() method is used to generate RANDOM digits with specific formatting.
        System.out.println("faker.numerify(\"###-###-###\") = " + faker.numerify("###-###-###"));
        System.out.println("faker.numerify(\"###-###-###\") = " + faker.numerify("999-###-###"));

        System.out.println("faker.numerify(\"####-####-####-####\") = " + faker.numerify("####-####-####-####"));

        //letterify() method is used to generate RANDOM letters with specific formatting
        System.out.println("faker.letterify(\"????-????-????\") = " + faker.letterify("????-????-????"));

        //bothify() method is used to generate both letters and digits randomly
        System.out.println("faker.bothify(\"#?#?-#?#?#-#?#?#?#?#\") = " + faker.bothify("#?#?-#?#?#-#?#?#?#?#"));

        //chuckNorris method is used to create chuckNorris facts
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.muhtar().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }

}

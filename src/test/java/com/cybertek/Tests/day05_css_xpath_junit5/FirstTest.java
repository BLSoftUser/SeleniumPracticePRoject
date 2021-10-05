package com.cybertek.Tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void testAddition(){
        int num1 = 10;
        int num2 = 7;
        int expectedResult = 17;
        Assertions.assertEquals(expectedResult, num1 + num2);
    }

    @Test
    public  void testString(){
        String msg = "I know Alfa";

        //String.1. assert this msg equals to "I know Alfa"
            // assertEquals() accept two parameters
        Assertions.assertEquals("I know Alfa", msg);


        //String.2. assert this msg starts with "I know"
            // assertTrue() accept ONLY one parameter
        Assertions.assertTrue(msg.startsWith("I know"));
    }



}

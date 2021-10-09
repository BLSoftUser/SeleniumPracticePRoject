package com.cybertek.Tests.day06_JUnit5_Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertFalseTest {

    @Test
    public void testNumber(){

        int num = 10;

        // write assertion to check the number is more than 9
        assertTrue( num > 9 );

        // write assertion to check the num is less than 5
        assertTrue( ! (num < 5) );
        assertFalse( num < 5 ); //easier to read the code

    }


}

package com.cybertek.Tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationDemoTest {

    @BeforeAll
    public static void initial(){   System.out.println("@BeforeAll runs only once before all tests()");    }

    @BeforeEach
    public void setup(){    System.out.println(">>>@BeforeEach runs before each Test() and before every Test()");    }

    @AfterEach
    public void end(){  System.out.println("   <<<@AfterEach runs after each Test() and after every Test()");    }

    @Test
    public void test1(){    System.out.println("   Test1 method is running");    }

    @Test
    public void test2(){    System.out.println("   Test2 method is running");    }

    @AfterAll
    public static void complete(){   System.out.println("@AfterAll runs only once after all tests()");    }

}

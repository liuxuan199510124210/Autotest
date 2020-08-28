package com.course.testng.suit;

import org.testng.annotations.*;

public class SuitConfig {
    @BeforeSuite
    public void BeforSuit(){
        System.out.println("BeforSuit运行了");
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println("AfterSuit运行了");
    }
    @BeforeTest
    public void Bfortest(){
        System.out.println("执行Befortest");
    }
    @AfterTest
    public void Aftertest(){
        System.out.println("执行Aftertest");
    }

}

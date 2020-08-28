package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnatation {
    @BeforeMethod
    public void beforMethod(){
        System.out.println("运行BeforMethod");
    }
    @Test
    public void test1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void test2(){
        System.out.println("运行Test2");
    }
    @AfterMethod
    public void afterMathod(){
        System.out.println("执行AfterMethod");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("执行BeforClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("运行AfterClass");
    }
    @BeforeSuite
    public void BeforSuit(){
        System.out.println("执行BeforSuit");
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println("执行AfterSuit");
    }
}

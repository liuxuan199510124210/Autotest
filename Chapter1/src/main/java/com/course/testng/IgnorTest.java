package com.course.testng;

import org.testng.annotations.Test;

public class IgnorTest {
    @Test
    public void ignore1(){
        System.out.println("ignore执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("执行ignore2");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("执行ignore3");
    }
}

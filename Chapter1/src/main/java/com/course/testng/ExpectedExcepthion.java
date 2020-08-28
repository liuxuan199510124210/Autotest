package com.course.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExcepthion {
    @Test(expectedExceptions = RuntimeException.class)
    public void test1(){
        throw new RuntimeException();
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void test2(){
        System.out.println("这是一个失败的异常测试");
    }
}

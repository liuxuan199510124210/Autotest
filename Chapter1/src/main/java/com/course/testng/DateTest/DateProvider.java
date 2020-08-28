package com.course.testng.DateTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class DateProvider {
    @Test(dataProvider = "date")
    public void testDateProvider(String name,int age){
        System.out.println("name+"+name+";age="+age);
    }
    @DataProvider(name = "date")
    public Object[][] providerDate(){
        Object[][] o=new Object[][]{
                {"zhyangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
    @Test(dataProvider = "mathoddate")
    public void test1(String name,int age){
        System.out.println(name+age);
    }
    @Test(dataProvider = "mathoddate")
    public void test2(String name,int age){
        System.out.println(name+age);

    }
    @DataProvider(name="mathoddate")
    public Object[][] testdate(Method method){
        Object [][] o=null;
        if(method.getName().equals("test1")){
            o=new Object[][]{
                    {"zhangsan",20}
            };
        }else if(method.getName().equals("test2")){
            o=new Object[][]{
                    {"lisi",25}
            };

        }
        return o;
    }
}

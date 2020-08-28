package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "sever")
    public void test1(){
        System.out.println("这是服务端的测试方法1");
    }
    @Test(groups = "sever")
    public void test2(){
        System.out.println("这是服务端的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4");
    }
    @BeforeGroups(groups = "sever")
    public void BeforeGroupsOnSever(){
        System.out.println("这是服务端运行前运行的");
    }
    @AfterGroups(groups = "sever")
    public void AfterGroupsOnSever(){
        System.out.println("这是服务端运行之后运行的代码");
    }
}
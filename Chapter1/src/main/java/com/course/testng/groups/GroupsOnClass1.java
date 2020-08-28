package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("Class1中stu1执行");
    }
    public void stu2(){
        System.out.println("Class1中stu2执行");
    }
    public void stu3(){
        System.out.println("Class1中stu3执行");
    }
}

package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("Class2中stu1执行");
    }
    public void stu2(){
        System.out.println("Class2中stu2执行");
    }
    public void stu3(){
        System.out.println("Class2中stu3执行");
    }
}

package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("Class3中的teacher1执行");
    }
    public void teacher2(){
        System.out.println("Class3中的teacher2执行");
    }public void teacher3(){
        System.out.println("Class3中的teacher3执行");
    }
}

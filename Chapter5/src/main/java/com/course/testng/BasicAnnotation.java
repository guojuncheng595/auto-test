package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("test测试01");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before测试方法之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after测试方法之后执行");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("before这是在类运行之前运行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After这是在类运行之后运行的方法 -- 类中的每一个测试用例前后都需要执行");
    }

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforeSuite类运行之前 -- 只执行一次");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite类运行之后 -- 只执行一次");
    }


}

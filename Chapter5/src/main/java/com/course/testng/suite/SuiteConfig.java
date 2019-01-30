package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit 运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }

}

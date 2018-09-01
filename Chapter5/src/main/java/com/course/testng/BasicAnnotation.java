package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //@Test是最基本的注解，用于把方法标记为测试的一部分
    @Test(groups = "testcase1")
    public void testcase1(){

        System.out.println("这是测试用例1");

    }

    @Test
    public void testcase2(){

        System.out.println("这是测试用例2");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之前运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest这是每个测试之前运行的");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest这是每个测试之后运行的");
    }

    @BeforeGroups("testcase1")
    public void beforeGroupOnTest1(){
        System.out.println("BeforeGroup这是在确定测试组之前运行的");
    }

    @AfterGroups("testcase1")
    public void afterGroupOnTest1(){
        System.out.println("AfterGroup这是在确定测试组之后运行的");
    }

}

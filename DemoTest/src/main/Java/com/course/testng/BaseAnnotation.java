package com.course.testng;

import org.testng.annotations.*;
import org.w3c.dom.ls.LSOutput;

public class BaseAnnotation {
    //最基本注解，用来把方法标记为测试的一部分
    @Test
    public void TestCase01(){
        System.out.println("这是测试用例01");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod在方法之前执行");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod在方法之后执行");
    }

    @Test
    public void TestCase02(){
        System.out.println("这是测试用例02");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass在类之前执行");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass在类之后执行");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }



}

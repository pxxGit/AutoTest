package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void Test01(){
        System.out.println("Test01方法执行成功");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"Test01"})
    public void Test02(){
        System.out.println("Test02方法依赖Test01方法执行成功");
    }
}

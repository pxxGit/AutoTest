package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore(){
        System.out.println("ignore执行");
    }

    @Test(enabled = false)
    public void ignore01(){
        System.out.println("ignore01执行");
    }

    @Test(enabled = true)
    public void ignore02(){
        System.out.println("ignore02执行");
    }
}

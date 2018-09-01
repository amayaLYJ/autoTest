package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvier(String name,int age){
        System.out.println("\n name = "+name+"; age = "+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("\ntest111方法"+"name = "+name+"; age = "+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("\ntest222方法"+"name = "+name+"; age = "+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"linda",23},
                    {"simon",32}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"linda", 53},
                    {"simon", 63}
            };
        }
        return result;
    }
}

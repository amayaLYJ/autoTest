package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    //在实际工作中，如果等待n秒无响应，则继续进行下一个测试
    @Test(timeOut = 3000)  //单位为毫秒值
    public void timeOutSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }


    @Test(timeOut = 3000)  //单位为毫秒值
    public void timeOutFailed() throws InterruptedException{
        Thread.sleep(4000);
    }
}
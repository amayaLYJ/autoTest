package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 *
 * invocationCount----表示执行的次数
 * threadPoolSize-----表示线程池的内线程的个数
 */

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}

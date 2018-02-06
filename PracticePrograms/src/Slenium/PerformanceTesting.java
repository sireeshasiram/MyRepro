package Slenium;

import org.testng.annotations.Test;

public class PerformanceTesting {
    @Test(invocationCount=12, threadPoolSize=4)
    public void runTest(){
        System.out.println("Thread Id: "+Thread.currentThread().getId());
    }
}

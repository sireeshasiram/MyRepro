package Slenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestParallelClassOne {

	@Test(timeOut=1000)
	public void testCaseOne() throws InterruptedException {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		Thread.sleep(5000);
	}

	@Test
	public void testCaseTwo() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}
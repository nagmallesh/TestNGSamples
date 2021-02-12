package com.TestNGTutorials.TestNGAnnotationattributes;

import org.testng.annotations.Test;

public class invocationTimeOut {
	@Test(invocationCount=4, invocationTimeOut=3000)
	public void invocationTimeOutTest() throws InterruptedException {			
		Thread.sleep(1000);		
		System.out.println("Test");	
		
	}
}

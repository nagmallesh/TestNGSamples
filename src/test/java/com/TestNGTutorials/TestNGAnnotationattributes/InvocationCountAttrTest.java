package com.TestNGTutorials.TestNGAnnotationattributes;

import static java.lang.System.out;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountAttrTest {
	@Test(invocationCount = 5)
	  public void testManagerLogin() {
		 print("manager login test");
		
	  }
	  
	  @Test
	  public void testEmployeeLogin() {
		  print("employee login test");
	  }
	  
	  public void print(String msg)
	  {
		  out.println(msg);
	  }
	  
}

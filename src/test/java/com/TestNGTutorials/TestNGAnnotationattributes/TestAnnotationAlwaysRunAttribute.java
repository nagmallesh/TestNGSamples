package com.TestNGTutorials.TestNGAnnotationattributes;

import static java.lang.System.out;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotationAlwaysRunAttribute {
	@Test
	  public void testManagerLogin() {
		 print("manager login test");
		 Assert.assertTrue(false);
	  }
	  
	  @Test
	  public void testEmployeeLogin() {
		  print("employee login test");
	  }
	  
	  @Test (dependsOnMethods = "testManagerLogin",alwaysRun = true)
	  public void testAdminLogin() {
		  print("admin login test");
	  }
	  
	  public void print(String msg)
	  {
		  out.println(msg);
	  }
}

package com.TestNGTutorials.DependencyTests;

import static java.lang.System.out;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebsiteLoginDependencyTest {
	 @Test
	  public void testManagerLogin() {
		 print("manager login test");
		 Assert.assertFalse(true);
	  }
	  
	  @Test
	  public void testEmployeeLogin() {
		  print("employee login test");
	  }
	  
	  @Test(dependsOnMethods = "testManagerLogin")
	  public void testAdminLogin() {
		  print("admin login test");
	  }
	  
	  public void print(String msg)
	  {
		  out.println(msg);
	  }
}

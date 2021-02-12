package com.TestNGTutorials.DependencyTests;

import static java.lang.System.out;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMultipleMethodsTest {
	@Test
	  public void testManagerLogin() {
		 print("manager login test");
		
	  }
	  
	  @Test
	  public void testEmployeeLogin() {
		  print("employee login test");
	  }
	  
	  @Test(dependsOnMethods = {"testManagerLogin","testEmployeeLogin"})
	  public void testAdminLogin() {
		  print("admin login test");
	  }
	  
	  public void print(String msg)
	  {
		  out.println(msg);
	  }
}

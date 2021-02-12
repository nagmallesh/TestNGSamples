package com.TestNGTutorials.TestNGAnnotationattributes;

import static java.lang.System.out;

import org.testng.annotations.Test;

public class PriorityAttributeTest {
	@Test(priority = 2)
	  public void testManagerLogin() {
		 print("manager login test");
		
	  }
	  
	  @Test
	  public void testEmployeeLogin() {
		  print("employee login test");
	  }
	  
	  @Test(priority=1)
	  public void testAdminLogin() {
		  print("admin login test");
	  }
	  
	  public void print(String msg)
	  {
		  out.println(msg);
	  }
}

package com.TestNGTutorials.DependencyTests;

import org.testng.annotations.Test;
import static java.lang.System.out;

/**
 * TestNG Executes methods on alphbetical order
 * @author nr734708
 *
 */
public class WebsiteLoginTest {
  @Test
  public void testManagerLogin() {
	 print("manager login test");
  }
  
  @Test
  public void testEmployeeLogin() {
	  print("employee login test");
  }
  
  @Test
  public void testAdminLogin() {
	  print("admin login test");
  }
  
  public void print(String msg)
  {
	  out.println(msg);
  }
}

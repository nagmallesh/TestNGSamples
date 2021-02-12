package com.TestNGTutorials.TestNGAnnotationattributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGTimeout {
  @Test(timeOut = 200)
  public void testGmailLogin() throws Exception {
	  
	  Thread.sleep(500);
  }
  @Test
 public void testHome()
 {
	 Reporter.log("test..",true);
 }
}

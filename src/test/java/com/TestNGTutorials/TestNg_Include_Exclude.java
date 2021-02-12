package com.TestNGTutorials;

import org.testng.annotations.Test;

public class TestNg_Include_Exclude {
 // @Test (enabled = false)
	@Test(description = "sampletest")
  public void testCase1() {
	    System.out.println("testCase1 executed........");
  }
  
  @Test
  public void testCase2() {
	    System.out.println("testCase2 executed........");

	  
  }
  @Test
  public void testMobileCase1() {
	    System.out.println("testCase2 executed........");

	  
  }
  @Test
  public void testMobileCase2() {
	    System.out.println("testCase2 executed........");

	  
  }
}

package com.TestNGTutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BasicAnnotations {
  
	
	 // Test Case 1
	   @Test
	   public void testCase1() {
	      System.out.println("in Test Case 1");
	   }

	   // Test Case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in Test Case 2");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in Before Method");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in After Method");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in Before Class");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in After Class");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in Before Test");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in After Test");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in Before Suite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in After Suite");
	   }
	   
	   /**
	    * Execution process is as follows:

First of all, beforeSuite() method is executed only once.

Lastly, the afterSuite() method executes only once.

Even the methods beforeTest(), beforeClass(), afterClass(), and afterTest() methods are executed only once.

beforeMethod() method executes for each test case but before executing the test case.

afterMethod() method executes for each test case but after executing the test case.

In between beforeMethod() and afterMethod(), each test case executes.


	    */
	   
}

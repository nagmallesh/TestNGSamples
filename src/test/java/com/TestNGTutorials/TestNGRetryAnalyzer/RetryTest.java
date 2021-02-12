package com.TestNGTutorials.TestNGRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
  @Test (retryAnalyzer = RetryAnalyzerImpl.class)
  public void testRetry() {
	  Assert.fail();
  }
}

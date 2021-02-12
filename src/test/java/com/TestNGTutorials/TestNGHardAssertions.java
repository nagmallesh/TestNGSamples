package com.TestNGTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertions {
	
	@Test
	public void testExportData()
	{
		
		Assert.assertEquals(18, 12,"serviceid wrong");
		Assert.assertEquals("Yahoo", " ","servicename wrong");
		Assert.assertEquals("user1", "user2","servicename wrong");


	}
 
	
}

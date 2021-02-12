package com.TestNGTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {
	@Test
	public void testExportData()
	{
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(18, 12,"serviceid wrong");
		softAssert.assertEquals("Yahoo", " ","servicename wrong");
		softAssert.assertEquals("user1", "user2","servicename wrong");
		
		softAssert.assertAll();


	}
}

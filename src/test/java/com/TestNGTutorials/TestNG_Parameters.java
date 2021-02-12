package com.TestNGTutorials;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
 
	  //https://www.tutorialspoint.com/testng/testng_parameterized_test.htm
	  //https://riptutorial.com/Download/testng.pdf  -> good for test annotation attributes, groups
	  //https://www.softwaretestingmaterial.com/soft-assert/   https://www.softwaretestingmaterial.com/testng-tutorial/
	//https://testng.org/doc/documentation-main.html#parallel-running
	  
	  
	  @Test
	  @Parameters({"username","age","mobilenumber","Male"})
	  public void testParametersTestForRegistrationForm(String uname, int age, long mobile_num, boolean sc)
	  {
		  
		  Reporter.log("name.."+uname,true);
		  Reporter.log("age.."+age,true);
		  Reporter.log("mobile_num.."+mobile_num,true);
          Reporter.log("Male.."+sc,true);
           
	  }

}

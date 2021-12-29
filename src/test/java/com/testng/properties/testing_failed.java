package com.testng.properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testing_failed {
	
	@Test(retryAnalyzer = rerun.class)
	private void username() {
		String actuals = "Ajith";
		String expected = "ajith";
		
		Assert.assertEquals(actuals, expected);
		System.out.println("Username Passed Suucefully");
	}
	@Test(retryAnalyzer = rerun.class)
	private void password() {
		
		String actuals = "Ajith@";
		String expected = "ajith@123";
		
		Assert.assertEquals(actuals, expected);
		System.out.println("Password Passed Suucefully");
		

	}

}

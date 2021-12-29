package com.testng.properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concepts {
	
	@Test
	private void username() {
		//String expected = "karthick";
		//String actual = "karthick";
		String user =null;
		//Assert.assertEquals(actual, expected);
		//Assert.assertEquals(actual, expected);
		//Assert.assertEquals(actual, expected, "username");
		//Assert.assertNotEquals(actual, expected);
		//Assert.assertFalse(false);
		//Assert.assertTrue(true, "username");
		Assert.assertNull(user);
		System.out.println("Username Succesfull");
		
		
		
	}

}

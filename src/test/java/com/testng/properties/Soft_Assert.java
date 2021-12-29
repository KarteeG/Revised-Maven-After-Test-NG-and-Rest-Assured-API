package com.testng.properties;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void username() {
		
		String actual = "Kartee";
		
		String expected = "Kartee";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		

	}
	

}

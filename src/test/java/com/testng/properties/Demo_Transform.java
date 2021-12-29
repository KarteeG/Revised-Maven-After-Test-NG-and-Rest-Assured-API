package com.testng.properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Transform {
	
	@Test
	private void username() {
		
		String expected = "Aj2ith";
		String actual = "Ajith";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Succedsfull Username");

	}
	@Test
	private void password() {
		
		String expected = "Ajith";
		String actual = "Ajith@";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Succedsfull Password");

	}

}

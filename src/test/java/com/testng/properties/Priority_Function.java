package com.testng.properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Function {
	
	@BeforeMethod
	private void login() {
		System.out.println("Before Method Login ");
	}
	@AfterMethod
	private void logout() {
		System.out.println("After Method Logout");
	}
	@Test(priority = 1)
	private void aTest() {
		System.out.println("First Method Test");
	}
	@Test(priority = 0)
	private void bTest() {
		System.out.println("Secoond Method Test");
	}
	@Test(priority = -1)
	private void cTest() {
		System.out.println("Third Method Test");
	}

}

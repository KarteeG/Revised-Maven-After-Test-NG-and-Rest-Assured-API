package com.testng.properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotataion {
	
	@BeforeSuite
	private void SuiteMethod() {
		System.out.println("Before Suite Method");
	}
	@BeforeTest
	private void testMethod() {
		System.out.println("Before Test Method");
	}
	@BeforeClass
	private void classMethod() {
		System.out.println("Before Class Methods");
	}
	@BeforeMethod
	private void login() {
		System.out.println("Before Method Login ");
	}
	@AfterMethod
	private void logout() {
		System.out.println("After Method Logout");
	}
	@Test
	private void aTest() {
		System.out.println("First Method Test");
	}
	@Test
	private void bTest() {
		System.out.println("Secoond Method Test");
	}
	@Test
	private void cTest() {
		System.out.println("Third Method Test");
	}
	@AfterClass
	private void calssafter() {
		System.out.println("After Class Method");
	}
	@AfterTest
	private void testAfter() {
		System.out.println("After Test Method");
	}
	@AfterSuite
	private void suiteAfter() {
		System.out.println("After Suite Method");
	}
}

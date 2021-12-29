package com.testng.properties;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"username","password"})
	private void demo(String username,
	String password) {
		
		System.out.println("Username :"+ username);
		System.out.println("Password: "+ password);
		
	}

	@Test
	@Parameters({"user","pass"})
	private void demo1(@Optional("Harshajith")String user,
	@Optional String pass) {
		
		System.out.println("Username :"+ user);
		System.out.println("Password: "+ pass);
		
	}

}

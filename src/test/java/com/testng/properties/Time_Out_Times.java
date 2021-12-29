package com.testng.properties;

import org.testng.annotations.Test;

public class Time_Out_Times {

	@Test(priority = 1,timeOut = 8000)
	private void firstMethod() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Open Browser");

		Thread.sleep(2000);
		System.out.println("url");

		Thread.sleep(2000);
		System.out.println("Credentials");

		System.out.println("Navigate");
	}

	@Test(priority = 2,timeOut = 6000)
	private void SecondMethod() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Open Browser");

		Thread.sleep(2000);
		System.out.println("url");

		Thread.sleep(2000);
		System.out.println("Credentials");

		System.out.println("Navigate");

	}

}

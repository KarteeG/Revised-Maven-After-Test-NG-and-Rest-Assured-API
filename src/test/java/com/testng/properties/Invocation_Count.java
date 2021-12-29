package com.testng.properties;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = 5,invocationCount = 2)
	private void am() {
		System.out.println("First Test");
	}
	@Test(priority = 4)
	private void bm() {
		System.out.println("Second Method");
	}
	@Test(priority = 3)
	private void cm() {
		System.out.println("Third Method");
	}
	@Test(priority = 2)
	private void dm() {
		System.out.println("Fourth Method");
	}
	@Test(priority = 1,invocationCount = 2)
	private void em() {
		System.out.println("Fifth Method");
	}

}

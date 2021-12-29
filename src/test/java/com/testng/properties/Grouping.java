package com.testng.properties;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority = 1,groups = "Group One")
	private void am() {
		System.out.println("First Test");
	}
	@Test(priority = 1,groups = "Group One")
	private void bm() {
		System.out.println("Second Method");
	}
	@Test(priority = 3,groups = "Group")
	private void cm() {
		System.out.println("Third Method");
	}
	@Test(priority = 2,groups = "Group Two")
	private void dm() {
		System.out.println("Fourth Method");
	}
	@Test(priority = 2,groups = "Group Two")
	private void em() {
		System.out.println("Fifth Method");
	}

}

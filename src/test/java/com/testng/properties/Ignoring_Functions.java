package com.testng.properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoring_Functions {
	
	@Test
	private void am() {
		System.out.println("First Test");
	}
	@Test
	private void bm() {
		System.out.println("Second Method");
	}
	@Test
	private void cm() {
		System.out.println("Third Method");
	}
	@Test(enabled = false)
	private void dm() {
		System.out.println("Fourth Method");
	}
	@Ignore
	@Test
	private void em() {
		System.out.println("Fifth Method");
	}

}

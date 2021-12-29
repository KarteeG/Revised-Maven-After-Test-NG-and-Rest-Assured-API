package com.testng.properties;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Expextec_Exception {

	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	private void Arthimetic() {
		int a = 10;
		System.out.println(a / 0);
	}

	@Test(priority = 2,expectedExceptions = NullPointerException.class)
	private void nullPointer() {
		String s = null;
		System.out.println(s.charAt(1));
	}

	@Test(priority = 3,expectedExceptions = StringIndexOutOfBoundsException.class)
	private void stringIndexOutOfBound() {
		String s = "null";
		System.out.println(s.charAt(10));
	}

	@Test(priority = 4,expectedExceptions = ArrayIndexOutOfBoundsException.class)
	private void arrayIndexOutOfBound() {
		int[] a = new int[5];
		a[6] = 10;
		System.out.println(a);
	}

	@Test(priority = 5,expectedExceptions = NumberFormatException.class)
	private void numberFormat() {
		int i = Integer.parseInt("java@123");
		System.out.println(i);
	}
	@Test(priority = 6,expectedExceptions = IndexOutOfBoundsException.class)
	private void index() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		Integer integer = a.get(5);
		System.out.println(integer);
	}
	@Test(priority = 7,expectedExceptions = Exception.class)
	private void arrayIndexOutOfBound2() {
		int[] a = new int[5];
		a[6] = 10;
		System.out.println(a);
	}

	@Test(priority = 8,expectedExceptions = Error.class)
	private void numberFormat2() {
		int i = Integer.parseInt("java@123");
		System.out.println(i);
	}
	@Test(priority = 9,expectedExceptions = ArithmeticException.class)
	private void index2() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		Integer integer = a.get(5);
		System.out.println(integer);
	}
	@Test(expectedExceptions = Error.class)
	private void er() {
		String expected = "karthick";
		String actual = "karthick";
		Assert.assertEquals(actual, expected);
		
	}
}

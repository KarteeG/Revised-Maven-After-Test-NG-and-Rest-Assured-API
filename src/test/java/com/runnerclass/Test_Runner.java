package com.runnerclass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class Test_Runner extends Base_Class {

	public static WebDriver driver;

//	private static void testMethod() {
//		unitTest();
//	}

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//		testMethod();

		driver = launchBroser("chrome");
		getUrl("https://www.amazon.in/");
		waitImp(5000, TimeUnit.SECONDS);
		maximize();
		
		JavaScroll("scrolldown");
		JavaScroll("scrollUP");
		JavaScroll("scroll");
		
		WebElement best = driver.findElement(By.xpath("//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]"));
		actionsFunctions("context", best, null);

		robotFunctions("down");
		robotFunctions("enter");
		
		//close();
		
		quit();
	}
}
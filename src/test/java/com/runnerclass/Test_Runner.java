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
		
		JavaScroll("scrollDown");

		WebElement siv = driver.findElement(By.xpath(
				"//a[@href=\"http://www.amazon.in/gp/redirect.html/ref=footer_twitter?location=http://twitter.com/AmazonIN&token=A309DFBFCB1E37A808FF531934855DC817F130B6&6\"]"));
		javaScriptOptions("scrollIntoView", siv);
		javaScriptOptions("click", siv);
	
		sleep(10000);
		sleep(10000);

		navigateBack();

		

	}
}
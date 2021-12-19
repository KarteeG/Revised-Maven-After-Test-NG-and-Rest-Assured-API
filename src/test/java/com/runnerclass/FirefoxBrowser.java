package com.runnerclass;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

public class FirefoxBrowser  extends Base_Class{
	
	public static WebDriver driver = launchBroser("firefox");
	
	public static void main(String[] args) {
		
	getUrl("https://www.google.co.in/");
	System.out.println("succefully gercko Lanch");
	
	maximize();
	
	System.gc();
	
	navigateTo("https://www.facebook.com/");
	
	}

}

package com.testNG_Adactin;

import org.openqa.selenium.WebDriver;

public class Adactin_Object_Manager {
	
	private WebDriver driver;
	private Adactin_Object_Model ap;
	
	public Adactin_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Adactin_Object_Model getInstanceap() {
		if (ap == null) {
			ap = new Adactin_Object_Model(driver);
		}return ap;
	}

}

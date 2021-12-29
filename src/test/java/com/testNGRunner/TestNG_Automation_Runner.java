package com.testNGRunner;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.testNG_Automation.Page_Automation_Manager;

public class TestNG_Automation_Runner extends Base_Class {

	public static WebDriver driver = launchBroser("chrome");
	Page_Automation_Manager pam = new Page_Automation_Manager(driver);
	Logger log = Logger.getLogger(TestNG_Automation_Runner.class);

	@BeforeClass
	private void browserLaunch() {
		BasicConfigurator.configure();
		getUrl("http://automationpractice.com/index.php");
		maximize();
		log.info("Browser Opened Succesfullly");

	}
	@BeforeMethod
	private void login() {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLP().getSigninButton());
		inputValues(pam.getInstanceLP().getUsername(), "kartee.sri@gmail.com");
		inputValues(pam.getInstanceLP().getPassword(), "password");
		clickOnElement(pam.getInstanceLP().getLogin());
		log.info("Login Succesfully");
	}
	@Test(priority = 1)
	private void Women() throws InterruptedException, IOException {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstancewp().getWomens());
		javaScriptOptions("scrollintoview", pam.getInstancewp().getFsst());
		clickOnElement(pam.getInstancewp().getFsst());
		sleep(5000);
		swithFrames("index", "0", null);
		inputValues(pam.getInstancewp().getQty(), "1");
		dropDown("visible", pam.getInstancewp().getSize(), "M");
		clickOnElement(pam.getInstancewp().getPtc());
		swithFrames("default", null, null);
		clickOnElement(pam.getInstancewp().getPtc1());
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc2());
		clickOnElement(pam.getInstancewp().getPtc2());
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc3());
		sleep(5000);
		clickOnElement(pam.getInstancewp().getPtc3());
		clickOnElement(pam.getInstancewp().getCheckbox());
		clickOnElement(pam.getInstancewp().getPtc4());
		javaScriptOptions("scrollintoview", pam.getInstancewp().getBwire());
		clickOnElement(pam.getInstancewp().getBwire());
		clickOnElement(pam.getInstancewp().getConfirm());
		JavaScroll("scrolldown");
		// screenShot("testNg Womes.png");
		log.info("Womens Purchase Succesfully");
	}

	@AfterMethod
	private void logout() {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLT().getLogout());
		log.info("Logout Succesfully");
	}

	@AfterClass
	private void close1() {
		close();
		log.info("Browser Closed Succesfully");
		
	}

	@Test(priority = 2)
	private void dresses() {
		waitImp(50, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceDP().getDress());
		clickOnElement(pam.getInstanceDP().getPd());
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceDP().getAtc());
		swithFrames("default", null, null);
		clickOnElement(pam.getInstanceDP().getPtc());
		clickOnElement(pam.getInstanceDP().getPtc1());
		clickOnElement(pam.getInstanceDP().getPtc2());
		clickOnElement(pam.getInstanceDP().getCheckbox());
		clickOnElement(pam.getInstanceDP().getPtc3());
		clickOnElement(pam.getInstanceDP().getBwire());
		clickOnElement(pam.getInstanceDP().getConfirm());
		JavaScroll("scrolldown");
		log.info("Dresses Purchase Succesfully");
		

	}
	@Test(priority = 2)
	private void TShirts() throws InterruptedException {
		waitImp(50, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceTS().getTshirts());
		clickOnElement(pam.getInstanceTS().getFsst());
		sleep(5000);
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceTS().getAtc());
		swithFrames("default", null, null);
		clickOnElement(pam.getInstanceTS().getPtc());
		clickOnElement(pam.getInstanceTS().getPtc1());
		clickOnElement(pam.getInstanceTS().getPtc2());
		clickOnElement(pam.getInstanceTS().getCheckbox());
		clickOnElement(pam.getInstanceTS().getPtc3());
		clickOnElement(pam.getInstanceTS().getBwire());
		clickOnElement(pam.getInstanceTS().getConfirm());
		JavaScroll("scrolldown");
		log.info("T-shirts Purchase Succesfully");
	}
	

}

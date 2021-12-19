package com.objectrunner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.pageobjectmanager.Automation_Manager;

public class Automation_Runner extends Base_Class {

	public static WebDriver driver = launchBroser("chrome");
	public static Automation_Manager am = new Automation_Manager(driver);
	static Logger log = Logger.getLogger(Automation_Manager.class);

//	public static Home_Page hp = new Home_Page(driver);
//	public static Signin_Page sp = new Signin_Page(driver);
//	public static My_Account m = new My_Account(driver);
//	public static Procced_To_Check_Out ptc = new Procced_To_Check_Out(driver);
//	public static Shipping_Cart_Summary scs = new Shipping_Cart_Summary(driver);
//	public static Addresses_Page ap = new Addresses_Page(driver);
//	public static Shipping_Page s = new Shipping_Page(driver);
//	public static Payment_Method pm = new Payment_Method(driver);
//	public static Order_Summary os = new Order_Summary(driver);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");

		getUrl("http://automationpractice.com/index.php");
		
		log.info("Browser Succesfully Launch");

		maximize();

		waitImp(5000, TimeUnit.SECONDS);

		clickOnElement(am.getInhanceHp().getSingnin());
		
		log.warn("Browser Succesfully Login");
		
		String unmae = readExcel("E:\\Work Based\\Project Based Folder\\My Own Test Cases\\Automation test cases.xlsx", 22, 5);

		inputValues(am.getInhancesp().getEmail(), unmae);
		
		String pass = readExcel("E:\\Work Based\\Project Based Folder\\My Own Test Cases\\Automation test cases.xlsx", 23, 5);

		inputValues(am.getInhancesp().getPassword(), pass);
		
		log.info("Username and PassWord Succesfully Entered");
		
		clickOnElement(am.getInhancesp().getSubmit());
		
		log.warn("Browser Submitted Login");

		clickOnElement(am.getInhancema().getCasulas());

		sleep(5000);

		javaScriptOptions("click", am.getInhancema().getAddToCart());

		sleep(5000);

		javaScriptOptions("scrollIntoView", am.getInhancema().getAddToCart());

		clickOnElement(am.getInstanceptc().getPtc());

		inputValues(am.getInstancescs().getQty(), "1");

		clickOnElement(am.getInstancescs().getPtc());

		clickOnElement(am.getinstanceap().getPtc());

		clickOnElement(am.getinstancess().getA());

		clickOnElement(am.getinstancess().getPtc());

		clickOnElement(am.getInstancepm().getB());
		
		clickOnElement(am.getInstanceos().getCon());
		
		screenShot("File.png");
		
		log.error("Hotel Booking Confirm");
		
		JavaScroll("scrolldown");
		
		sleep(6000);
		
		clickOnElement(am.getInstanceos().getSighnOut());
		
		close();
		
		log.info("Browser Closed Succesfully");

	}
}

package com.objectrunner;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.pageobjectmanager.Adactin_Manager;

public class Adactin_Runner extends Base_Class {
	
	public static WebDriver driver = launchBroser("chrome");
	
	public static Adactin_Manager ap = new Adactin_Manager(driver);
	
	static Logger log = Logger.getLogger(Adactin_Runner.class);
	
	public static void main(String[] args) throws Throwable {
		
	PropertyConfigurator.configure("log4j.properties");
	
	getUrl("https://adactinhotelapp.com/index.php");
	
	log.info("Borwser open Succesfully After Read File Using ");
	
	maximize();
	
	log.info("Maximmize the Browser Succesfully After Read File Using ");
	
	waitImp(5000, TimeUnit.SECONDS);
	
	String username = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 2, 5);
	
	inputValues(ap.getinstancemp().getUser(),username);
	
	String password = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 3,5);
	
	inputValues(ap.getinstancemp().getPass(), password);
	
	clickOnElement(ap.getinstancemp().getLogin());
	
	log.fatal("After Using Read Excel Login Succesfuuly");
	
	String locations = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 13, 5);
	
	dropDown("visible", ap.getinstanceshp().getLocation(), locations);
	
	String Hotel = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 14, 5);
	
	dropDown("visible", ap.getinstanceshp().getHotel(), Hotel);
	
	String Room_Type = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 15, 5);
	
	dropDown("visible", ap.getinstanceshp().getRoom(), Room_Type);
	
	String Noofrooms = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 16, 5);
	
	dropDown("visible", ap.getinstanceshp().getRoomnos(), Noofrooms);
	
	String cid = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 17, 5);
	
	inputValues(ap.getinstanceshp().getCid(), cid);
	
	String cod = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 18, 5);
	
	inputValues(ap.getinstanceshp().getCod(), cod);
	
	String adults = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 19, 5);
	
	dropDown("visible", ap.getinstanceshp().getAr(), adults);
	
	String cpr = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 20, 5);
	
	dropDown("visible", ap.getinstanceshp().getCr(), cpr);
	
	clickOnElement(ap.getinstanceshp().getSubmit());
	
	log.warn("Boser Get The Details Succcesfully ");
	
	
	clickOnElement(ap.getInstancesp().getBtn());
	
	clickOnElement(ap.getInstancesp().getCoc());
	
	log.error("Succesfully Navigate Next Page");
	
	sleep(5000);	
	
	String fnmae = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 24, 5);
	inputValues(ap.getInstancebh().getFname(), fnmae);
	
	String lname = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 25, 5);
	inputValues(ap.getInstancebh().getLname(), lname);
	
	String billing = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 26, 5);
	inputValues(ap.getInstancebh().getAdd(), billing);
	
	String ccno = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 27, 5);
	inputValues(ap.getInstancebh().getCc(), ccno);
	
	String cctype = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 28, 5);
	dropDown("visible", ap.getInstancebh().getCctype(), cctype);
	
	String mon = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 29, 5);
	dropDown("visible", ap.getInstancebh().getMonth(), mon);
	
	String year = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 30, 5);
	dropDown("value", ap.getInstancebh().getYear(), year);
	
	String cvv = readExcel("E:\\\\Work Based\\\\Project Based Folder\\\\My Own Test Cases\\\\Adactin test cases.xlsx", 31, 5);
	inputValues(ap.getInstancebh().getCvv(), cvv);
	
	clickOnElement(ap.getInstancebh().getBook());
	
	log.info("After Usign Read Excel Succesfully Booking");
	sleep(10000);	
	
	JavaScroll("scrolldown");
	
	clickOnElement(ap.getinstancebc().getLogout());
	
	close();
	
	log.fatal("Broswer Closed");
	
}
}




package com.properyrunner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helper.File_Reader;
import com.objectrunner.Adactin_Runner;
import com.pageobjectmanager.Adactin_Manager;

public class Adc_Pro_Runner extends Base_Class {
	public static WebDriver driver = launchBroser("chrome");

	public static Adactin_Manager ap = new Adactin_Manager(driver);

	static Logger log = Logger.getLogger(Adactin_Runner.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String Aurl = File_Reader.getInstanceFR().getInstanceCR().getInstanceAdactinURL();

		getUrl(Aurl);

		log.info("Borwser open Succesfully After Read File Using ");

		maximize();

		log.info("Maximmize the Browser Succesfully After Read File Using ");

		waitImp(5000, TimeUnit.SECONDS);

		String username = File_Reader.getInstanceFR().getInstanceCR().getInstanceAdUser();
		inputValues(ap.getinstancemp().getUser(), username);

		String password = File_Reader.getInstanceFR().getInstanceCR().getInstanceAdPass();
		inputValues(ap.getinstancemp().getPass(), password);

		clickOnElement(ap.getinstancemp().getLogin());

		log.fatal("After Using Read Excel Login Succesfuuly");

		String locations = File_Reader.getInstanceFR().getInstanceCR().getInstanceloaction();
		dropDown("visible", ap.getinstanceshp().getLocation(), locations);

		String Hotel = File_Reader.getInstanceFR().getInstanceCR().getInstanceHotels();
		dropDown("visible", ap.getinstanceshp().getHotel(), Hotel);

		String Room_Type = File_Reader.getInstanceFR().getInstanceCR().getInstanceRoomType();
		dropDown("visible", ap.getinstanceshp().getRoom(), Room_Type);

		String Noofrooms = File_Reader.getInstanceFR().getInstanceCR().getInstanceNoOfRooms();
		dropDown("visible", ap.getinstanceshp().getRoomnos(), Noofrooms);

		String cid = File_Reader.getInstanceFR().getInstanceCR().getInstanceCID();
		inputValues(ap.getinstanceshp().getCid(), cid);

		String cod = File_Reader.getInstanceFR().getInstanceCR().getInstanceCOD();
		inputValues(ap.getinstanceshp().getCod(), cod);

		String adults = File_Reader.getInstanceFR().getInstanceCR().getInstanceAPR();
		dropDown("visible", ap.getinstanceshp().getAr(), adults);

		String cpr = File_Reader.getInstanceFR().getInstanceCR().getInstanceCPR();
		dropDown("visible", ap.getinstanceshp().getCr(), cpr);

		clickOnElement(ap.getinstanceshp().getSubmit());

		log.warn("Boser Get The Details Succcesfully ");

		clickOnElement(ap.getInstancesp().getBtn());

		clickOnElement(ap.getInstancesp().getCoc());

		log.error("Succesfully Navigate Next Page");

		sleep(5000);
		
		String fnmae = File_Reader.getInstanceFR().getInstanceCR().getInstanceFName();
		inputValues(ap.getInstancebh().getFname(), fnmae);

		String lname = File_Reader.getInstanceFR().getInstanceCR().getInstanceLName();
		inputValues(ap.getInstancebh().getLname(), lname);

		String billing = File_Reader.getInstanceFR().getInstanceCR().getInstanceBilling();
		inputValues(ap.getInstancebh().getAdd(), billing);

		String ccno = File_Reader.getInstanceFR().getInstanceCR().getInstanceCCNo();
		inputValues(ap.getInstancebh().getCc(), ccno);

		String cctype = File_Reader.getInstanceFR().getInstanceCR().getInstanceCCType();
		dropDown("visible", ap.getInstancebh().getCctype(), cctype);

		String mon = File_Reader.getInstanceFR().getInstanceCR().getInstamceEcpMonth();
		dropDown("visible", ap.getInstancebh().getMonth(), mon);
		
		String year = File_Reader.getInstanceFR().getInstanceCR().getInstanceExpYear();
		dropDown("value", ap.getInstancebh().getYear(), year);

		String cvv = File_Reader.getInstanceFR().getInstanceCR().getInstanceCVV();
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

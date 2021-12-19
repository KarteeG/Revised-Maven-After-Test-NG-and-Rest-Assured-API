package com.properyrunner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helper.File_Reader;
import com.pageobjectmanager.Automation_Manager;

public class Auto_Prop_Runner extends Base_Class {
	
	public static WebDriver driver = launchBroser("chrome");
	public static Automation_Manager am = new Automation_Manager(driver);
	static Logger log = Logger.getLogger(Automation_Manager.class);


	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader.getInstanceFR().getInstanceCR().getInstanceAutomationUrl();
		getUrl(url);
		
		log.info("Browser Succesfully Launch");

		maximize();

		waitImp(5000, TimeUnit.SECONDS);

		clickOnElement(am.getInhanceHp().getSingnin());
		
		log.warn("Browser Succesfully Login");
		
		String unmae = File_Reader.getInstanceFR().getInstanceCR().getInstanceAuUser();
		inputValues(am.getInhancesp().getEmail(), unmae);
		
		String pass = File_Reader.getInstanceFR().getInstanceCR().getInstanceAcPass();
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

package com.testNGRunner;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.testNG_Adactin.Adactin_Object_Manager;

public class testNG_Adactin_Runner extends Base_Class {

	public static WebDriver driver = launchBroser("chrome");
	Logger log = Logger.getLogger(testNG_Adactin_Runner.class);
	Adactin_Object_Manager aom = new Adactin_Object_Manager(driver);

	@Test(priority = -5,groups = "Brower",timeOut = 10000)
	private void broweLaunch() {
		maximize();
	}

	@Test(priority = -4,groups = "Brower",timeOut = 5000)
	private void getURL() {
		getUrl("https://adactinhotelapp.com/index.php");
		waitImp(30, TimeUnit.SECONDS);
	}

	@Test(priority = 3,groups = "Login",dataProvider = "data")
	private void login(String username,String password) {
		inputValues(aom.getInstanceap().getUsername(), username);
		inputValues(aom.getInstanceap().getPassword(), password);
		clickOnElement(aom.getInstanceap().getLogin());
	}
	@DataProvider
	private Object[][] data() {
		return new Object[][] {
			{"karteeng","13990T"}
		};
	}
	@Ignore
	@Test(priority =-2,expectedExceptions = Exception.class,retryAnalyzer = Rerun.class)
	private void expextedException() throws InterruptedException {
		sleep(5000);
	}
	@Test(priority = 4,groups = "Login")
	private void sleepone() throws Throwable {
		sleep(5000);
	}
	@Test(priority = -3,invocationCount = 2,groups = "Refresh")
	private void refresh() throws Throwable {
		navigateRefresh();
	}

	@Test(priority = 5,enabled = false)
	private void sleeptwo() throws Throwable {
		sleep(5000);
	}

	@Test(priority = 6,groups = "SearhHotel")
	@Parameters({"location"})
	private void location(@Optional("Paris")String location) {
		dropDown("visible", aom.getInstanceap().getLocation(), location);
	}

	@Test(priority = 7,groups = "SearhHotel")
	@Parameters({"hotels"})
	private void hotel(@Optional("Hotel Sunshine")String hotels) {
		dropDown("visible", aom.getInstanceap().getHotel(), hotels);
	}

	@Test(priority = 8,groups = "SearhHotel")
	private void room_Type() {
		dropDown("visible", aom.getInstanceap().getRoom_type(), "Super Deluxe");
	}

	@Test(priority = 9,groups = "SearhHotel")
	private void noOfRooms() {
		dropDown("visible", aom.getInstanceap().getNoofrooms(), "4 - Four");
	}

	@Test(priority = 10,groups = "SearhHotels")
	private void cidcod() {
		inputValues(aom.getInstanceap().getCid(), "27/12/2021");
		inputValues(aom.getInstanceap().getCod(), "28/12/2021");
	}

	@Test(priority = 11,groups = "SearhHotels")
	private void adultsPerRoom() {
		dropDown("visible", aom.getInstanceap().getApr(), "3 - Three");
	}

	@Test(priority = 12,groups = "SearhHotels")
	private void childsperRoom() {
		dropDown("visible", aom.getInstanceap().getCpr(), "2 - Two");
	}

	@Test(priority = 13,groups = "SearhHotels")
	private void search() {
		clickOnElement(aom.getInstanceap().getSubmit());
	}

	@Test(priority = 14,groups = "SelectHotels")
	private void selectHotel() {
		clickOnElement(aom.getInstanceap().getSelect_Hotel());
		clickOnElement(aom.getInstanceap().getContinues());
	}

	@Test(priority = 15,groups = "Booking")
	private void bookaHotel() {
		inputValues(aom.getInstanceap().getFname(), "Kartchik");
		inputValues(aom.getInstanceap().getLname(), "NG");
		inputValues(aom.getInstanceap().getAdd(), "Address");
		inputValues(aom.getInstanceap().getCc_Num(), "4845454874248754");
		dropDown("visible", aom.getInstanceap().getCc_Type(), "Master Card");
		dropDown("visible", aom.getInstanceap().getExp_Month(), "December");
		dropDown("visible", aom.getInstanceap().getExp_Year(), "2022");
		inputValues(aom.getInstanceap().getCvv(), "000");
		clickOnElement(aom.getInstanceap().getBook());
	}

	@Test(priority = 16,groups = "Logout")
	private void myLit() {
		clickOnElement(aom.getInstanceap().getMy_Iti());
	}
	@Test(priority = 19,groups = "Logout")
	private void logout() throws Throwable {
		sleep(5000);
		clickOnElement(aom.getInstanceap().getLogout());
		close();
	}
	@Ignore
	@Test(priority = 17,groups = "Cacel")
	private void booked() throws Throwable {
		sleep(5000);
		clickOnElement(aom.getInstanceap().getSingle_Select());
		sleep(5000);
		clickOnElement(aom.getInstanceap().getCancel_Selected());
		sleep(5000);
		alert("accept",null, null);
	}
	@Ignore
	@Test(priority = 18,groups = "CacelAll")
	private void selectall() throws Throwable {
		sleep(5000);
		clickOnElement(aom.getInstanceap().getCheck_All());
		sleep(5000);
		clickOnElement(aom.getInstanceap().getCancel_Selected());
		sleep(5000);
		alert("accept",null, null);
	}

}

package com.testNG_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Object_Model {
	
	private WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement room_type;
	
	
	@FindBy(id = "room_nos")
	private WebElement noofrooms;
	
	@FindBy(id = "datepick_in")
	private WebElement cid;
	
	@FindBy(id = "datepick_out")
	private WebElement cod;
	
	@FindBy(id = "adult_room")
	private WebElement apr;
	
	@FindBy(id = "child_room")
	private WebElement cpr;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select_Hotel;
	
	@FindBy(id = "continue")
	private WebElement continues;
	
	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id = "cc_num")
	private WebElement cc_Num;
	
	@FindBy(id = "cc_type")
	private WebElement cc_Type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement exp_Month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement exp_Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	@FindBy(name = "my_itinerary")
	private WebElement my_Iti;
	
	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement check_All;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement single_Select;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	@FindBy(xpath = "//input[@name=\"cancelall\"]")
	private WebElement cancel_Selected;

	public WebElement getCancel_Selected() {
		return cancel_Selected;
	}

	public void setCancel_Selected(WebElement cancel_Selected) {
		this.cancel_Selected = cancel_Selected;
	}

	public Adactin_Object_Model(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCid() {
		return cid;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getApr() {
		return apr;
	}

	public WebElement getCpr() {
		return cpr;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSelect_Hotel() {
		return select_Hotel;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc_Num() {
		return cc_Num;
	}

	public WebElement getCc_Type() {
		return cc_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_Year() {
		return exp_Year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getMy_Iti() {
		return my_Iti;
	}

	public WebElement getCheck_All() {
		return check_All;
	}

	public WebElement getSingle_Select() {
		return single_Select;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	

}

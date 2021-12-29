package com.testNG_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens_Page {
	
	private WebDriver driver;
	
	@FindBy(xpath ="//a[@href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"]")
	private WebElement womens;
	
	@FindBy(xpath ="//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]")
	private WebElement fsst;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement qty;
	
	@FindBy(id = "group_1")
	private WebElement size;
	
	@FindBy(xpath ="(//p[@class='buttons_bottom_block no-print'])[1]")
	private WebElement ptc;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement ptc1;
	
	@FindBy (xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
	private WebElement ptc2;
	
	@FindBy(xpath ="(//button[@type='submit'])[2]")
	private WebElement ptc3;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement ptc4;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bwire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;

	public Womens_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getWomens() {
		return womens;
	}

	public WebElement getFsst() {
		return fsst;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getPtc() {
		return ptc;
	}

	public WebElement getPtc1() {
		return ptc1;
	}

	public WebElement getPtc2() {
		return ptc2;
	}

	public WebElement getPtc3() {
		return ptc3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPtc4() {
		return ptc4;
	}

	public WebElement getBwire() {
		return bwire;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	

}

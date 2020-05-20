package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	// Declaration
	@FindBy(id = "zip")
	private WebElement pincode;

	@FindBy(id = "fullName")
	private WebElement name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(xpath = "//span[@class='circle']")
	private WebElement mobile;

	@FindBy(id = "delivery-modes-continue")
	private WebElement save;

	@FindBy(id = "make-payment")
	private WebElement pay;

	// Intialization
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// Actions
	public WebElement getPinCode() {
		return pincode;
	}

	public void getName() {
		name.click();
	}

	public WebElement getFullName() {
		return name;
	}

	public void getAddress() {
		address.click();
	}

	public WebElement getAddress1() {
		return address;
	}

	public void getMobile() {
		mobile.click();
	}

	public void getSaveAndContinue() {
		save.click();
	}

	public void getProceedToPayment() {
		pay.click();
	}

}

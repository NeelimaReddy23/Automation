package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	// declaration
	@FindBy(xpath = "//form[@id='checkout-continue']")
	private WebElement proceedtopay;

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
	
	@FindBy(xpath="//span[text()='Cash On Delivery']")
	private WebElement cod;
	
	@FindBy(id="make-payment-button")
	private WebElement place;

	// initialization
	public CartPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// action
	public void getProceedToPay() {
		proceedtopay.click();
	}

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
	
	public void getCod(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(cod).perform();
		cod.click();
	}

	public void getPlace() {
		place.click();
	}
}

package com.capgemini.snapdeal.page;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_Multiple_Page {

	@FindBy(xpath = "//span[text()=\"Sign In\"]")
	public WebElement Signinbtn;

	@FindBy(xpath = "//a[@href=\"https://www.snapdeal.com/login\"]")
	public WebElement Loginbtn;

	@FindBy(id = "userName")
	public WebElement usertb;

	@FindBy(id = "checkUser")
	public WebElement continuebtn;

	@FindBy(id = "j_password_login_uc")
	public WebElement passwordtb;

	@FindBy(id = "submitLoginUC")
	public WebElement submitbtn;

	@FindBy(id = "inputValEnter")
	private WebElement search;

	@FindBy(xpath = "//button[@class='searchformButton col-xs-4 rippleGrey']/span")
	private WebElement onsearch;

	@FindBy(xpath = "//img[@title='Sirgan cotton White Hand Gloves(Pack of 10)']")
	private WebElement gloves;

	@FindBy(xpath = "//div[@id=\"add-cart-button-id\"]")
	private WebElement addtocart;

	@FindBy(xpath = "//span[text()=\"Cart\"]")
	private WebElement cart;

	@FindBy(xpath = "//div[@class=\"remove-item-div\"]")
	private WebElement remove;

	// initialization
	public Tc_Multiple_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// Actions
	public void getSignin(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(Signinbtn).perform();
	}

	public void getLogin() {
		Loginbtn.click();
	}

	public void getUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.switchTo().frame(0);
		usertb.click();
	}

	public WebElement getUserName() {
		return usertb;
	}

	public void clickContinue() {
		continuebtn.click();
	}

	public void getPassword() {
		passwordtb.click();
	}

	public WebElement getPass() {
		return passwordtb;
	}

	public void getSubmit() {
		submitbtn.click();
	}

	public void getWindow(WebDriver driver1) {

		PageFactory.initElements(driver1, this);
		String s1 = driver1.getWindowHandle();
		driver1.switchTo().window(s1);

	}

	public void getsearch() {
		search.click();
	}

	public WebElement getSearch() {
		return search;
	}

	public void onClick() {
		onsearch.click();
	}

	public void getGloves() {
		gloves.click();
	}

	public void getAddToCart(WebDriver driver1) {
		PageFactory.initElements(driver1, this);

		Set<String> s = driver1.getWindowHandles();
		int count = 0;
		for (String str : s) {
			count++;
			if (count == 2) {
				driver1.switchTo().window(str);
			}
		}
		addtocart.click();
	}

	public void getCart() {
		cart.click();
	}

	public void getRemove(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String a : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(a);
			}
		}
		remove.click();
	}

}

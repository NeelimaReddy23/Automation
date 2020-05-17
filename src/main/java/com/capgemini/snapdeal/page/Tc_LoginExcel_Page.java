package com.capgemini.snapdeal.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_LoginExcel_Page {

	// declaration
	@FindBy(xpath = "//span[text()=\"Sign In\"]")
	private WebElement Signinbtn;

	@FindBy(xpath = "//span[@class='accountBtn btn rippleWhite']/a")
	private WebElement Loginbtn;

	@FindBy(id = "userName")
	private WebElement usertb;

	@FindBy(id = "checkUser")
	private WebElement continuebtn;

	@FindBy(id = "j_password_login_uc")
	private WebElement passwordtb;

	@FindBy(id = "submitLoginUC")
	private WebElement submitbtn;

	@FindBy(xpath = "//span[@class=\"accountUserName col-xs-12 reset-padding\"]")
	private WebElement usernm;

	@FindBy(xpath = "//a[@href=\"https://www.snapdeal.com/logout\"]")
	private WebElement logoutbtn;

	// initialization
	public Tc_LoginExcel_Page(WebDriver driver) {
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

	public void getusername(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(usernm).perform();
	}

	public void getLogout() {
		logoutbtn.click();
	}

}

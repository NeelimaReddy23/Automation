package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// declaration
	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
	private WebElement signin;

	@FindBy(xpath = "//span[@class='accountBtn btn rippleWhite']/a")
	private WebElement login;

	@FindBy(xpath = "//input[@id='userName']")
	private WebElement username;

	@FindBy(id = "checkUser")
	private WebElement continu;

	@FindBy(id = "j_password_login_uc")
	private WebElement pwd;

	@FindBy(id = "submitLoginUC")
	private WebElement submit;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// action
	public void getSignin() {
		signin.click();
	}

	public void getLogin() {
		login.click();
	}

	public void getUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.switchTo().frame(0);
		username.click();
	}

	public WebElement getUserName() {
		return username;
	}

	public void clickContinue() {
		continu.click();
	}

	public void getPass() {
		pwd.click();
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void getSubmit() {
		submit.click();
	}

	public void getWindow(WebDriver driver) {

		PageFactory.initElements(driver, this);
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);

	}

}

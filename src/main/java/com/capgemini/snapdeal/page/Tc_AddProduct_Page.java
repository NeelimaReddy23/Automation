package com.capgemini.snapdeal.page;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_AddProduct_Page {

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

	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
	private WebElement getname;

	@FindBy(id = "inputValEnter")
	private WebElement search;

	@FindBy(xpath = "//button[@class='searchformButton col-xs-4 rippleGrey']/span")
	private WebElement onsearch;

	@FindBy(xpath = "//img[@title='RYAAL Hand Sanitizer 500 mL Pack of 1']")
	private WebElement ryaalsanitizer;

	@FindBy(xpath = "//div[@id=\"add-cart-button-id\"]")
	private WebElement addtocart;

	public Tc_AddProduct_Page(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void getSignin(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(signin).perform();
	}

	public void getLogin() {
		login.click();
	}

	public void getUser(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.switchTo().frame(0);
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

	public void getWindow(WebDriver driver1) {

		PageFactory.initElements(driver1, this);
		String s1 = driver1.getWindowHandle();
		driver1.switchTo().window(s1);

	}
	
	public void getName1() throws InterruptedException {
		Thread.sleep(3000);

	}

	public WebElement getName() {

		return getname;
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

	public void getRyaal() {
		ryaalsanitizer.click();
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

}

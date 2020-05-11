package com.capgemini.snapdeal.page;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_RemoveProduct_Page {

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

	@FindBy(xpath = "//input[@class='col-xs-20 searchformInput keyword']")
	private WebElement search;

	@FindBy(xpath = "//button[@class='searchformButton col-xs-4 rippleGrey']/span")
	private WebElement onsearch;

	@FindBy(xpath = "//img[@title=\"3 ply mask ANTI-INFECTANT FACE MASK (Pack Of 25)\"]")
	private WebElement facemask;

	@FindBy(xpath = "//div[@id=\"add-cart-button-id\"]")
	private WebElement addtocart;

	@FindBy(xpath = "//span[text()=\"Cart\"]")
	private WebElement cart;

	@FindBy(xpath = "//div[@class=\"remove-item-div\"]")
	private WebElement remove;

	// i[@class="sd-icon sd-icon-delete-sign"]

	public Tc_RemoveProduct_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

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

	public void getsearch() {
		search.click();
	}

	public WebElement getSearch() {
		return search;
	}

	public void onClick() {
		onsearch.click();
	}

	public void getFacemask() {
		facemask.click();
	}

	public void getAddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String a : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(a);
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

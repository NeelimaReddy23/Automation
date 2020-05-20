//package com.capgemini.snapdeal.page;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Tc_Deliver_Page {
//	
//	//declaration
//	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
//	private WebElement signin;
//
//	@FindBy(xpath = "//span[@class='accountBtn btn rippleWhite']/a")
//	private WebElement login;
//
//	@FindBy(xpath = "//input[@id='userName']")
//	private WebElement username;
//
//	@FindBy(id = "checkUser")
//	private WebElement continu;
//
//	@FindBy(id = "j_password_login_uc")
//	private WebElement pwd;
//
//	@FindBy(id = "submitLoginUC")
//	private WebElement submit;
//	
//	@FindBy(linkText = "See All Categories")
//	private WebElement categories;
//
//	@FindBy(xpath = "//*[@id=\"SMWrapr\"]/div[2]/ul/li[7]/a/span[2]")
//	private WebElement kids;
//
//	@FindBy(xpath = "//a[text()='Stationery']")
//	private WebElement stationery;
//
//	@FindBy(xpath = "//img[@title='Success Hero Fountain  Pen Iridium Nib Ink Pen Model 332 Gold Cap (Pack of 3)']")
//	private WebElement product;
//	
//	@FindBy(xpath = "//span[text()='buy now']")
//	private WebElement buy;
//	
//	@FindBy(id = "zip")
//	private WebElement pincode;
//
//	@FindBy(id = "fullName")
//	private WebElement name;
//
//	@FindBy(id = "address")
//	private WebElement address;
//
//	@FindBy(xpath = "//span[@class='circle']")
//	private WebElement mobile;
//
//	@FindBy(id = "delivery-modes-continue")
//	private WebElement save;
//
//	@FindBy(id = "make-payment")
//	private WebElement pay;
//
//	//Intialization
//	public Tc_Deliver_Page(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
//	}
//
//	//actions
//	public void getSignin() {
//		signin.click();
//	}
//
//	public void getLogin() {
//		login.click();
//	}
//
//	public void getUser(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//		driver.switchTo().frame(0);
//		username.click();
//	}
//
//	public WebElement getUserName() {
//		return username;
//	}
//
//	public void clickContinue() {
//		continu.click();
//	}
//
//	public void getPass() {
//		pwd.click();
//	}
//
//	public WebElement getPwd() {
//		return pwd;
//	}
//
//	public void getSubmit() {
//		submit.click();
//	}
//	
//	public void getWindow(WebDriver driver) {
//
//		PageFactory.initElements(driver, this);
//		String s1 = driver.getWindowHandle();
//		driver.switchTo().window(s1);
//
//	}
//	
//	public void getCategories(WebDriver driver) throws InterruptedException {
//		PageFactory.initElements(driver, this);
//		Actions action = new Actions(driver);
//		Thread.sleep(1000);
//		action.moveToElement(categories).perform();
//		categories.click();
//	}
//
//	public void getKids() {
//		kids.click();
//	}
//
//	public void getStationery() {
//		stationery.click();
//	}
//
//	public void getProduct() {
//		product.click();
//	}
//	
//	public void getBuy(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//		Set<String> s = driver.getWindowHandles();
//		int count = 0;
//		for (String a : s) {
//			count++;
//			if (count == 2) {
//				driver.switchTo().window(a);
//			}
//		}
//		buy.click();
//	}
//
//	public WebElement getPinCode() {
//		return pincode;
//	}
//
//	public void getName() {
//		name.click();
//	}
//
//	public WebElement getFullName() {
//		return name;
//	}
//
//	public void getAddress() {
//		address.click();
//	}
//
//	public WebElement getAddress1() {
//		return address;
//	}
//
//	public void getMobile() {
//		mobile.click();
//	}
//
//	public void getSaveAndContinue() {
//		save.click();
//	}
//
//	public void getProceedToPayment() {
//		pay.click();
//	}
//
//}

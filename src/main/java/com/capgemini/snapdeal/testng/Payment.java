package com.capgemini.snapdeal.testng;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

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

	public Payment(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void getSignin(WebDriver driver1) throws InterruptedException {
		PageFactory.initElements(driver1, this);
		Actions action = new Actions(driver1);

		Thread.sleep(1000);

		action.moveToElement(signin).perform();

		login.click();
		driver1.switchTo().frame(0);
		username.click();
		username.sendKeys("neelimareddyece@gmail.com");
		continu.click();
		pwd.click();
		pwd.sendKeys("neelima2301@");
		submit.click();
		String s1 = driver1.getWindowHandle();
		driver1.switchTo().window(s1);

		Thread.sleep(3000);

		Thread.sleep(3000);

		String a1 = getname.getText();
		System.out.println(a1);
//		String expected = "Neelima";
//		 Assert.assertEquals(a1, expected);

	}

	@FindBy(linkText = "Sitemap")
	private WebElement sitemap;

	@FindBy(xpath = "//a[@title='Air Freshners']")
	private WebElement airfreshner;

	@FindBy(xpath = "//div[@class='sort-selected']")
	private WebElement sortby;

	@FindBy(xpath = "(//li[@class='search-li'])[2]")
	private WebElement lowtohigh;

	@FindBy(xpath = "//img[@src='https://n4.sdlcdn.com/imgs/h/5/9/230X258_sharpened/Mysore-SPRING-FLOWER-AIR-COFFEE-SDL632946194-1-b116a.webp']")
	private WebElement image;

	@FindBy(xpath = "//div[@data-state='Buy Now']")
	private WebElement buynow;

	@FindBy(id = "username")
	private WebElement email;

	@FindBy(id = "login-continue")
	private WebElement login1;

	@FindBy(id = "w_password")
	private WebElement pwd1;

	@FindBy(id = "login-done")
	private WebElement logindone;

	@FindBy(xpath = "//input[@data-address-field='recipientName']")
	private WebElement fullname;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(xpath = "(//span[@class='circle'])[1]")
	private WebElement homeaddress;

	@FindBy(id = "delivery-modes-continue")
	private WebElement savencontinue;

	@FindBy(xpath = "//div[@class='rippleWhite btn']")
	private WebElement deliverhere;

	@FindBy(xpath = "//span[@class='accountUserName col-xs-12 reset-padding']")
	private WebElement signout;

	@FindBy(xpath = "//a[@class='accountBtn rippleWhite sign logout-account']")
	private WebElement logout;

	public void getPayment(WebDriver driver1) throws InterruptedException {
		sitemap.click();
		airfreshner.click();
		Thread.sleep(1000);
		sortby.click();
		Thread.sleep(1000);
		lowtohigh.click();
		image.click();
		PageFactory.initElements(driver1, this);
		String str1 = driver1.getWindowHandle();
		System.out.println(str1);

		Set<String> s = driver1.getWindowHandles();
		int count = 0;
		for (String str : s) {
			count++;
			if (count == 2) {
				driver1.switchTo().window(str);
			}
		}
		buynow.click();
		deliverhere.click();
		driver1.navigate().back();
		Actions action = new Actions(driver1);

		Thread.sleep(1000);

		action.moveToElement(signin).perform();
		logout.click();

	}

}

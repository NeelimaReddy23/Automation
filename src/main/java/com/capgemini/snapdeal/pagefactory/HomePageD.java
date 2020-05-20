package com.capgemini.snapdeal.pagefactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageD {

	// declaration
	@FindBy(linkText = "See All Categories")
	private WebElement categories;

	@FindBy(xpath = "//*[@id=\"SMWrapr\"]/div[2]/ul/li[7]/a/span[2]")
	private WebElement kids;

	@FindBy(xpath = "//a[text()='Stationery']")
	private WebElement stationery;

	@FindBy(xpath = "//img[@title='Success Hero Fountain  Pen Iridium Nib Ink Pen Model 332 Gold Cap (Pack of 3)']")
	private WebElement product;

	@FindBy(xpath = "//span[text()='buy now']")
	private WebElement buy;

	// initialization
	public HomePageD(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// actions
	public void getCategories(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(categories).perform();
		categories.click();
	}

	public void getKids() {
		kids.click();
	}

	public void getStationery() {
		stationery.click();
	}

	public void getProduct() {
		product.click();
	}

	public void getBuy(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String a : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(a);
			}
		}
		buy.click();
	}

}

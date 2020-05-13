package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "See All Categories")
	private WebElement categories;

	@FindBy(xpath = "(//div[@class='SmBox1']/ul/li)[9]")
	private WebElement dailyneeds;

	@FindBy(xpath = "//a[text()='Chocolates, Mints & Candies']")
	private WebElement choco;

	@FindBy(xpath = "//img[@title='BOGATCHI 70% Dark Cocoa Choco Chips Chocolate Dark Chocolate 80 g']")
//	Xplor Combo (6 Packs of 50 gm Each) Dark Chocolate 300 gm']
//	MANTOUSS MANTOUSS Christmas chocolate hamper Dark Chocolate 200 g
//	BOGATCHI 70% Dark Cocoa Choco Chips Chocolate Dark Chocolate 80 g
	private WebElement product;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void getCategories(WebDriver driver) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(categories).perform();
		categories.click();
	}

	public void getDailyNeeds() {
		dailyneeds.click();
	}

	public void getChoco() {
		choco.click();
	}

	public void getProduct() {
		product.click();
	}

}

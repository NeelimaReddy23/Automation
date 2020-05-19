package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// declaration
	@FindBy(linkText = "See All Categories")
	private WebElement categories;

	@FindBy(xpath = "(//div[@class='SmBox1']/ul/li)[9]")
	private WebElement dailyneeds;

	@FindBy(xpath = "//a[text()='Chocolates, Mints & Candies']")
	private WebElement choco;

	@FindBy(xpath = "//img[@title='Lindt Excellence Dark Cocoa 85% Dark Chocolate 0.2 g']")
	private WebElement product;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	// action
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

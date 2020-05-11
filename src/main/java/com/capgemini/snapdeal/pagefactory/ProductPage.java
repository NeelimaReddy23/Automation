package com.capgemini.snapdeal.pagefactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	@FindBy(xpath = "//div[@id='add-cart-button-id']")
	private WebElement addtocart;

	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cart;

	public ProductPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
		driver1.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
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
}
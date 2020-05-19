package com.capgemini.snapdeal.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage {

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/section/div/span[2]/span[2]/a']")
	private WebElement help;

	@FindBy(id = "faq_search_text")
	private WebElement search;

	@FindBy(id = "faq_search_button")
	private WebElement btn;

	public HelpCenterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void getHelp() {
//		PageFactory.initElements((WebDriver) driver, this);
//	wait.until(ExpectedCondition.visibilityOfElement)		
		
		help.click();
	}

	public void getSearch() {
		search.click();
	}

	public WebElement getSearch1() {
		return search;
	}

	public void getSearchButton() {
		btn.click();
	}
}

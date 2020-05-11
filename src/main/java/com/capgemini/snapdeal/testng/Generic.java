package com.capgemini.snapdeal.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Generic {

	WebDriver driver1;

	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.snapdeal.com");

	}

	@Test(priority = 1)
	public void signIn() throws InterruptedException {
		Payment p = new Payment(driver1);
		p.getSignin(driver1);

		p.getPayment(driver1);
	}

	@AfterMethod
	public void close() {
		driver1.quit();
	}

}

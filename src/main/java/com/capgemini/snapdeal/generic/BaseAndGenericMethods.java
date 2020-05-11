package com.capgemini.snapdeal.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseAndGenericMethods {

	public WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	}

	public void openBrowser(String browser) throws IOException {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com");
//		driver.manage().deleteAllCookies();

	}

}

package com.capgemini.snapdeal.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeliverBase {

	public static WebDriver driver;
	public static Properties prop;

	public DeliverBase() {
		try {
			prop = new Properties();
			FileInputStream f = new FileInputStream(
					"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\Properties\\Tc_Deliver.properties");
			prop.load(f);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initial() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}

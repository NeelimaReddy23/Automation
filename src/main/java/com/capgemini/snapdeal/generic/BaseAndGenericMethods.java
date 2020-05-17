package com.capgemini.snapdeal.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class BaseAndGenericMethods {

	public WebDriver driver;
	public String parameters = "/SnapDealAutomation/Excelsheet/excel.xlsx";
	public String appDetails = "URL & Login details";

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	}

//	public void openBrowser(String browser) throws IOException {
//
//		if (browser.equals("chrome")) {
//			driver = new ChromeDriver();
//
//		} else if (browser.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();

//	}

	public String getExcelData(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException, InvalidFormatException {
		FileInputStream f = new FileInputStream(parameters);
		Workbook wb = WorkbookFactory.create(f);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		return url;

	}

}

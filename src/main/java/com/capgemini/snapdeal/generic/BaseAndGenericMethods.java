////package com.capgemini.snapdeal.generic;
////
////import java.io.FileInputStream;
////import java.io.IOException;
////
////import org.apache.poi.EncryptedDocumentException;
////import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
////import org.apache.poi.ss.usermodel.Workbook;
////import org.apache.poi.ss.usermodel.WorkbookFactory;
////import org.openqa.selenium.WebDriver;
////
////public class BaseAndGenericMethods {
////
////	public WebDriver driver;
////	public String parameters = "/SnapDealAutomation/Excelsheet/excel.xlsx";
////	public String appDetails = "URL & Login details";
////
////	static {
////		System.setProperty("webdriver.chrome.driver",
////				"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
//////		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
////	}
////
//////	public void openBrowser(String browser) throws IOException {
//////
//////		if (browser.equals("chrome")) {
//////			driver = new ChromeDriver();
//////
//////		} else if (browser.equals("firefox")) {
//////			driver = new FirefoxDriver();
//////		}
//////		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//////		driver.manage().window().maximize();
//////		driver.manage().deleteAllCookies();
////
//////	}
////
////	public String getExcelData(String path, String sheetname, int row, int cell)
////			throws EncryptedDocumentException, IOException, InvalidFormatException {
////		FileInputStream f = new FileInputStream(parameters);
////		Workbook wb = WorkbookFactory.create(f);
////		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
////		return url;
////
////	}
////
////}
//
//import java.io.FileInputStream;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseAndGenericMethods {
//
//	public static void readData() {
//		String driverPath;
//
//		FileInputStream fis = new FileInputStream(z
//				"C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\Excelsheet\\excel.xlsx");
//
//		XSSFWorkbook wb1 = new XSSFWorkbook(fis);
////		HSSFWorkbook wb1 = new HSSFWorkbook(fis);
//		XSSFSheet sheet1 = wb1.getSheetAt(0);
//
//		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
//
//		System.out.println("Data from Excel is " + data0);
//		String username = sheet1.getRow(0).getCell(0).getStringCellValue();
//		String password = sheet1.getRow(0).getCell(1).getStringCellValue();
//
//		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://flipkart.com");
//		driver.findElement(By.id("un")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
//		driver.findElement(By.id("login")).click();
//		driver.close();
//
//	}
//
//}
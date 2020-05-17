//package com.capgemini.snapdeal.step;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseAndGenericMethods;
//import com.capgemini.snapdeal.page.Tc_LoginExcel_Page;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_LoginExcel_Step extends BaseAndGenericMethods {
//
//	WebDriver driver;
//	Tc_LoginExcel_Page a;
//
//	@Given("^user enters website details$")
//	public void user_enters_website_details() throws Throwable {
//		a = new Tc_LoginExcel_Page(driver);
//		driver = new ChromeDriver();
////		openBrowser("chrome");
//		String url = getExcelData(parameters, appDetails, 0, 0);
//		driver.get(url);
//		driver.manage().window().maximize();
//	}
//
//	@When("^user click on signin$")
//	public void user_click_on_signin() throws Throwable {
//		a.getSignin(driver);
//
//	}
//
//	@Then("^user enter valid credentials$")
//	public void user_enter_valid_credentials() throws Throwable {
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() throws Throwable {
//	}
//
//	@Then("^user clicks on user account$")
//	public void user_clicks_on_user_account() throws Throwable {
//	}
//
//	@Then("^user clicks on logout$")
//	public void user_clicks_on_logout() throws Throwable {
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	}
//
//}

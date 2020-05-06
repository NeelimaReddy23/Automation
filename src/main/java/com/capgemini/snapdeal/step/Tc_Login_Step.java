//package com.capgemini.snapdeal.step;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Tc_Login_Page;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_Login_Step extends BaseClass {
//	WebDriver driver = new ChromeDriver();
//
//	Tc_Login_Page p1 = new Tc_Login_Page(driver);
//
//	@Given("^user enters website details$")
//	public void user_enters_website_details() {
//
//		driver.manage().window().maximize();
//		// manage the time
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		// google URL
//		driver.get("https://www.google.com/");
//		driver.get("https://www.snapdeal.com/");
//	}
//
//	@When("^user click on signin$")
//	public void user_click_on_signin() {
//		p1.signinbutton();
//		p1.loginbutton();
//		driver.switchTo().frame(0);
//	}
//
//	@Then("^user enter username$")
//	public void user_enter_username() {
//		p1.usernametextbox("neelimareddyece@gmail.com");
//		p1.continuebutton();
//	}
//
//	@Then("^user enter password$")
//	public void user_enter_password() {
//		p1.passwordtextbox("neelima2301@");
//		p1.submitbutton();
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//
//	}
//
//	@Then("^user clicks on user account$")
//	public void user_clicks_on_user_account() {
//		driver.switchTo().parentFrame();
//		p1.textcontains();
//	}
//
//	@Then("^user clicks on logout$")
//	public void user_clicks_on_logout() {
//		p1.logoutbutton();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//
//	}
//
//}

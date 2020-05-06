//package com.capgemini.snapdeal.step;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Login_Page;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Login_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	Login_Page p = new Login_Page(driver);
//
//	@Given("^User enters web site link$")
//	public void user_enters_web_site_link() {
//
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//
//	}
//
//	@When("^user clicks on sign in$")
//	public void user_clicks_on_sign_in() throws InterruptedException {
//		p.getSignin(driver);
//		p.getLogin();
//	}
//
//	@Then("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_valid_and(String un, String pwd) {
//
//		p.getUser(driver);
//		p.getUserName().sendKeys(un);
//		p.clickContinue();
//		p.getPassword();
//		p.getPass().sendKeys(pwd);
//		p.getSubmit();
//	}
//
//	@Then("^get the title of home page$")
//	public void get_the_title_of_home_page() {
//		String actual = driver.getTitle();
//		System.out.println(actual);
////		String expected = "Online shopping site";
////		Assert.assertEquals(actual, expected);
//	}
//
//	@Then("^user clicks on user account$")
//	public void user_clicks_on_user_account() throws InterruptedException {
//
//		p.getusername(driver);
//		
//	}
//
//	@Then("^user clicks on logout$")
//	public void user_clicks_on_logout() {
//
//		p.getLogout();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//
//		driver.quit();
//
//	}
//
//}

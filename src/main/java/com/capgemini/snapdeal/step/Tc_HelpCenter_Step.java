//package com.capgemini.snapdeal.step;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.pagefactory.HelpCenterPage;
//import com.capgemini.snapdeal.pagefactory.LoginPage;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_HelpCenter_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	LoginPage l = new LoginPage(driver);
//	HelpCenterPage h=new HelpCenterPage(driver);
//
//	@Given("^user enters the web site link$")
//	public void user_enters_the_web_site_link() {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		l.getSignin();
//		l.getLogin();
//	}
//
//	@When("^user enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_valid_credentials_and(String un, String pwd) {
//		l.getUser(driver);
//		l.getUserName().sendKeys(un);
//		l.clickContinue();
//		l.getPass();
//		l.getPwd().sendKeys(pwd);
//		l.getSubmit();
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		l.getWindow(driver);
//	}
//
//	@Then("^user clicks on help center$")
//	public void user_clicks_on_help_center() {
//		h.getHelp();
//	}
//	
//
//	@Then("^user searches for \"([^\"]*)\"$")
//	public void user_searches_for(String arg1) {
//		h.getSearch();
//		h.getSearch1().sendKeys(arg1);
//		h.getSearchButton();
//	}
//
//	@Then("^get the title$")
//	public void get_the_title() {
//		String title=driver.getTitle();
//		System.out.println(title);
//	}
//
//}

//package com.capgemini.snapdeal.step;
//
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Tc_Tags_Page;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_Tags_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	Tc_Tags_Page tp = new Tc_Tags_Page(driver);
//
//	@Given("^user enters the web site link$")
//	public void user_enters_the_web_site_link() {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		tp.getSignin();
//		tp.getLogin();
//	}
//
//	@When("^user enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_valid_credentials_and(String username, String password) {
//		tp.getUser(driver);
//		tp.getUserName().sendKeys(username);
//		tp.clickContinue();
//		tp.getPass();
//		tp.getPwd().sendKeys(password);
//		tp.getSubmit();
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		tp.getWindow(driver);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		String title = driver.getTitle();
//		System.out.println(title);	
////		driver.close();
////		try {
////			Thread.sleep(3000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
//
//	@Given("^user entered website link$")
//	public void user_entered_website_link() {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		tp.getSignin();
//		tp.getLogin();
//	}
//
//	@When("^user enters username as \"([^\"]*)\"$")
//	public void user_enters_username_as(String un) {
//		tp.getUser(driver);
//		tp.getUserName().sendKeys(un);
//		tp.clickContinue();
//	}
//
//	@And("^password as \"([^\"]*)\"$")
//	public void password_as(String pwd) {
//		tp.getPass();
//		tp.getPwd().sendKeys(pwd);
//		tp.getSubmit();
//	}
//
//	@Then("^user searches for \"([^\"]*)\"$")
//	public void user_searches_for(String search) {
//		tp.getWindow(driver);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		tp.getsearch();
//		tp.getSearch().sendKeys(search);
//	}
//
//	@When("^user selects hand sanitizer$")
//	public void user_selects_hand_sanitizer() {
//		tp.onClick();
//	}
//
//	@Then("^user clicks on product$")
//	public void user_clicks_on_product() {
//		tp.getSanitizer();
//	}
//
//	@And("^user adds that product to cart$")
//	public void user_adds_that_product_to_cart() {
//		tp.getAddToCart(driver);
//	}
//
//	@Given("^user gives website link$")
//	public void user_gives_website_link() {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		tp.getSignin();
//		tp.getLogin();
//	}
//
//	@When("^user log into application$")
//	public void user_log_into_application(DataTable credentials) {
//		List<List<String>> ele = credentials.raw();
//		tp.getUser(driver);
//		tp.getUserName().sendKeys(ele.get(0).get(0));
//		tp.clickContinue();
//		tp.getPass();
//		tp.getPwd().sendKeys(ele.get(0).get(1));
//		tp.getSubmit();
//		tp.getWindow(driver);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Then("^clicks on cart$")
//	public void clicks_on_cart() {
//		tp.getCart();
//	}
//
//	@When("^user clicks on remove product$")
//	public void user_clicks_on_remove_product() {
//		tp.getRemove(driver);
//	}
//
//	@And("^close the browser$")
//	public void close_the_browser() {
////		driver.quit();
//	}
//
//}

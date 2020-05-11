//package com.capgemini.snapdeal.step;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Tc_RemoveProduct_Page;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_RemoveProduct_Step extends BaseClass {
//	WebDriver driver = new ChromeDriver();
//	Tc_RemoveProduct_Page a = new Tc_RemoveProduct_Page(driver);
//
//	@Given("^User enters web site link$")
//	public void user_enters_web_site_link() {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		a.getSignin();
//		a.getLogin();
//	}
//
//	@When("^user enters valid credentials$")
//	public void user_enters_valid_credentials(DataTable credentials) throws Throwable {
//		List<List<String>> ele = credentials.raw();
//		a.getUser(driver);
//		a.getUserName().sendKeys(ele.get(0).get(0));
//		a.clickContinue();
//		a.getPass();
//		a.getPwd().sendKeys(ele.get(0).get(1));
//		a.getSubmit();
//
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		a.getWindow(driver);
//	}
//
//	@Then("^user searches for \"([^\"]*)\"$")
//	public void user_searches_for(String search) throws InterruptedException {
//		Thread.sleep(3000);
//		a.getsearch();
//		a.getSearch().sendKeys(search);
//	}
//
//	@Then("^user selects a mask$")
//	public void user_selects_a_mask() {
//		a.onClick();
//	}
//
//	@Then("^user clicks on product$")
//	public void user_clicks_on_product() {
//		a.getFacemask();
//	}
//
//	@Then("^user adds that product to cart$")
//	public void user_adds_that_product_to_cart() {
//		a.getAddToCart(driver);
//	}
//
//	@Then("^user clicks on cart$")
//	public void user_clicks_on_cart() {
//		a.getCart();
//	}
//
//	@Then("^user clicks on remove product$")
//	public void user_clicks_on_remove_product() throws InterruptedException {
//		Thread.sleep(3000);
//		a.getRemove(driver);
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
////		driver.quit();
//	}
//}

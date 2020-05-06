//package com.capgemini.snapdeal.step;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Tc_AddProduct_Page;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_AddProduct_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	Tc_AddProduct_Page a = new Tc_AddProduct_Page(driver);
//
//	@Given("^User enters web site link$")
//	public void user_enters_web_site_link() throws InterruptedException {
//		driver.manage().window().maximize();
//		driver.get("http://www.snapdeal.com");
//		a.getSignin(driver);
//		a.getLogin();
//	}
//
//	@When("^user enters credentials$")
//	public void user_enters_credentials(DataTable credentials) {
//		List<List<String>> ele = credentials.raw();
//		a.getUser(driver);
//		a.getUserName().sendKeys(ele.get(0).get(0));
//		a.clickContinue();
//		a.getPass();
//		a.getPwd().sendKeys(ele.get(0).get(1));
//		a.getSubmit();
//	}
//
//	@Then("^user name can be seen on the page$")
//	public void user_name_can_be_seen_on_the_page() throws InterruptedException {
//		a.getWindow(driver);
//		a.getName1();
//		String a1 = a.getName().getText();
//		System.out.println(a1);
//		String expected="Neelima Reddy";
//		Assert.assertEquals(expected, a1);
//	}
//
//	@Then("^user searches for \"([^\"]*)\"$")
//	public void user_searches_for(String search) {
//		a.getsearch();
//		a.getSearch().sendKeys(search);
//
//	}
//
//	@Then("^user selects hand sanitizer$")
//	public void user_selects_hand_sanitizer() {
//		a.onClick();
//	}
//
//	@Then("^user clicks on product$")
//	public void user_clicks_on_product() {
//		a.getRyaal();
//
//	}
//
//	@Then("^user adds that product to cart$")
//	public void user_adds_that_product_to_cart() {
//		a.getAddToCart(driver);
//
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit();
//	}
//
//}

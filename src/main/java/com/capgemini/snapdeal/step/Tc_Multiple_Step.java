//package com.capgemini.snapdeal.step;
//
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.page.Tc_Multiple_Page;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_Multiple_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	Tc_Multiple_Page mp = new Tc_Multiple_Page(driver);
//
//	@Given("^user enters the web site link$")
//	public void user_enters_the_web_site_link() throws InterruptedException {
//		driver.manage().window().maximize();
//		driver.get("https://www.snapdeal.com");
//		mp.getSignin(driver);
//		mp.getLogin();
//	}
//
//	@When("^user enters valid credentials$")
//	public void user_enters_valid_credentials(DataTable credentials) {
//		List<List<String>> ele = credentials.raw();
//		mp.getUser(driver);
//		mp.getUserName().sendKeys(ele.get(0).get(0));
//		mp.clickContinue();
//		mp.getPassword();
//		mp.getPass().sendKeys(ele.get(0).get(1));
//		mp.getSubmit();
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		mp.getWindow(driver);
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//
//	@Given("^user searches for \"([^\"]*)\"$")
//	public void user_searches_for(String search) {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mp.getsearch();
//		mp.getSearch().sendKeys(search);
//	}
//
//	@Then("^user selects hand glove$")
//	public void user_selects_hand_glove() {
//		mp.onClick();
//	}
//
//	@Then("^user clicks on product$")
//	public void user_clicks_on_product() {
//		mp.getGloves();
//	}
//
//	@Then("^user adds that product to cart$")
//	public void user_adds_that_product_to_cart() {
//		mp.getAddToCart(driver);
//	}
//
//	@Given("^user clicks on cart$")
//	public void user_clicks_on_cart() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		mp.getCart();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@When("^user clicks on remove product$")
//	public void user_clicks_on_remove_product() {
//		mp.getRemove(driver);
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
////		driver.quit();
//	}
//
//}

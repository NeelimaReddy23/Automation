//package com.capgemini.snapdeal.step;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import com.capgemini.snapdeal.generic.BaseClass;
//import com.capgemini.snapdeal.pagefactory.CartPage;
//import com.capgemini.snapdeal.pagefactory.HomePage;
//import com.capgemini.snapdeal.pagefactory.LoginPage;
//import com.capgemini.snapdeal.pagefactory.ProductPage;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_Payment_Step extends BaseClass {
//
//	WebDriver driver = new ChromeDriver();
//	LoginPage l = new LoginPage(driver);
//	HomePage h = new HomePage(driver);
//	ProductPage p = new ProductPage(driver);
//	CartPage c = new CartPage(driver);
//
//	@Given("^user enters the web site link$")
//	public void user_enters_the_web_site_link() {
//		driver.manage().window().maximize();
//		driver.get("https://www.snapdeal.com/");
//		l.getSignin();
//		l.getLogin();
//	}
//
//	@When("^user enters valid credentials$")
//	public void user_enters_valid_credentials(DataTable credentials) {
//		List<List<String>> ele = credentials.raw();
//		l.getUser(driver);
//		l.getUserName().sendKeys(ele.get(0).get(0));
//		l.clickContinue();
//		l.getPass();
//		l.getPwd().sendKeys(ele.get(0).get(1));
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
//	@Then("^user clicks on see all categories$")
//	public void user_clicks_on_see_all_categories() throws InterruptedException {
//		h.getCategories(driver);
//	}
//
//	@And("^user clicks on daily needs$")
//	public void user_clicks_on_daily_needs() {
//		h.getDailyNeeds();
//	}
//
//	@Then("^selects chocolates, mints & candies$")
//	public void selects_chocolates_mints_candies() {
//		h.getChoco();
//	}
//
//	@And("^clicks on an item$")
//	public void clicks_on_an_item() {
//		h.getProduct();
//	}
//
//	@Then("^user clicks on add to cart$")
//	public void user_clicks_on_add_to_cart() {
//		p.getAddToCart(driver);
//	}
//
//	@Then("^user clicks on cart$")
//	public void user_clicks_on_cart() {
//		p.getCart();
//	}
//
//	@And("^user clicks on proceed to pay$")
//	public void user_clicks_on_proceed_to_pay() {
//		c.getProceedToPay();
//	}
//
//	@Then("^user enters delivery address \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_delivery_address_and(String arg1, String arg2, String arg3) {
////		c.getPin();
//		c.getPinCode().sendKeys(arg1);
//		c.getName();
//		c.getFullName().sendKeys(arg2);
//		c.getAddress();
//		c.getAddress1().sendKeys(arg3);
//		c.getMobile();
//	}
//
//	@Then("^user clicks on save and continue$")
//	public void user_clicks_on_save_and_continue() throws InterruptedException {
//		Thread.sleep(1000);
//		c.getSaveAndContinue();
//	}
//
//	@And("^user clicks on proceed to payment$")
//	public void user_clicks_on_proceed_to_payment() throws InterruptedException {
//		Thread.sleep(1000);
//		c.getProceedToPayment();
//	}
//
//	@Then("^checkout page should be open$")
//	public void checkout_page_should_be_open() {
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
////		driver.quit();
//	}
//
//}

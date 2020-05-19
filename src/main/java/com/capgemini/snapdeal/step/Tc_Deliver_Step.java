//package com.capgemini.snapdeal.step;
//
//import org.testng.Assert;
//import com.capgemini.snapdeal.generic.DeliverBase;
//import com.capgemini.snapdeal.page.Tc_Deliver_Page;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Tc_Deliver_Step extends DeliverBase {
//
//	Tc_Deliver_Page dp;
//
//	@Given("^user enters website details$")
//	public void user_enters_website_details() {
//		DeliverBase.initial();
//	}
//
//	@When("^user click on signin$")
//	public void user_click_on_signin() {
//		dp = new Tc_Deliver_Page(driver);
//		dp.getSignin();
//		dp.getLogin();
//	}
//
//	@Then("^user enters valid credentials$")
//	public void user_enters_valid_credentials() {
//		dp.getUser(driver);
//		dp.getUserName().sendKeys(prop.getProperty("username"));
//		dp.clickContinue();
//		dp.getPass();
//		dp.getPwd().sendKeys(prop.getProperty("password"));
//		dp.getSubmit();
//	}
//
//	@Then("^get the title of the page$")
//	public void get_the_title_of_the_page() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		dp.getWindow(driver);
//	}
//
//	@Then("^user clicks on see all categories$")
//	public void user_clicks_on_see_all_categories() throws Throwable {
//		dp.getCategories(driver);
//	}
//
//	@Then("^user clicks on KID'S TOYS & FASHION$")
//	public void user_clicks_on_KID_S_TOYS_FASHION() {
//		dp.getKids();
//	}
//
//	@And("^selects Stationery$")
//	public void selects_Stationery() {
//		dp.getStationery();
//	}
//
//	@Then("^clicks on an item$")
//	public void clicks_on_an_item() {
//		dp.getProduct();
//	}
//
//	@Then("^user clicks on buy now$")
//	public void user_clicks_on_buy_now() {
//		dp.getBuy(driver);
//	}
//
//	@Then("^user enters delivery address$")
//	public void user_enters_delivery_address() {
//		dp.getPinCode().sendKeys(prop.getProperty("Pincode"));
//		dp.getName();
//		dp.getFullName().sendKeys(prop.getProperty("Name"));
//		dp.getAddress();
//		dp.getAddress1().sendKeys(prop.getProperty("Address"));
//		dp.getMobile();
//	}
//
//	@And("^user clicks on save and continue$")
//	public void user_clicks_on_save_and_continue() {
//		dp.getSaveAndContinue();
//	}
//
//	@And("^user clicks on proceed to payment$")
//	public void user_clicks_on_proceed_to_payment() {
//		dp.getProceedToPayment();
//	}
//
//	@Then("^checkout page should be open$")
//	public void checkout_page_should_be_open() {
//		String actual = driver.getTitle();
//		System.out.println(actual);
//		String expected = "Snapdeal Cart Checkout";
//		Assert.assertEquals(actual, expected);
//		System.out.println("Assert passed");
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
////		driver.quit();
//	}
//
//}

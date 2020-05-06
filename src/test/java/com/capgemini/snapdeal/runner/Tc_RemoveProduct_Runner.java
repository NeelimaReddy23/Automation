package com.capgemini.snapdeal.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\java\\com\\capgemini\\snapdeal\\feature\\Tc_RemoveProduct.feature", glue = {
		"com/capgemini/snapdeal/step" }, plugin = { "pretty",
				"html:target/cucumber" }, monochrome = true, dryRun = false)

public class Tc_RemoveProduct_Runner extends AbstractTestNGCucumberTests {

}

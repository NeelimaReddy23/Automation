package com.capgemini.snapdeal.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "C:\\Users\\system1\\Desktop\\ParallelAutomation\\SnapDealAutomation\\src\\main\\java\\com\\capgemini\\snapdeal\\feature\\Tc_Payment.feature", 
glue = {"com/capgemini/snapdeal/step" }, 
format = { "pretty","html:target/cucumber", "json:target/json_output/cucumber.json", "junit:target/junit_xml/cucumber.xml" }, 
monochrome = true, 
dryRun = false, 
strict = false,
tags= {"~@Ignore"})

public class Tc_Payment_Runner extends AbstractTestNGCucumberTests {

}

#Data Tables in Cucumber
Feature: Checking for adding an item to cart 

Scenario: Checking for adding a product to cart 
	Given User enters web site link 
	When user enters credentials 
		| neelimareddyece@gmail.com | neelima2301@ |
	Then user name can be seen on the page 
	Then user searches for "hand sanitizer" 
	Then user selects hand sanitizer 
	Then user clicks on product 
	Then user adds that product to cart 
	Then close the browser 
Feature: Checking for adding an item to cart 

Scenario: Checking for adding a product to cart 
	Given User enters web site link 
	When user enters valid credentials 
		| neelimareddyece@gmail.com | neelima2301@ |
	Then get the title of the page 
	Then user searches for "mask" 
	Then user selects a mask 
	Then user clicks on product 
	Then user adds that product to cart 
	Then user clicks on cart
	Then user clicks on remove product
	Then close the browser 
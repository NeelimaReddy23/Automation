Feature: Snapdeal Background key 

Background: 
	Given user enters the web site link 
	When user enters valid credentials 
		| neelimareddyece@gmail.com | neelima2301@ |
	Then get the title of the page 
	
Scenario: 
	Given user searches for "hand gloves" 
	Then user selects hand glove 
	Then user clicks on product 
	Then user adds that product to cart 
	
Scenario: 
	Given user clicks on cart 
	When user clicks on remove product 
	Then close the browser 
	

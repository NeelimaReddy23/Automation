Feature: Snapdeal Payment Feature 

Scenario: Checking for payment feature in snapdeal 
	Given user enters the web site link 
	When user enters valid credentials 
		| neelimareddyece@gmail.com | neelima2301@ |
	Then get the title of the page 
	Then user clicks on see all categories 
	Then user clicks on daily needs 
	And selects chocolates, mints & candies 
	Then clicks on an item 
	Then user clicks on add to cart 
	Then user clicks on cart 
	Then user clicks on proceed to pay 
	Then user enters delivery address "500041" , "Neelima" and "2-4-123/J, Uppal" 
	Then user clicks on save and continue 
	Then user cliks on proceed to payment 
	Then checkout page should be open 
	Then close the browser
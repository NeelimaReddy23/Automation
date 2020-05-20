Feature: Snapdeal Payment Feature 

Scenario: Checking for payment feature in snapdeal 
	Given user enters the web site link 
	When user enters valid credentials 
		| neelimareddyece@gmail.com | neelima2301@ |
	Then get the title of the page 
	Then user clicks on see all categories 
	And user clicks on daily needs 
	Then selects chocolates, mints & candies 
	And clicks on an item 
	Then user clicks on add to cart 
	Then user clicks on cart 
	And user clicks on proceed to pay 
	Then user enters delivery address "500041" , "Neelima" and "2-4-123/J, Uppal" 
	Then user clicks on save and continue 
	And user clicks on proceed to payment 
	Then checkout page should be open 
	Then user clicks on cash on delivery
	And clicks on place cod order
	Then close the browser
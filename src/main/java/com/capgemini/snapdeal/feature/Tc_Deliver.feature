Feature: Payment Feature Of Snapdeal 

Scenario: To Validate For Payment In Snapdeal Application 

	Given user enters website details 
	When user click on signin 
	Then user enters valid credentials 
	Then get the title of the page 
	Then user clicks on see all categories 
	Then user clicks on KID'S TOYS & FASHION 
	And selects Stationery 
	Then clicks on an item 
	Then user clicks on buy now 
	Then user enters delivery address 
	And user clicks on save and continue 
	And user clicks on proceed to payment 
	Then checkout page should be open 
	Then close the browser 
	
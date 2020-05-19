@FunctionalTest 
Feature: Snapdeal Application Testing 

#Parameterizing with Examples Keyword
@First 
Scenario Outline: Login Action Of Snapdeal Using Examples 
	Given user enters the web site link 
	When user enters valid credentials "<username>" and "<password>" 
	Then get the title of the page 
	
	Examples: 
		|         username          |    password  |
		| neelimareddyece@gmail.com | neelima2301@ |
		| neelimareddyece@gmail.com |	12345678   |
		
		@Second 
		Scenario: Add To Cart 
			Given user entered website link 
			When user enters username as "neelimareddyece@gmail.com" 
			And password as "neelima2301@" 
			Then user searches for "hand sanitizer" 
			When user selects hand sanitizer 
			Then user clicks on product 
			And user adds that product to cart 
			
		@Third 
		Scenario: Remove From Cart 
		
			Given user gives website link 
			When user log into application 
				| neelimareddyece@gmail.com | neelima2301@ |
			Then clicks on cart 
			When user clicks on remove product 
			And close the browser 
			

Feature: Snapdeal Login feature 

Scenario: Checking login to snapdeal website 
	Given User enters web site link
	When user clicks on sign in 
	Then user enters valid "neelimareddyece@gmail.com" and "neelima2301@" 
	Then get the title of home page 
	Then user clicks on user account
	Then user clicks on logout
	Then close the browser
	
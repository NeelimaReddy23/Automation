Feature: Snapdeal Help Center Feature

Scenario: Checking for the help in Help Center
    Given user enters the web site link 
	When user enters valid credentials "neelimareddyece@gmail.com" and "neelima2301@"
	Then get the title of the page
	Then user clicks on help center
	Then user searches for "What are digital products?"
	Then get the title
  
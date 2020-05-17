Feature: Login into snapdeal website 

Scenario: Login into snapdeal website 

	Given user enters website details 
	When user click on signin 
	Then user enter valid credentials
	Then get the title of the page 
	Then user clicks on user account 
	Then user clicks on logout 
	Then close the browser 

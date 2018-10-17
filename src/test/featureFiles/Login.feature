Feature: Log into account
	Existing user should be able to log into account using correct credentials
	
Scenario: Log into account with correct credentials
Given user navigates to stackoverflow website
And user clicks on the login button 
And user enters a valid username
And user enters a valid password
When the user clicks on the login button on the homepage
Then user should be taken to the successful login page


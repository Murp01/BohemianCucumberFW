Feature: Log into account
	Existing user should be able to log into account using correct credentials
	
Scenario: Log into account with correct credentials2
Given user navigates to stackoverflow website2
And user clicks on the login button2
And user enters a valid username2
And user enters a valid password2
When the user clicks on the login button on the homepage2
Then user should be taken to the successful login page2


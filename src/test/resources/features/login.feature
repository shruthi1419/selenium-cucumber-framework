Feature:login page automation of saucedemo App
Scenario:check login is successful with valid data
Given user is on login page
When user enters valid username and password 
And clicks on login button
Then user is navigated to home page 
And close the broswer 
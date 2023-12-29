Feature: Login Functionality in Leaftaps application

#Background:
#Given Launch the browser
#Given Load the url


Scenario: Login with Positive Credential


#deifne the steps
#Given Launch the browser
#Given Load the url
Given Enter the username as 'demoSalesManager'
Given Enter the password as 'crmsfa'
When Click on login button
Then WelcomePage is displayed


Scenario: Login with invalid Credential
#deifne the steps

#Given Launch the browser
#Given Load the url
Given Enter the username as 'demo'
Given Enter the password as 'crmsfa'
When  Click on login button
But   Error message is displayed


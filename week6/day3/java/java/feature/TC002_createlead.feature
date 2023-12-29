Feature: CreateLead Functionality in Leaftaps application

Scenario Outline: Create lead with Mantadory fields
#
#Given Launch the browser
#Given Load the url
Given Enter the username as 'demoSalesManager'
Given Enter the password as 'crmsfa'
When Click on login button
Then WelcomePage is displayed
When Click on 'CRM/SFA' link
When Click on 'Leads' link
When Click on 'Create Lead' link
When Enter the company name as <companyname>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
When Click on the create button
Then ViewLeadPage is displayed


Examples:
|companyname|firstname|lastname|
|'Testleaf'|'Vidya'|'R'|
|'Testleaf'|'Princilla'|'R'|

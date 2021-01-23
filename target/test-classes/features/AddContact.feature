@End2End
Feature: Validate Addcontact functionality

Background:
Given User is on Techfios Login Page

@Scenario1 
Scenario Outline: User should be able to login with valid credentials and Add A new Contact
When User enters username as "<userName>"
When User enters password as "<password>"
And User clicks on the log in Button
Then User will be able to see DashBoard page
When User should be able to click on Customers 
When User should be able to click on Add Customer 
When User enters fullname as "<fullname>"
#When User enters company as
When User enters company as "<company>"
When User enters email as "<email>"
When User enters phone as "<phone>"
When User enters address as "<address>"
When User enters city as "<city>"
When User enters state as "<state>"
When User enters zip as "<zip>"
#When User enters country as 
When User enters country as "<country>"
#When User enters tag as "<tag>"
Then User clicks on the Save Button



Examples:

#|userName|password|fullname|company|email|phone|address|city|state|zip|country|tag|
#|demo@techfios.com|abc123|Sudip|Techfios|sudip123@techfios.com|123456889|abc|Irving|TX|75063|United States|Sudip|
|userName|password|fullname|company|email|phone|address|city|state|zip|country|
|demo@techfios.com|abc123|Sudip|Techfios|sudip123@techfios.com|123456889|abc|Irving|TX|75063|United States|
@End2End
Feature: Validate login functionality

Background:
Given User is on Techfios Login Page

@Scenario1 
Scenario Outline: User should be able to login with valid credentials
When User enters username as "<userName>"
When User enters password as "<password>"
And User clicks on the log in Button
Then User will be able to see DashBoard page


Examples:
|userName|password| 
|demo@techfios.com|abc123|

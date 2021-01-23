$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sudip/eclipse-workspace/zzz/src/test/java/features/AddContact.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Addcontact functionality",
  "description": "",
  "id": "validate-addcontact-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials and Add A new Contact",
  "description": "",
  "id": "validate-addcontact-functionality;user-should-be-able-to-login-with-valid-credentials-and-add-a-new-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the log in Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User will be able to see DashBoard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should be able to click on Customers",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to click on Add Customer",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters fullname as \"\u003cfullname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#When User enters company as"
    }
  ],
  "line": 17,
  "name": "User enters company as \"\u003ccompany\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters email as \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters phone as \"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters address as \"\u003caddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters city as \"\u003ccity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters state as \"\u003cstate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters zip as \"\u003czip\u003e\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#When User enters country as"
    }
  ],
  "line": 25,
  "name": "User enters country as \"\u003ccountry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#When User enters tag as \"\u003ctag\u003e\""
    }
  ],
  "line": 27,
  "name": "User clicks on the Save Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "validate-addcontact-functionality;user-should-be-able-to-login-with-valid-credentials-and-add-a-new-contact;",
  "rows": [
    {
      "comments": [
        {
          "line": 33,
          "value": "#|userName|password|fullname|company|email|phone|address|city|state|zip|country|tag|"
        },
        {
          "line": 34,
          "value": "#|demo@techfios.com|abc123|Sudip|Techfios|sudip123@techfios.com|123456889|abc|Irving|TX|75063|United States|Sudip|"
        }
      ],
      "cells": [
        "userName",
        "password",
        "fullname",
        "company",
        "email",
        "phone",
        "address",
        "city",
        "state",
        "zip",
        "country"
      ],
      "line": 35,
      "id": "validate-addcontact-functionality;user-should-be-able-to-login-with-valid-credentials-and-add-a-new-contact;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Sudip",
        "Techfios",
        "sudip123@techfios.com",
        "123456889",
        "abc",
        "Irving",
        "TX",
        "75063",
        "United States"
      ],
      "line": 36,
      "id": "validate-addcontact-functionality;user-should-be-able-to-login-with-valid-credentials-and-add-a-new-contact;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5974137000,
  "status": "passed"
});
formatter.before({
  "duration": 23070500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_is_on_Techfios_Login_Page()"
});
formatter.result({
  "duration": 782514300,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User should be able to login with valid credentials and Add A new Contact",
  "description": "",
  "id": "validate-addcontact-functionality;user-should-be-able-to-login-with-valid-credentials-and-add-a-new-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@End2End"
    },
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the log in Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User will be able to see DashBoard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should be able to click on Customers",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to click on Add Customer",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters fullname as \"Sudip\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#When User enters company as"
    }
  ],
  "line": 17,
  "name": "User enters company as \"Techfios\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters email as \"sudip123@techfios.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters phone as \"123456889\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters address as \"abc\"",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters city as \"Irving\"",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters state as \"TX\"",
  "matchedColumns": [
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters zip as \"75063\"",
  "matchedColumns": [
    9
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#When User enters country as"
    }
  ],
  "line": 25,
  "name": "User enters country as \"United States\"",
  "matchedColumns": [
    10
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#When User enters tag as \"\u003ctag\u003e\""
    }
  ],
  "line": 27,
  "name": "User clicks on the Save Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStep.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3084442700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStep.user_enters_password_as(String)"
});
formatter.result({
  "duration": 65002900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_the_log_in_Button()"
});
formatter.result({
  "duration": 1286677400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_will_be_able_to_see_DashBoard_page()"
});
formatter.result({
  "duration": 10832100,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStep.user_should_be_able_to_click_on_Customers()"
});
formatter.result({
  "duration": 5054143300,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStep.user_should_be_able_to_click_on_Add_Customer()"
});
formatter.result({
  "duration": 5609066900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sudip",
      "offset": 25
    }
  ],
  "location": "AddContactStep.user_enters_fullname_as(String)"
});
formatter.result({
  "duration": 5069764700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Techfios",
      "offset": 24
    }
  ],
  "location": "AddContactStep.user_enters_company_as(String)"
});
formatter.result({
  "duration": 114272400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sudip123@techfios.com",
      "offset": 22
    }
  ],
  "location": "AddContactStep.user_enters_email_as(String)"
});
formatter.result({
  "duration": 80194000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456889",
      "offset": 22
    }
  ],
  "location": "AddContactStep.user_enters_phone_as(String)"
});
formatter.result({
  "duration": 69989700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 24
    }
  ],
  "location": "AddContactStep.user_enters_address_as(String)"
});
formatter.result({
  "duration": 66157500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Irving",
      "offset": 21
    }
  ],
  "location": "AddContactStep.user_enters_city_as(String)"
});
formatter.result({
  "duration": 70303300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TX",
      "offset": 22
    }
  ],
  "location": "AddContactStep.user_enters_state_as(String)"
});
formatter.result({
  "duration": 75636600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "75063",
      "offset": 20
    }
  ],
  "location": "AddContactStep.user_enters_zip_as(String)"
});
formatter.result({
  "duration": 72583300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 24
    }
  ],
  "location": "AddContactStep.user_enters_country_as(String)"
});
formatter.result({
  "duration": 59997900,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStep.user_clicks_on_the_Save_Button()"
});
formatter.result({
  "duration": 5081093700,
  "status": "passed"
});
});
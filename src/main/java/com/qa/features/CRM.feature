Feature: free crm application test

Scenario: validate home page

Given user opens browser
Then user is on login page
Then user enters username and password

Then validate home page title
Then validate logged in user name

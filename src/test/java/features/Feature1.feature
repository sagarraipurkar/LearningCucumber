@Smoke
Feature: Verify the login Functionality

Background: 
Given Lauch the browser in chrome application

@Sanity
Scenario: Verify the user able to login with valid credentials
Given Enter the username and password
And Click on submit button
Then User should be navigate to dashboard

Scenario: Verify the user able to login with wrong password
Given Enter the username and password
And Click on submit button
Then Error message should be displayed
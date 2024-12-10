#Author: your.email@your.domain.com
#Keywords Summary :

@Smoke
Feature: Verify User have permission to access the dashboard

Scenario Outline: Verify user logged in as student
Given Enter the "<username>" and "<password>"
And Click on submit button
Then Student do not have access of dashboard

@Sanity
Scenario: Verify user logged in as Admin
Given Enter the "<username>" and "<password>"
And Click on submit button
Then Admin have access of dashboard

Example:

	|username				| password |
	|test@test.com 	| Test123 | 
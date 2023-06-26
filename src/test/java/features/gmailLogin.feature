
Feature: Gmail Login Process

Scenario: Gmail Login process using Username and Password

      Given I am on Gmail login page
  	 When I enter the username click on next
    And I enter the password click on next
   Then I should see my gmail inbox page
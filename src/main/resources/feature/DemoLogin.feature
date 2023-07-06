Feature: Login Page
  As a user 
  I am able to login into my account 
  and find books API

  Scenario: verify the login page
    Given User is on Login page
    When User enters UserName as "Akshat12"
    And enters password as "Akshat@123"
    And Click on login button
    Then User should navigate to the home page

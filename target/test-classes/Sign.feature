Feature: Feature to test Login Functionality

  Scenario: Checks Login to valid functionality
    Given browser is open
    And user is on login page
    When user enters the username and password
    And user click on login page
    Then user is navigate to home page

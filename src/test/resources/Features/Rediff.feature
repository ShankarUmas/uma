
@Rediff
Feature: Validating RedifflogingLogout
  I want to validate teh login and logout of RediffMail

  @Login
  Scenario: This is Login scenario of Rediff
    Given I open a chrome Browser
    And I enter the url http://rediff.com in the address bar
    Then I click on the signin link 
    And I enter the RediffMail page
    And I enter correct username and password
    Then I click on the SignIn button 
    And Icheck if I am in the Inbox page of RediffMail
    
  @Logout
  Scenario: This is Logout scenario of Rediff
  Given I am Inside the Inbox Page
  And I validate the presence of the Logout link
  When I click on the Logout link
  Then I am logged out of RediffMail
  And I can validate the presence of RediffHome link
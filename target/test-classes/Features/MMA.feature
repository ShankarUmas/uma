#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@BookingMMAGym
Feature: I want to learn MMA with a good trainer
@LookingForMMAGym

  Scenario:Looking for an MMA Gym near my place
    Given I am interested in learning MMA
    And I went online to find different MMA Gyms
    And I shortlisted 4 MMA Gyms near my place
    When I enquired about one gym closest to my place they asked me to come and have a look
    And I decided to visit them 
    When I wentto visit the Gym on 20 Aug 2020
    And I decided to book membership for 3 months
    But I decided to keep a trainer
    Then I bargained and received a discount of 20%
    
     
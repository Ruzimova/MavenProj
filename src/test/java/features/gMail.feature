
Feature: Gmail loggin
  
  Background: setups
    Given Initilize and setups

  
  

  
  Scenario Outline: login with valid credentials
    Given Gmail page is open
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

Feature: Open app myNoise

  Background: setups
    Given Initilize and setups

  Scenario: Open app
    Given Open the app
    When open the current section
    Then Choose one section
    And click slider speed
    Then click slider mode
   #  Examples: 
   #   | user  | password |
   #   | shahnaza.ruzimova@ | Yan.naz.95 |
   #   | naza.ruzimova@gmail.com |     Yannaz95 |

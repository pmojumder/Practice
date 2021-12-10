
Feature: Amazon Login
  Author: Plabani

  Scenario: verify Login
    Given Open Browser
    And  verify enter below emailId 
    |plabani52@gmail.com|
    And Click on Continue
    And Enter below Password 
    |Plabani1234!|
    When Click on Sign
    Then Login Successful

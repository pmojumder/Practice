Feature: Amazon Login
  Author: Plabani

  Scenario Outline: verify Login
    Given Open Browser
    And  verify enter emailId "<emailId>"
    And Click on Continue
    And Enter Password "<Password>"
    When Click on Sign
    Then Login Successful

    Examples: 
 
    |emailId|Password|
    |login.validusername|login.invalidpassword|
    |login.invalidusername|login.invalidpassword|
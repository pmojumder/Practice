Feature: Amazon Login
  Author: Plabani

  Scenario: verify Login
    Given Open Browser
    And  verify enter emailId "<emailId>"
    And Click on Continue
    And Enter Password "<Password>"
    When Click on Sign
    Then Login Successful

    |emailId|Password|
    |plabani52@gmail.com|Plabani1234!
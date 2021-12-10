Feature: Verify Login
  
  Author:Plabani

  @smoke
  Scenario: Verify Login Successful
    Given enter valid username
    Given enter password
    When clickon LoginButton
    Then Login successful

  @smoke
  Scenario Outline: Verify Unsuccessful Login with invalid username and valid password
    Given enter invalid <"username">
    Given enter valid <"password">
    When clickon LoginButton
    Then Login successful

 Examples:

    |username|password|
    |login.invalidusername|login.validpassword|
    
    Feature: Verify DataTable
Author: Plabani

    @smoke   
    Scenario: verify DataTable
    Given user open demo website
    Then verify table data matches with below table
      | Smith  | John  | jsmith@gmail.com      | $50.00  | http://www.jsmith.com    |
      | Bach   | Frank | fbach@yahoo.com       | $51.00  | http://www.frank.com     |
      | Doe    | Jason | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com      |
      | Conway | Tim   | tconway@earthlink.net | $50.00  | http://www.timconway.com |
   
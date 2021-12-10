
   Feature: Test Login1
  
  
  Author: Plabani

  @smoke
  Scenario: Verify Login
    When enter below username 
      | admin |
    When enter below password
    | admin123 |
    And Click Login
   
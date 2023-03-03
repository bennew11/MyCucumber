Feature: Search existing Employees
  Scenario: Search for Employee by Id
    Given user opens the browser and navigates to the Exelenter homepage
    And user logs in with valid credentials
    And user navigates to the employee list page
    And uswe enters an existing employee id in the search-field
    When User clicks on the search button
    Then the employee information is displayed on the employee list table
    
    Scenario: Search for Employee by name
      Given user opens the browser and navigates to the Exelenter homepage
      And user logs in with valid credentials
      And user navigates to the employee list page
      And user enters an existing employee name in the employee name search-field
      When User clicks on the search button
      Then the employee information is displayed on the employee list table

Feature: US 87743
  Scenario: Search for Existing Employee
    Given user opens the browser and navigates to the Exelenter homepage
    When User logs in as an Admin
    And User navigates to the employee list page
    And Uswer enters a valid employee name in the name field
    And User clicks on the search button
    Then User see the employee information on the employee table
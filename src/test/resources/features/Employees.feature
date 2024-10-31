Feature: Users should be able to access to the Employees page

 // @employees

  Scenario Outline: Verify login with different user types
  //  Given the user logged in as "<user>"
    Given the user logged in with username as "<user>" and password as "UserUser"

    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |


  @employees
  Scenario Outline: User sees all modules on Employees page
    //Given the user logged in as "<user>"

    When users navigate to the Employees page
    And users click the Employees page
    Then user should see  given modules:


      | companyStructure   |
      | findEmployee       |
      | telephoneDirectory |
      | staffChanges       |
      | efficiencyReport   |
      | honoredEmployees   |
      | birthday           |
      | newPage1           |
      | newPage2           |




    Examples:
      | hr        |
      | helpdesk  |
      | marketing |
    Examples:
      | user     |
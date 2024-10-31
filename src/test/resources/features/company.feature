
Feature: Users should be able to access to the Company page


  Scenario Outline: Positive login scenario
    Given the user logged in as "<userType>"
    When the user clicks "Company" link
    Then the user should land on "Company" page

    Examples:
      | userType      |
      | hr        |
      | helpdesk  |
      | marketing |
Feature: Users should be able to access My Profile page.


  Scenario Outline: Positive login scenario
    Given the user logged in as "<userType>"
    When the user clicks profile sidebar
    And the user clicks "My Profile" page
    Then the user should see their profile information
    Examples:
      | userType      |
      | hr        |
      | helpdesk  |
      | marketing |
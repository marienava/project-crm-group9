Feature: Users should be able to log out


  Scenario Outline: Positive login scenario
    Given the user logged in as "<userType>"
    When the user clicks profile sidebar
    And verify user sees following modules:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
    And the user clicks "Log out" page
    Then the user should land on log in "Authorization" page

    Examples:
      | userType |
      | hr       |
      | helpdesk  |
      | marketing |

@mia
Feature: User should be able to access the profile page
  User story: As a user, I want to access my profile page.

  Scenario Outline: User is already in the log in page
    Given the user logged in as "<userType>"
    When user clicks on the username
    And clicks on my profile tab
    Then the users sees following options on my profile page
    | General |
    | Drive |
    | Tasks |
    | Calendar |
    | Conversations |

    Then sees the email address under the General Tab

  Examples:
    | userType  |
    | hr        |
    | helpdesk  |
    | marketing |
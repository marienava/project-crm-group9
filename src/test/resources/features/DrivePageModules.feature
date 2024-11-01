Feature: Drive page modules accessible/visible
  User Story: As a user, I want to access the Drive page.

  @kate
  Scenario Outline: User sees all modules on the Drive page
    Given the user logged in as "<user>"
    And user clicks on Drive menu button
    Then user sees following modules:
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |

    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |

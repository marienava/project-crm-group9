Feature: Activity stream page options/modules visible
  User Story: As a user, I should be able to see all the options on the Activity stream page

  @asta
  Scenario Outline: User sees all modules on Activity stream page
    Given the user logged in as "<user>"
#    Given the I'm logged in as a "<user>":
    Then user sees given modules:
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

    And when user clicks on More tab
    Then user sees dropdown options:
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

    Examples:
      | user      |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario: User can upload and send the file
    Given the I'm logged in as an hr
    When I click on More tab
    And select File option
    And click on Upload file
    And choose file
    And click send
    Then I should se the file on top of the feed

  Scenario: Verify last message
    Given the I'm logged in as an hr
    Then I should see the top message





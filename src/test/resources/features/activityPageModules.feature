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
    Given I am logged in as hr
    When I click on More tab
    And select File option
    And click on Upload file
    And choose file
    And click send
    Then I should see the file on top of the feed

  Scenario: Verify last message
    Given I am logged in as hr
    Then I should see the top message

  Scenario: User can upload file from the project
    Given I am logged in as hr
    When I click on More tab
    And select File option
    And click on "Upload file"
    And choose file from the project
    And click send
    Then I see uploaded file
    And click on "Link"

    Scenario: User can send a simple message
      Given I am logged in as hr
      When I click on Send message...
      And write message
      And click send
      Then I should see the message on top of the feed



    Scenario: User can delete last send message
      Given I am logged in as hr
      When I click on More tab on my message
      And select Delete option
      And confirm that I want to delete the message
      Then my message should be deleted from the feed





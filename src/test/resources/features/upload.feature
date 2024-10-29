
Feature: Users should be able to upload picture and file

  @wip
  Scenario Outline: Positive login scenario
    Given the user logged in as "<userType>"
    When user clicks "Message"
    And user selects "Upload files"
    And user selects file and picture from device
    And user clicks Send button
    Then message should be posted with selected picture and file

    Examples:
      | userType      |
      | hr        |
      | helpdesk  |
      | marketing |
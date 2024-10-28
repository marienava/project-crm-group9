@wip
Feature: Users should be able to upload picture and file

  #Background:
    #Given the user logged in with "username" and "password"

  Scenario Outline: Positive login scenario
    Given the user logged in as "<userType>"
    When user writes new message
    And user selects picture and file from device
    And user selects file and picture from device
    And user clicks Send button
    Then message should be posted with selected picture and file

    Examples:
      | userType      |
      | hr        |
      | helpdesk  |
      | marketing |
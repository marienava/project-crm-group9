Feature: Users should be able to create polls
  User Story: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.


  
  Scenario Outline: User creates a poll by adding a question and multiple answers
    Given the user logged in as "<userType>"
    Given The user clicks on the Poll module
    When User enters question to poll under question box
    And User creates first answer to poll
    And User creates second answer to poll
    And User clicks the Send Poll button


    Examples:
    | userType  |
    | hr        |
    | helpdesk  |
    | marketing |
    | send      |
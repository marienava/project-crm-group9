Feature: Users should be able to create polls
  User Story: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.


  @wip
  Scenario: User creates a poll by adding a question and multiple answers
    Given user logged in as "hr7@cydeo.com" username
    Given The user clicks on the Poll module
    When User enters question to poll under question box
    And User creates first answer to poll
    And User creates second answer to poll
    Then User clicks the Send Poll button



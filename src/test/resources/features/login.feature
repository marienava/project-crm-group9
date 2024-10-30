@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@wip
  Scenario Outline: Verify login with different user types
    #Given the user logged in as "<userType>"
    Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"

  Examples:
    | userType      |
    | hr        |
    | helpdesk  |
    | marketing |





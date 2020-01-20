
Feature: Login


  As user, I want to be able to login into vytrack
  under different roles with username and password



  Scenario: Login as store manager
    Given user is on the login page
    Then user logs in as store manager
    And user verifies that "Dashboard" page subtitle is displayed

@wip
  Scenario: Login as driver
    Given user is on the login page
    Then user logs in as driver
    And user verifies that "Dashboard" page subtitle is displayed

  Scenario: Login as sales manager
    Given user is on the login page
    Then user logs in as sales manager
    And user verifies that "Dashboard" page subtitle is displayed

  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "storemanager85" username and "wrong" password
    And user verifies that "Invalid user name or password." message is displayed


  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then user enters "wrong_username" username and "UserUser123" password
    And user verifies that "Invalid user name or password." message is displayed


  Scenario Outline: Test login with different types
    Given user logs in as "<usertype>"

    Examples:

      | usertype      |
      | driver        |
      | sales manager |
      | store manager |


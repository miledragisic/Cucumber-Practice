Feature: Login as different users

  Scenario: Login as a driver
    Given user is on the login page
    When User logs in using "user1" and "UserUser123"
    And the title should contain "Dashboard"
@wip
  Scenario: Login as a sales manager
    Given user is on the login page
    When User logs in using "salesmanager101" and "UserUser123"
    And the title should contain "Dashboard"

  Scenario: Login as a store manager
    Given user is on the login page
    When User logs in using "storemanager85" and "UserUser123"
    And the title should contain "Dashboard"


  Scenario: Login as a customer
    Given user is on the login page
    When User logs in as a "customer"
    And the title should contain "Dashboard"
######################################################

  Scenario Outline: Test login with diff types
    Given user is on the login page
    Then User logs in as a "<driver>"

    Examples:
      | driver        |
      | customer      |
      | sales manager |
######################################################


  Scenario Outline: Test login with diff types again
    Given user is on the login page
    Then User logs in as a "<user>"

    Examples:
      | user          |
      | sales manager |
      | boss          |
      | driver        |


  Scenario Outline: Test login as <usertype>
    Given user is on the login page
    When User logs in as a "<usertype>"
    Then the user goes to "<tab>" and "<module>"
    Then the title should contain "<title>"

## first ROW is for MATCHING DATA

    Examples:
      | usertype      | tab        | module          | title                                                              |
      | driver        | Activities | Calendar Event  | Calendar Events - Activities                                       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | System     | Jobs            | All - Jobs - System                                                |
#   OPT+CMD+L it will line up our Data.

  Scenario Outline: Login multi-people
    Given user is on the login page
    When user logs in as "<user>"
    Then User should be logged in

    Examples:
      | user          |
      | store manager |
      | sales manager |





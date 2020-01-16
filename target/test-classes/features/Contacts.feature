Feature: Contacts page

  Scenario: Default page number
    Given a driver is logged in
    When the user goes to "Customers" and "Contacts"
    Then default page number should be 1

  Scenario: Menu options
    Given a driver is logged in
    Then user should see following menu options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario: login as a given user
    Given User is on the login page
    When User logs in using following credentials
      | username | user1       |
      | password | UserUser123 |
    Then User should be able to login




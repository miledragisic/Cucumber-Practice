

Feature: Multiple user types

    Scenario: Driver user
      Given User logs in as a "driver"
      When the user goes to "Activities" and "Calendar Events"
      Then the title should contain "Calendar Events - Activities"


      Scenario: Sales manger user
        Given User logs in as a "sales manager"
        When the user goes to "Customer" and "Accounts"
        Then the title should contain "Accounts - Customers"

        Scenario: Store manager user
          Given User logs in as a "store manager"
          When the user goes to "Customers" and "Accounts"
          Then the title should contain "Accounts - Customers"

          Scenario Outline: Test login with different types
            Given User logs in as a "<usertype>"

            Examples:
            |usertype|
            |driver  |
            |sales manager|
            |store manager|
            |boss         |


        Scenario Outline: Test login as usertype
          When User logs in as a "<usertype>"
          Then the user goes to "<module>" and "<submodule>"

          Examples: driver
          |usertype|module    |submodule      |
          |driver  |Activities|Calendar Events|
          |driver  |Customers |Accounts       |

          Examples: sales manager
          |usertype|module|submodule|
          |sales manager|Feet|Vehicles|
          |sales manager|Customers |Accounts|
          |sales manager|activities|Calendar Events|

          Examples: store manager
          |usertype|module|submodule|
          |store manager|Fleet|Vehicles|
          |store manager|Customers|Accounts|
          |store manager|Activities|Calendar Events|



















    Feature: Login
      As a user I want to be able to login into Vytrack
      under different roles with different username and password


@wip
     Scenario: Login as a driver
       Given User is on the login page
       When User logs in as driver
       Then User should be able to login




    Scenario: Login as a store manager
      Given User is on the login page
      When User enters the store manager information
      Then User should be able to login


    Scenario: Login as a sales manager
      Given User is on the login page
      When User enters the sales manager infromation
      Then User should be able to login



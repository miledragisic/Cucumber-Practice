

  Feature: Navigation Menu
    Logged in as store manager, user should be able to navigate
    to pages using the top menu. Once in the expected page
    users should see correct page url.


    Scenario: Fleet --> Vehicles
      Given User is on the login page
      And User enters the store manager information
      When  User goes to Fleet, Vehicles
      #Then the url should be https://qa1.vytrack.com/entity/Extend_Entity_Carreservation


      Scenario: Marketing --> Campaigns
        Given User is on the login page
        And User enters the store manager information
        When user goes to Marketing, Campaigns
        #Then the url should be https://qa1.vytrack.com/campaign


    Scenario: Activities --> Calendar Events
      Given  User is on the login page
      And User enters the store manager information
      When User goes to Activities, Calendar Events
      #Then the url should be https:qa1.vytrack.com/calendar/event
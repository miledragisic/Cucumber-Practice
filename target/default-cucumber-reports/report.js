$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contacts.feature");
formatter.feature({
  "name": "Contacts page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Default page number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a driver is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsStepDefs.a_driver_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to \"Customers\" and \"Contacts\"",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsStepDefs.the_user_goes_to_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "default page number should be 1",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs.default_page_number_should_be(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Menu options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "a driver is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsStepDefs.a_driver_is_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see following menu options",
  "rows": [
    {
      "cells": [
        "Fleet"
      ]
    },
    {
      "cells": [
        "Customers"
      ]
    },
    {
      "cells": [
        "Activities"
      ]
    },
    {
      "cells": [
        "System"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs2.user_should_see_following_menu_options(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "login as a given user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logs in using following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "user1"
      ]
    },
    {
      "cells": [
        "password",
        "UserUser123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ContactsStepDefs2.user_logs_in_using_following_credentials(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs.user_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user, I want to be able to login into vytrack\n  under different roles with username and password",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as store manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies that \"Dashboard\" page subtitle is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/LoginWithParameters.feature");
formatter.feature({
  "name": "Login as different users",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a driver",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logs in using \"user1\" and \"UserUser123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginWithParametersStepDefs.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the title should contain \"Dashboard\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginWithParametersStepDefs.the_title_should_contain(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/SmokeTest.feature");
formatter.feature({
  "name": "Smoke test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "open login page and login as store manager",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify dashboard page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user verifies that \"Dashboard\" page subtitle is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "open login page and login as store manager",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify Manager Dashboards page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Dashboards\" then to \"Manage Dashboards\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies that \"All Manage Dashboards\" page subtitle is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "open login page and login as store manager",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify Vehicle page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Fleet\" then to \"Vehicles\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies that \"All Cars\" page subtitle is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "open login page and login as store manager",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logs in as store manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_store_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify Accounts page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Customers\" then to \"Accounts\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user verifies that \"All Accounts\" page subtitle is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});
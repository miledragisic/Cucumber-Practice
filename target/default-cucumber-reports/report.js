$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "      As a user I want to be able to login into Vytrack\n      under different roles with different username and password",
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
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in as driver",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_a_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
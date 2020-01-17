$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginWithParameters.feature");
formatter.feature({
  "name": "Login as different users",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a sales manager",
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
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in using \"salesmanager101\" and \"UserUser123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginWithParametersStepDefs.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should contain \"Dashboard\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginWithParametersStepDefs.the_title_should_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
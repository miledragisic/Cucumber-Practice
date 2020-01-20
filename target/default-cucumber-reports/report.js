$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user, I want to be able to login into vytrack\n  under different roles with username and password",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as driver",
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
  "name": "user logs in as driver",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_logs_in_as_driver()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\n\tat com.vytrack.pages.LoginPage2.login(LoginPage2.java:37)\n\tat com.vytrack.step_definitions.LoginStepDefs.user_logs_in_as_driver(LoginStepDefs.java:47)\n\tat ✽.user logs in as driver(file:src/test/resources/features/Login.feature:18)\n",
  "status": "failed"
});
formatter.step({
  "name": "user verifies that \"Dshboard\" page subtitle is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_verifies_that_page_subtitle_is_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/LoginWithParameters.feature");
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
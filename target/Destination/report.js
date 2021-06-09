$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "user clicks on login and he will enter username",
  "description": "and password",
  "id": "login;user-clicks-on-login-and-he-will-enter-username",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user click on login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user type \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user type \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should get \"\u003cerror message\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login;user-clicks-on-login-and-he-will-enter-username;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "error message"
      ],
      "line": 16,
      "id": "login;user-clicks-on-login-and-he-will-enter-username;;1"
    }
  ],
  "keyword": "Examples"
});
});
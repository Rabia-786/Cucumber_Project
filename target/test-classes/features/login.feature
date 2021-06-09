Feature: Login
Background:

  Given user is on home page

  @login
  Scenario Outline: user clicks on login and he will enter username
   and password
  When user click on login
  And user type "<username>" and user type "<password>"
  And user click on login button
  Then user should not be able to login
  And user should get "<error message>"
    Examples:
      | username | password | error message |
    | abc@test.com|          | user not enter password|
    |            |   abc123 | user not enter username|
    |  abc@test.com | abc123|   user not able to login|




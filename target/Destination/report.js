$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/comment.feature");
formatter.feature({
  "line": 1,
  "name": "Comment added",
  "description": "",
  "id": "comment-added",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User should be to add comment",
  "description": "",
  "id": "comment-added;user-should-be-to-add-comment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is able to see New Online Store is open",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on it",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is on new page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to leave a comment on it",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepsDefs.user_is_on_main_page()"
});
formatter.result({
  "duration": 4254707500,
  "status": "passed"
});
formatter.match({
  "location": "CommentStepsDefs.user_is_able_to_see()"
});
formatter.result({
  "duration": 60700,
  "status": "passed"
});
formatter.match({
  "location": "CommentStepsDefs.user_clicks_on_it()"
});
formatter.result({
  "duration": 76700,
  "status": "passed"
});
formatter.match({
  "location": "CommentStepsDefs.user_is_on_new_page()"
});
formatter.result({
  "duration": 38100,
  "status": "passed"
});
formatter.match({
  "location": "CommentStepsDefs.user_is_able_to_leave_a_comment_on_it()"
});
formatter.result({
  "duration": 61539100100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027result\u0027]\"}\n  (Session info: chrome\u003d91.0.4472.77)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-E82JQJV4\u0027, ip: \u0027192.168.1.57\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.77, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\irfan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57795}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8118f057363e0c63cd2079a4b4f42a55\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027result\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.example.Utils.getTextFromElement(Utils.java:55)\r\n\tat org.example.Comments.getResultText(Comments.java:23)\r\n\tat org.example.CommentStepsDefs.user_is_able_to_leave_a_comment_on_it(CommentStepsDefs.java:33)\r\n\tat ✽.Then user is able to leave a comment on it(src/test/resources/features/comment.feature:9)\r\n",
  "status": "failed"
});
formatter.uri("src/test/resources/features/currency.feature");
formatter.feature({
  "line": 1,
  "name": "Currency",
  "description": "",
  "id": "currency",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to Currency change from US Dollar to Euro",
  "description": "",
  "id": "currency;user-should-be-able-to-currency-change-from-us-dollar-to-euro",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user changes US Dollar to Euro",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user can see items prices changes from US Dollar to Euro",
  "keyword": "Then "
});
formatter.match({
  "location": "CurrencyStepsDefs.userIsOnTheMainPage()"
});
formatter.result({
  "duration": 8316400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...emo.nopcommerce.com/[new-online-store-is-open]\u003e but was:\u003c...emo.nopcommerce.com/[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.example.CurrencyStepsDefs.userIsOnTheMainPage(CurrencyStepsDefs.java:14)\r\n\tat ✽.Given user is on the main page(src/test/resources/features/currency.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CurrencyStepsDefs.userChangesUSDollarToEuro()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CurrencyStepsDefs.userCanSeeItemsPricesChangesFromUSDollarToEuro()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register successfully",
  "description": "",
  "id": "registration;user-should-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters all required registration details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsDefs.user_is_on_registration_page()"
});
formatter.result({
  "duration": 1060742300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_enters_all_required_registration_details()"
});
formatter.result({
  "duration": 4307793600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 25725100,
  "status": "passed"
});
formatter.uri("src/test/resources/features/shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping",
  "description": "",
  "id": "shopping",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to buy item",
  "description": "",
  "id": "shopping;user-should-be-able-to-buy-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Books option from main page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user selects First Prize Pies Book",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user able to see that product is on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on shopping cart option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user able to see shopping cart on screen",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user able to see price",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on agree terms and condition option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user able to type Emaail and Password on next page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user able to click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user able to see first step of billing",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user able see ship to adress option",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user fills all the option",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user able to see shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Ground option",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user clicks on credit card option",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user able to fill payment information",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user able to fill all page of credit card",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user able to click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user able to see about confirm order",
  "keyword": "Then "
});
formatter.match({
  "location": "CurrencyStepsDefs.userIsOnTheMainPage()"
});
formatter.result({
  "duration": 3138500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...emo.nopcommerce.com/[registerresult/1?returnUrl\u003d/new-online-store-is-open]\u003e but was:\u003c...emo.nopcommerce.com/[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.example.CurrencyStepsDefs.userIsOnTheMainPage(CurrencyStepsDefs.java:14)\r\n\tat ✽.Given user is on the main page(src/test/resources/features/shopping.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_Books_option_from_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_selects_First_Prize_Pies_Book()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_Add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_that_product_is_on_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_shopping_cart_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_shopping_cart_on_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_agree_terms_and_condition_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_type_Emaail_and_Password_on_next_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_first_step_of_billing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_see_ship_to_adress_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_fills_all_the_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_shipping_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_Ground_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_credit_card_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_clicks_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_fill_payment_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_fill_all_page_of_credit_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingStepsDefs.user_able_to_see_about_confirm_order()"
});
formatter.result({
  "status": "skipped"
});
});
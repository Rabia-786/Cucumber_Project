Feature: Shopping

  @Test
  Scenario: User should be able to buy item
    Given user is on the main page
    When  user clicks on Books option from main page
    And   user selects First Prize Pies Book
    And user clicks on Add to cart button
    And user able to see that product is on shopping cart
    And user clicks on shopping cart option
    And user able to see shopping cart on screen
    And user able to see price
    And user clicks on agree terms and condition option
    And user clicks on checkout button
    And user able to type Emaail and Password on next page
    And user able to click on login button
    And user able to see first step of billing
    And user able see ship to adress option
    And user fills all the option
    And user able to see shipping method
    And user clicks on Ground option
    And user clicks on continue button
    And user clicks on credit card option
    And user clicks on continue button
    And user able to fill payment information
    And user able to fill all page of credit card
    And user able to click on continue button
    Then user able to see about confirm order

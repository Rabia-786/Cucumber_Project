Feature: Currency

  @Test
    Scenario: User should be able to Currency change from US Dollar to Euro

    Given user is on the main page

    When user changes US Dollar to Euro
    Then user can see items prices changes from US Dollar to Euro
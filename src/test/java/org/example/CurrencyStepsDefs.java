package org.example;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CurrencyStepsDefs extends BaseTest {
    CurrencyChangePage currencyChangePage = new CurrencyChangePage();

    @Given("^user is on the main page$")
    public void userIsOnTheMainPage() {
        Assert.assertEquals(currencyChangePage.currentPage(),"https://demo.nopcommerce.com/");
    }

    @When("^user changes US Dollar to Euro$")
    public void userChangesUSDollarToEuro() {
        Assert.assertEquals(currencyChangePage.getCurrency(),"US Dollar");

        currencyChangePage.changeCurrencyToEuro();

    }

    @Then("^user can see items prices changes from US Dollar to Euro$")
    public void userCanSeeItemsPricesChangesFromUSDollarToEuro() {

        Assert.assertEquals(currencyChangePage.getCurrency(),"Euro");
    }
}

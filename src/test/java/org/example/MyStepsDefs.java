package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepsDefs extends BaseTest {
    RegisterPage registerPage = new RegisterPage();
    RegisterPageSucessfully registerPageSucessfully = new RegisterPageSucessfully();

    @Given("^user is on registration page$")
    public void user_is_on_registration_page() {
        registerPage.goToRegisterButton();
        Assert.assertTrue(registerPage.currentPage().contains("demo.nopcommerce.com/register"));

    }
    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details() {
     registerPage.userOpenRegisterPageSuccessfully();

    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully(){
     registerPageSucessfully.verifyRegisterMessage();
    }


}

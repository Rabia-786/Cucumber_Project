package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ShoppingStepsDefs extends BaseTest {
     ShoppingPage shoppingPage = new ShoppingPage();


    @Given("^Given user is on the main page$")
    public void user_is_on_the_main_page(){
        Assert.assertEquals(shoppingPage.currentPage(),"https://demo.nopcommerce.com/");
    }

    @When("^user clicks on Books option from main page$")
    public void user_clicks_on_Books_option_from_main_page(){
        shoppingPage.userClicksOnBooks();

        Assert.assertEquals(shoppingPage.getBooksPageTitle(),"Books");
    }

    @And("^user selects First Prize Pies Book$")
    public void user_selects_First_Prize_Pies_Book(){
     shoppingPage.userSelectsFirstPrizeBook();
    }

    @And("^user clicks on Add to cart button$")
    public void user_clicks_on_Add_to_cart_button() {
    }

    @And("^user able to see that product is on shopping cart$")
    public void user_able_to_see_that_product_is_on_shopping_cart(){
    }

    @And("^user clicks on shopping cart option$")
    public void user_clicks_on_shopping_cart_option() {
    }

    @And("^user able to see shopping cart on screen$")
    public void user_able_to_see_shopping_cart_on_screen(){
    }

    @And("^user able to see price$")
    public void user_able_to_see_price(){
    }

    @And("^user clicks on agree terms and condition option$")
    public void user_clicks_on_agree_terms_and_condition_option() {
    }

    @And("^user clicks on checkout button$")
    public void user_clicks_on_checkout_button() {
    }

    @And("^user able to type Emaail and Password on next page$")
    public void user_able_to_type_Emaail_and_Password_on_next_page(){
    }

    @And("^user able to click on login button$")
    public void user_able_to_click_on_login_button() {
    }

    @And("^user able to see first step of billing$")
    public void user_able_to_see_first_step_of_billing(){
    }

    @And("^user able see ship to adress option$")
    public void user_able_see_ship_to_adress_option(){
    }

    @And("^user fills all the option$")
    public void user_fills_all_the_option(){
    }

    @And("^user able to see shipping method$")
    public void user_able_to_see_shipping_method(){
    }

    @And("^user clicks on Ground option$")
    public void user_clicks_on_Ground_option(){
    }

    @And("^user clicks on continue button$")
    public void user_clicks_on_continue_button(){
    }

    @And("^user clicks on credit card option$")
    public void user_clicks_on_credit_card_option() {
     //   Assert.assertTrue(false);
    }

    @And("^user able to fill payment information$")
    public void user_able_to_fill_payment_information() {
    }

    @And("^user able to fill all page of credit card$")
    public void user_able_to_fill_all_page_of_credit_card() {
    }

    @And("^user able to click on continue button$")
    public void user_able_to_click_on_continue_button() {
    }

    @Then("^user able to see about confirm order$")
    public void user_able_to_see_about_confirm_order() {}
}

package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepsDefs extends BaseTest {
    RegisterPage registerPage = new RegisterPage();
    RegisterPageSucessfully registerPageSucessfully = new RegisterPageSucessfully();
    Comments comments = new Comments();
    CurrencyChangePage currencyChangePage = new CurrencyChangePage();
    ShoppingPage shoppingPage = new ShoppingPage();
    Login login = new Login();

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

    @Given("^user is on main page$")
    public void user_is_on_main_page() {
        Assert.assertEquals(comments.currentPage(),"https://demo.nopcommerce.com/");
    }

    @When("^user is able to see New Online Store is open$")
    public void user_is_able_to_see(){

    }

    @And("^user clicks on it$")
    public void user_clicks_on_it(){
    }

    @And("^user is on new page$")
    public void user_is_on_new_page(){
    }

    @Then("^user is able to leave a comment on it$")
    public void user_is_able_to_leave_a_comment_on_it(){
        comments.addCommentsToPage();
        org.junit.Assert.assertEquals(comments.getResultText(),"News comment is successfully added.");

    }

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


    @Given("^user is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^user click on login$")
    public void userClickOnLogin() {
    }
    @And("^user type \"([^\"]*)\" and user type \"([^\"]*)\"$")
    public void userTypeAndUserType(String arg0, String arg1){
    }


    @And("^user click on login button$")
    public void userClickOnLoginButton() {
    }

    @Then("^user should not be able to login$")
    public void userShouldNotBeAbleToLogin() {
    }

    @And("^user should get \"([^\"]*)\"$")
    public void userShouldGet(String arg0) {
    }

}

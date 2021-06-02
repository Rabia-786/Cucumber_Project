package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CommentStepsDefs extends BaseTest{
    Comments comments = new Comments();

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

}

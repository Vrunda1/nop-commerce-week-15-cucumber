package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageTest {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogin();
    }

    @Then("^I should see the Welcome message\"([^\"]*)\"$")
    public void iShouldSeeTheWelcomeMessage(String welcome) {
        Assert.assertEquals("Welcome message is not displayed ", welcome, new LoginPage().verifyWelcomeTextMessage());
    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String mail) {
        new LoginPage().setEmail(mail);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pw) {
        new LoginPage().enterPassword(pw);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();

    }

    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage(String err) {
        Assert.assertEquals("Error is not displayed", err, new LoginPage().verifyErrorMessage());
    }

//    @Then("^I should see the LogOut$")
//    public void iShouldSeeTheLogOut(String logoff) {
//        Assert.assertEquals("Logout is not displayed",logoff,new HomePage().verifyLogout());
//    }

    @And("^I click on logOut link$")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogoutLink();

    }

    @Then("^I should see the \"([^\"]*)\" link on top menu$")
    public void iShouldSeeTheLinkOnTopMenu(String logintext) {
        Assert.assertEquals("Login link is not displayed", logintext, new HomePage().verifyLogin());
    }

    @Then("^I should see the login error message Login was unsuccessful$")
    public void iShouldSeeTheLoginErrorMessageLoginWasUnsuccessful() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = new LoginPage().verifyErrorMessage();
        Assert.assertEquals("Login is successful ", expectedMessage, actualMessage);
    }

    @Then("^I should see the logout \"([^\"]*)\" link$")
    public void iShouldSeeTheLogoutLink(String logout) {
        Assert.assertEquals("Error message is not displayed", logout, new HomePage().verifyLogout());
    }
}


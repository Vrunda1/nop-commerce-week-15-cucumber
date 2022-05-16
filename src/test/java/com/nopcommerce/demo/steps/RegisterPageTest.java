package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should see the \"([^\"]*)\" text$")
    public void iShouldSeeTheText(String message)  {
        String actualMessage= new RegisterPage().verifyRegText();
        String expectedMessage= "Register";
        Assert.assertEquals("Register page is not displayed ",actualMessage,expectedMessage);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegister();
    }

    @Then("^I should see the \"([^\"]*)\" in firstname$")
    public void iShouldSeeTheInFirstname(String firstnameError)  {
                Assert.assertEquals("Error message is displayed",firstnameError,new RegisterPage().verifyFirstnameError());
    }

    @And("^I should see the\"([^\"]*)\" in lastname$")
    public void iShouldSeeTheInLastname(String lastnameErr)  {
        Assert.assertEquals("Error message is displayed",lastnameErr,new RegisterPage().verifyLastnameError());

    }

    @And("^I should see the \"([^\"]*)\" in email$")
    public void iShouldSeeTheInEmail(String emailErr) {
        Assert.assertEquals("Error message is displayed",emailErr,new RegisterPage().verifyEmailError());

    }

    @And("^I should see the \"([^\"]*)\" in password$")
    public void iShouldSeeTheInPassword(String pw) {
        Assert.assertEquals("Error message is displayed",pw,new RegisterPage().verifyPassworsError());
    }

    @And("^I should see the \"([^\"]*)\" in confirm password$")
    public void iShouldSeeTheInConfirmPassword(String confirmPW){
        Assert.assertEquals("Error message is displayed",confirmPW,new RegisterPage().verifyPassworsError());

    }

    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String genderFemale) {
        new RegisterPage().clickOnGenderF();
            }

    @And("^I enter \"([^\"]*)\" in firstname field$")
    public void iEnterInFirstnameField(String fanme) {
        new RegisterPage().enterFirstname(fanme);
    }

    @And("^I enter \"([^\"]*)\" in lastname field$")
    public void iEnterInLastnameField(String lname) {
        new RegisterPage().enterLastname(lname);

    }

    @And("^I select \"([^\"]*)\" from day$")
    public void iSelectFromDay(String day) {
        new RegisterPage().selectDateofBirth(day);

    }

    @And("^I select \"([^\"]*)\" from month$")
    public void iSelectFromMonth(String month) {
        new RegisterPage().selectMonth(month);

    }

    @And("^I select \"([^\"]*)\" from year$")
    public void iSelectFromYear(String year)  {
        new RegisterPage().selectYear(year);

    }

    @And("^I enter \"([^\"]*)\" in email field$")
    public void iEnterInEmailField(String mailid) {
        new RegisterPage().enterEmail(mailid);

    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String pw){
        new RegisterPage().enterPassword(pw);
    }

    @And("^I enter \"([^\"]*)\" in confirm password field$")
    public void iEnterInConfirmPasswordField(String confirmpw){
        new RegisterPage().enterConfirmPassword(confirmpw);

    }


    @Then("^I should see the\"([^\"]*)\" in regostration completed$")
    public void iShouldSeeTheInRegostrationCompleted(String completeMsg) {
        Assert.assertEquals("Error not displayed",completeMsg,new RegisterPage().verifyRegistrationcomplete());
    }
}

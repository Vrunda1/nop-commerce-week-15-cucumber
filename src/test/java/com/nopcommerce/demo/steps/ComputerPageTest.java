package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerPageTest {
    @When("^I click on computer link$")
    public void iClickOnComputerLink() {
        new HomePage().clickOnComputerLink();
    }

    @Then("^I should see the \"([^\"]*)\" computer text$")
    public void iShouldSeeTheComputerText(String computer) {
        Assert.assertEquals("Cannot displayed Computer ", computer, new ComputerPage().verifyComputertext());

    }

    @When("^I click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("^I should see the \"([^\"]*)\" desktop text$")
    public void iShouldSeeTheDesktopText(String desk) {
        Assert.assertEquals("Cannot displayed Desktop Text ", desk, new DesktopPage().verifyDesktopText());
    }

    @When("^I click Computer link$")
    public void iClickComputerLink() {
        new HomePage().clickOnComputerLink();
    }

    @And("^I click on \"([^\"]*)\" Build your own computer$")
    public void iClickOnBuildYourOwnComputer(String buildcomputer) {
        new BuildYourOwnComputerPage().clickOnBuildComputer();

    }

    @And("^I select \"([^\"]*)\" processor$")
    public void iSelectProcessor(String proc) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(proc);
    }

    @And("^I select \"([^\"]*)\" ram$")
    public void iSelectRam(String ramm) {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ramm);
    }

    @And("^I select \"([^\"]*)\" hdd$")
    public void iSelectHdd(String hd) {
        new BuildYourOwnComputerPage().getHdd(hd);

    }

    @And("^I select \"([^\"]*)\" os$")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().getOsRadio(os);
    }

    @And("^I select \"([^\"]*)\" software$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnSoftwareCheckBox(software);
    }

    @And("^I click on add to cart  Button Add To Cart$")
    public void iClickOnAddToCartButtonAddToCart() {
        new BuildYourOwnComputerPage().clickOnAddToCart();

    }

    @Then("^I should see message \"([^\"]*)\" product has been added to your shopping cart$")
    public void iShouldSeeMessageProductHasBeenAddedToYourShoppingCart(String message) {
        Assert.assertEquals("Product has been not added to cart ", message, new BuildYourOwnComputerPage().verifyProductAddedMessage());
    }


}

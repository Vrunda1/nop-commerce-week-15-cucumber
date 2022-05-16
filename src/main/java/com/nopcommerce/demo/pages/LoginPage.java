package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

   private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
   public LoginPage(){
       PageFactory.initElements(driver,this);
   }
    @CacheLookup
    @FindBy (xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy (xpath = "//input[@id='Password']")
    WebElement password;

    // login
    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    @CacheLookup
    @FindBy (xpath = "//input[@id='Password']")
    WebElement getPassword;

    @CacheLookup
    @FindBy (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;

    public void clickOnLogin() {
        clickOnElement(login);
        log.info("Clicking on Login"+ login.toString());
    }
    public void setEmail(String text){
        sendTextToElement(email,text);
        log.info("Enter email "+ text.toString());
    }
    public void enterPassword(String text) {
        sendTextToElement(password,text);
        log.info("Enter passwordl "+ text.toString());
    }

    public String verifyWelcomeTextMessage() {
        log.info("getting Welcome text "+verifyWelcome.toString());
        return getTextFromElement(verifyWelcome);
    }
    public String verifyErrorMessage(){
        log.info("getting ErrorMessage text "+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public String verifyLoginLinkText(){
        log.info("getting ErrorMessage login text "+errorMessage.toString());
        return getTextFromElement(login);
    }


}

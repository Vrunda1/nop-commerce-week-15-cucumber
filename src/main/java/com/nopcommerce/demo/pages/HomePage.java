package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;


    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    By computerLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparel = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1] ");

    By digitaldown = By.linkText("Digital downloads");

    By books = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");

    By jewelry = (By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));

    By giftCards = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on ComputerLink"+ computerLink.toString());
    }
    public void clickOnLogin() {
        clickOnElement(loginLink);
        log.info("Clicking on Login"+ loginLink.toString());
    }

    public void clickOnComputerLink(){
        clickOnElement(computerLink);
        log.info("Clicking on ComputerLink"+ computerLink.toString());
    }
    public void clickOnElecronicsLink(){
        clickOnElement(electronics);
        log.info("Clicking on ElecronicsLink"+ electronics.toString());
    }
    public void clickOnApparelLink(){
        clickOnElement(apparel);
        log.info("Clicking on OnApparelLink"+ apparel.toString());
    }
    public void clickOnDigDown(){
        clickOnElement(digitaldown);
        log.info("Clicking on DigitalDownload"+ digitaldown.toString());
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
        log.info("Clicking on Jewelry"+ jewelry.toString());
    }
    public void clickOnBooks() {
        clickOnElement(books);
        log.info("Clicking on Books"+ books.toString());
    }
    public void clickOnGiftCard() {
        clickOnElement(giftCards);
        log.info("Clicking on GiftCard"+ giftCards.toString());
    }
    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
        log.info("Clicking on LogoutLink"+ logoutLink.toString());
    }
    public String verifyLogout(){
       log.info("getting Logout text "+logoutLink.toString());
        return getTextFromElement(logoutLink);
    }
    public String verifyLogin(){
       log.info("getting Login text "+loginLink.toString());
        return getTextFromElement(loginLink);
    }

}

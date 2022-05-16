package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourComputer;

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
        log.info("Clicking on DesktopLink"+ desktopLink.toString());
    }
    public void clickOnNotebookLink() {
        clickOnElement(notebooksLink);
        log.info("Clicking on NotebookLink"+ notebooksLink.toString());
    }
    public void clickOnSoftwareLink() {
        clickOnElement(softwareLink);
        log.info("Clicking on SoftwareLink"+ softwareLink.toString());
    }
    public String verifyComputertext(){
        log.info("getting Computer text  "+computersText.toString());
        return getTextFromElement(computersText);
    }


}

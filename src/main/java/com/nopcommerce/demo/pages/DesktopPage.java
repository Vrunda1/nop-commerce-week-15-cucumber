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


public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public DesktopPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;


    public void selectProductFromList(String text){
        selectByValueFromDropDown(productList,text);
        log.info("Selecting Product From List"+text+" from dropdown "+productList.toString());
    }

    public String verifyDesktopText(){
        log.info("getting Desktop text "+desktopText.toString());
        return getTextFromElement(desktopText);
    }
    public void clickOnSortBy(){
        clickOnElement(sortBy);
        log.info("Clicking on newsletterbox"+ sortBy.toString());
    }
    public void clickOnDisplay(){
        log.info("Clicking on SortBy"+ display.toString());
        clickOnElement(display);
    }
    public void selectProductList(){
        clickOnElement(productList);
        log.info("Clicking on ProductList"+ productList.toString());
    }


}

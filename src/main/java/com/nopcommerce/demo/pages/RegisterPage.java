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


public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath ="//input[@id='gender-female']")
    WebElement genderButtonFemale;
    @CacheLookup
    @FindBy(xpath ="//input[@id='gender-male']")
    WebElement genderButtonMale;
    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;
    @CacheLookup
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;
    @CacheLookup
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;
    @CacheLookup
    @FindBy(xpath ="//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath ="//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement confirmPw;
    @CacheLookup
    @FindBy(xpath ="//button[@id='register-button']")
    WebElement registerBtn;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorText;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;


    public void clickOnGenderF(){
        clickOnElement(genderButtonFemale);
        log.info("Clicking on Gender emaleF"+ genderButtonFemale.toString());
    }
    public void enterFirstname(String fname){
        sendTextToElement(firstName,fname);
        log.info("Enter Firstname"+fname+ " to email field "+firstName.toString() );
    }
    public void enterLastname(String lname){
        sendTextToElement(lastName,lname);
        log.info("Enter Lastname"+lname+ " to email field "+lastName.toString() );
    }
    public void selectDateofBirth(String date){
        selectByValueFromDropDown(day,date);
        log.info("Selecting DateofBirth"+date+" from dropdown "+day.toString() );
    }
    public void selectMonth(String mon){
        selectByValueFromDropDown(month,mon);
        log.info("Selecting Month"+mon+" from dropdown "+month.toString() );

    } public void selectYear(String yr){
        selectByValueFromDropDown(year,yr);
        log.info("Selecting Year"+yr+" from dropdown "+year.toString() );
    }
    public void enterEmail(String mail) {
        sendTextToElement(email, mail);
        log.info("Enter email"+mail+ " to email field "+email.toString() );
    }
    public void enterPassword(String pw) {
        sendTextToElement(password,pw);
        log.info("Enter Password"+pw+ " to email field "+password.toString() );
    }
    public void enterConfirmPassword(String Pw) {
        sendTextToElement(confirmPw,Pw);
        log.info("Enter ConfirmPassword"+Pw+ " to email field "+confirmPw.toString() );
    }
    public void clickOnRegister() {
        clickOnElement(registerBtn);
        log.info("Clicking on Register"+ registerBtn.toString());
    }
    public String verifyRegText(){
        log.info("getting RegText text "+registerText.toString());
        return getTextFromElement(registerText);
    }
    public String verifyFirstnameError(){
        log.info("getting FirstnameError text "+firstNameErrorText.toString());
        return getTextFromElement(firstNameErrorText);
    }
    public String verifyLastnameError(){
        log.info("getting LastnameError text from "+lastNameErrorText.toString());
        return getTextFromElement(lastNameErrorText);
    }public String verifyEmailError(){
        log.info("getting EmailError text "+emailErrorText.toString());
        return getTextFromElement(emailErrorText);
    }
    public String verifyPassworsError(){
        log.info("getting PassworsError text "+passwordErrorText.toString());
        return getTextFromElement(passwordErrorText);
    }public String verifyConfirmError(){
        log.info("getting ConfirmError text "+confirmPasswordErrorText.toString());
        return getTextFromElement(confirmPasswordErrorText);
    }public String verifyRegistrationcomplete(){
        log.info("getting Registrationcomplete text "+registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }
    public void clickOncontiueButton() {
        clickOnElement(continueBtn);
        log.info("Clicking on contiueButton"+ continueBtn.toString());
    }

}

package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy (name= "lastname")
    public WebElement lastName;

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(id = "wooden_spoon")
    public WebElement submitBtn;

    @FindBy(xpath = "//small[.='email address is required']")
    public WebElement textEmailRequired;

    @FindBy(xpath = "//small[.='username is required']")
    public WebElement textUserNameRequired;

    @FindBy(xpath = "//small[.='last name is required']")
    public WebElement textLastNameRequired;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "phone")
    public WebElement phoneNum;

    @FindBy(css = "[value='male']")
    public WebElement gender;

    @FindBy(name = "birthday")
    public WebElement dob;

    @FindBy(css = "[value='DE']")
    public WebElement department;

    @FindBy(xpath = "//*[.='SDET']")
    public WebElement jobTitle;

    @FindBy(id = "inlineCheckbox2")
    public WebElement javaLanguage;

    @FindBy (id = "inlineCheckbox3")
    public WebElement javaScriptLangage;

    @FindBy(name = "email")
    public WebElement email;
}

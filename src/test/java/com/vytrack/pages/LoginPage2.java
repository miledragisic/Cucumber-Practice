package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BasePage{

    public LoginPage2(){

        PageFactory.initElements(Driver.get(), this);
    }


    WebDriver driver= Driver.get();

    @FindBy(id= "prependedInput")
    public WebElement userName;

    @FindBy (id= "prependedInput2")
    public WebElement passWord;

    @FindBy (id= "_submit")
    public WebElement loginBtn;

    @FindBy (xpath = "//*[@id=\"widget-container-dashboard-widget-1192072752-14\"]/div/div[1]/div[3]/text()")
    public WebElement quick;



//      CREATING A METHOD TO LOGIN:

    public void login(String userName, String passWord){

        this.userName.sendKeys(userName);
        this.passWord.sendKeys(passWord);
        this.loginBtn.click();

    }
}

package com.vytrack.pages;

//          BASE PAGE:



// Store common Web Elements and methods of application
// top menu appears on every single page
// so we can keep them here


import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


// SUPER Class of PAGE Classes located under PACKAGE PAGES.
public class BasePage {


    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement loaderMask;       //          ==> loader mask (loading bar, spinning wheel) v
//                                                                                                v
    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;


// *******************************************************


    public BasePage(){
        PageFactory.initElements(Driver.get(), this); // to enable @FindBy
    }
// *******************************************************

//     * While this loading screen present, html code is a not complete
//     * Some elements can be missing
//     * Also, you won't be able to interact with any elements
//     * All actions will be intercepted
//     * Waits until loader mask (loading bar, spinning wheel) disappears
//     *
//     * @return true if loader mask is gone, false if something went wrong


    public boolean waitUntilLoaderMaskDisappear(){

        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (Exception e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true


        }
    }






// this METHOD stands for navigation in Vytrack App
// provides Module Name and Sub Module name

// Module = Dashboard, Fleet, Customer
// Sub Module = what's inside tab
//
    public void navigateTo(String moduleName, String subModulename) {

        Actions actions = new Actions(Driver.get());
        String moduleLocator = "//*[normalize-space()='" + moduleName + "' and @class='title title-level-1']"; // they share same Values Attributes, EXCEPT Text
        // EXCEPT Text (Dashboard, Fleet, Customer...)

        String subModuleLocator = "//*[normalize-space()='" + subModulename + "' and @class='title title-level-2']"; // share same class but different Text,
        //(Vehicles, Vehicle Odometer, Vehicles Oost...)

// WebDriverWait (explicit) : waits till the element is found (moduleLocator)
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));
        waitUntilLoaderMaskDisappear();


        module.click(); // once we click on Module, SubModule should be visible

        WebElement subModule = Driver.get().findElement(By.xpath(subModuleLocator));
//      just in case we can put another Wait:
        wait.until(ExpectedConditions.visibilityOf(subModule));
        subModule.click();

        BrowserUtils.waitForPageToLoad(10);
    }
//
//            if(Driver.get().findElements(By.cssSelector("div[class='loader-mask shown']")).size()>0) {
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));


//// after navigation WAIT for LOADER MASK to disappear:
//        wait.until(ExpectedConditions.invisibilityOf(loaderMask));            DLT



// *********************************************************************************


//        JUST MORE USEFUL METHODS:
//       **************************

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle); // -> element was found previously but
        return pageSubTitle.getText();                  //    after loading it cannot be found again,
    }                                                   //    and we get Stale Element Exception


// *********************************************************************************

    public String getUserName() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForVisibility(userName, 5); // -> waits for Visibility of the Element
        return userName.getText();
    }

// *********************************************************************************

      // Java Script is supported by all browsers. (WebPage consists of: HTML, SCC and Java Script)
      // Sometimes Selenium default methods (clicks, send keys) might not work.
      // We can replace those actions with Java Script Executor

    public void logOut() {
        BrowserUtils.wait(2);
        BrowserUtils.clickWithJS(userName); // -> click with Java Script
        BrowserUtils.clickWithJS(logOutLink);
    }

// *********************************************************************************

    public void goToMyUser() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click(); // -> Element can be Visible but NOT Clickable yet!
        BrowserUtils.waitForClickablility(myUser, 5).click();
    }







//    @FindBy(css = "div[class='loader-mask shown']")
//    public WebElement loaderMask;
//
//    @FindBy(css = "h1[class='oro-subtitle']")
//    public WebElement pageSubTitle;
//
//    @FindBy(css = "#user-menu > a")
//    public WebElement userName;
//
//    @FindBy(linkText = "Logout")
//    public WebElement logOutLink;
//
//    @FindBy(linkText = "My User")
//    public WebElement myUser;
//
//    public BasePage() {
//        //this method requires to provide webdriver object for @FindBy
//        //and page class
//        //this means this page class
//        PageFactory.initElements(Driver.get(), this);
//    }
//
//    /**
//     * While this loading screen present, html code is a not complete
//     * Some elements can be missing
//     * Also, you won't be able to interact with any elements
//     * All actions will be intercepted
//     * Waits until loader mask (loading bar, spinning wheel) disappears
//     *
//     * @return true if loader mask is gone, false if something went wrong
//     */
//    public boolean waitUntilLoaderMaskDisappear() {
//        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
//        try {
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
//            return true;
//        } catch (NoSuchElementException e) {
//            System.out.println("Loader mask not found!");
//            e.printStackTrace();
//            return true; // no loader mask, all good, return true
//        } catch (WebDriverException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    /**
//     * This method stands for navigation in vytrack app
//     * provide tab name, for example "Fleet" as a String
//     * and module name, for example "Vehicles" as a String as well
//     * then based on these values, locators will be created
//     *
//     * @param moduleName
//     * @param subModuleName normalize-space() same line .trim() in java
//     */
//    public void navigateTo(String moduleName, String subModuleName) {
//        String moduleLocator = "//*[normalize-space()='" + moduleName + "' and @class='title title-level-1']";
//        String subModuleLocator = "//*[normalize-space()='" + subModuleName + "' and @class='title title-level-2']";
//
//        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));
//
//        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
//        wait.until(ExpectedConditions.visibilityOf(module));
//        wait.until(ExpectedConditions.elementToBeClickable(module));
//
//        waitUntilLoaderMaskDisappear();
//        module.click(); //once we clicked on module, submodule should be visible
//
//        WebElement subModule = Driver.get().findElement(By.xpath(subModuleLocator));
//        wait.until(ExpectedConditions.visibilityOf(subModule));
//        subModule.click();
//    }
//
//    /**
//     * @return page name, for example: Dashboard
//     */
//    public String getPageSubTitle() {
//        //ant time we are verifying page name, or page subtitle, loader mask appears
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
//        return pageSubTitle.getText();
//    }
//
//    public String getUserName() {
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.waitForVisibility(userName, 5);
//        return userName.getText();
//    }
//
//    public void logOut() {
//        BrowserUtils.wait(2);
//        BrowserUtils.clickWithJS(userName);
//        BrowserUtils.clickWithJS(logOutLink);
//    }
//
//    public void goToMyUser() {
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.waitForClickablility(userName, 5).click();
//        BrowserUtils.waitForClickablility(myUser, 5).click();
//    }
}

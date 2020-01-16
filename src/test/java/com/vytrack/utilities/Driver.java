package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Driver {

    private static WebDriver driver; // - only one private static instance

    // 2.
    private Driver(){

    }


    // 3.
    public static WebDriver get(){

        // if WebDriver object was not created yet:

        if(driver == null){

            String browser= ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    // to configure Chrome browser for tests
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;

                case "chrome deadless":
                    WebDriverManager.chromedriver().setup();
                    // to configure Chrome browser for tests
                    ChromeOptions options= new ChromeOptions();
                    // to run tests without interface, set to true
                    options.setHeadless(true);
                    driver= new ChromeDriver(options);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;

                    default: // if browser type is wrong, stop tests  and throw exception
                             // no browser will be opened
                        throw new RuntimeException("Wrong browser type!");
            }
        }
        return driver;
    }


    public static void close(){
        // if driver still exists:
        if(driver != null){
            // close all browsers
            driver.quit();
            // destroy all objects
            driver=null;
        }
    }


}

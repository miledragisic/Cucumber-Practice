package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

    public static void main(String[] args) throws MalformedURLException {

        // create URL for the HUB
        URL url= new URL("http://localhost:4444/wd/hub");// path to the HUB

        // create Chrome options
        ChromeOptions chromeOptions= new ChromeOptions();

        // RemoteWebDriver we use to pen browser remotely using Grid
        WebDriver driver= new RemoteWebDriver(url, chromeOptions);

        driver.get("https://selenium.div");
        System.out.println(driver.getTitle());

    }

}

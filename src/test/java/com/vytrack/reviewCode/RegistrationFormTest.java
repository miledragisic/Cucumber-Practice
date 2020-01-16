package com.vytrack.reviewCode;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTest {
    WebDriver driver;

    @Before
    public void setUp(){
        driver= Driver.get();
        driver.get("http://practice.cybertekschool.com/registration_form");
    }

    @After
    public void tearDown(){
        BrowserUtils.wait(2);
        Driver.close();
    }

    @Test
    public void test1(){
        // enter value in firstname
        // click sign up
        //verify 'last name iw required' is displayed

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.id("wooden_spoon")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='last name is required']")).isDisplayed());

    }

    @Test
    public void test2(){
        //enter value in first name
        //enter value in last name
        // click signup
        // verify 'email is required' message is displayed
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Malkovich");
        driver.findElement(By.id("wooden_spoon")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='username is required']")).isDisplayed());
    }

    @Test
    public void test3(){
        //enter value in first name
        //enter value in last name
        // enter value in username
        // click signup
        // verify 'email is required' message is displayed
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Malkovich");
        driver.findElement(By.name("username")).sendKeys("johnmalkovich");
        driver.findElement(By.id("wooden_spoon")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//small[.='email address is required']")).isDisplayed());
    }



}

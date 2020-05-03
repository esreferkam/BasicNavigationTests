package com.cbt.tests;

import com.cbt.utilites.BrowserFactory;
import com.cbt.utilites.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class NavigationTests  {
    public static void main(String[] args) {
        chromeTest();
        firefoxTest();
        edgeTest();

    }

    public static void chromeTest(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());
        driver.close();


    }
    public static void firefoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());
        driver.close();


    }
    public static void edgeTest(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());
        driver.close();


    }

}

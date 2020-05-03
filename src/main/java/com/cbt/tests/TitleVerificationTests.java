package com.cbt.tests;

import com.cbt.utilites.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        String title = "Practice";
        String url = "http://practice.cybertekschool.com/";
            for(String each : urls) {
                WebDriver driver = BrowserFactory.getDriver("chrome");
                driver.get(each);
                if (driver.getTitle().equals(title)) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                    System.out.println("Expected: " + title);
                    System.out.println("Actual: " + driver.getTitle());
                }
                driver.close();
            }

    }
}

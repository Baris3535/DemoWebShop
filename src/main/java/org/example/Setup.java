package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
    static WebDriver driver;
    static String url = "https://demowebshop.tricentis.com/";

    public Setup(WebDriver driver) {
        Setup.driver = driver;
    }

    public void SetupUrl() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
}








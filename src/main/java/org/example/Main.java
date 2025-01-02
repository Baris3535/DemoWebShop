package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.Setup.driver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // WebDriver Setup
        Setup setup = new Setup(driver);
        setup.SetupUrl();

        Registration register = new Registration(driver);
        register.registrierung();

        Einkauf einkaufen = new Einkauf(driver);
        einkaufen.einkauf();

        LogOut logOut = new LogOut(driver);
        logOut.logoutdemo();
    }
}

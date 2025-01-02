package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class LogOut {
    static WebDriver driver;
    static String Logoutbutton = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a";


    public LogOut (WebDriver driver){
        LogOut.driver = driver;
    }

    public void logoutdemo(){
        driver.findElement(By.xpath(Logoutbutton));
    }

}

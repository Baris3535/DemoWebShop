package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class Registration {
    static WebDriver driver;
    String registerbutton = "//*[@href='/register'][1]";
    String genderbutton = "//*[@id=\"gender-female\"]";
    String firstnamebutton = "//*[@id=\"FirstName\"]";
    String firstname = "Max";
    String lastnamebutton = "//*[@id=\"LastName\"]";
    String lastname = "Mustermann";
    String emailbutton = "//*[@id=\"Email\"]";
    String email = "Adolfs41-@web.de";
    String passwortfeld = "//*[@id=\"Password\"]";
    String passwort = " Max-1111";
    String confirm = "//*[@id=\"ConfirmPassword\"]";
    String register = "//*[@id=\"register-button\"]";

    public Registration(WebDriver driver){
        Registration.driver = driver;


    }

    public void registrierung() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath(registerbutton)).click();
        driver.findElement(By.xpath(genderbutton)).click();
        driver.findElement(By.xpath(firstnamebutton)).sendKeys(firstname);
        driver.findElement(By.xpath(lastnamebutton)).sendKeys(lastname);
        driver.findElement(By.xpath(emailbutton)).sendKeys(email);
        driver.findElement(By.xpath(passwortfeld)).sendKeys(passwort);
        driver.findElement(By.xpath(confirm)).sendKeys(passwort);
        driver.findElement(By.xpath(register)).click();


        Screenshot screenshot = new Screenshot(driver);
        screenshot.takescreenshot();
    }

}

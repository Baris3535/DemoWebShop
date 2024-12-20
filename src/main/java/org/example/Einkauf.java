package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Einkauf {

    static WebDriver driver;

    String computerbutton = "//*[@href='/computers'][1]";
    String notebooksbutton = "//*[@title=\"Show products in category Notebooks\"]";
    String addtocart = "//*[@value=\"Add to cart\"]";
    String shoppingbutton = "//*[@class=\"cart-label\"]";
    String agbbutton = "//*[@id=\"termsofservice\"]";
    String ceckoutbutton ="//*[@id=\"checkout\"]";
    String countrybutton = "//*[@id=\"BillingNewAddress_CountryId\"]";
    String country = "Germany";

    String citybutton = "//*[@id=\"BillingNewAddress_City\"]";
    String city = "Hamburg";
    String adressbutton ="//*[@id=\"BillingNewAddress_Address1\"]";
    String adress = "Schultz-Strasse 44";
    String zipbutton = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]";
    String zipcode = "20556";
    String phonebutton = "//*[@id=\"BillingNewAddress_PhoneNumber\"]";
    String phonenumber = "04035546";
    String continuebutton = "//*[@id=\"billing-buttons-container\"]/input";
    String adressselect = "//*[@id=\"shipping-address-select\"]";
    String pickupbutton = "//*[@type=\"checkbox\"]";
    String continuebutton2 = "//*[@id=\"shipping-buttons-container\"]/input";
    String paymenmethod = "//*[@id=\"paymentmethod_0\"]";
    String continuebutton3 = "//*[@id=\"payment-method-buttons-container\"]/input";
    String continuebutton4 = "//*[@id=\"payment-info-buttons-container\"]/input";
    String confirmbutton = "//*[@id=\"confirm-order-buttons-container\"]/input";

    public Einkauf(WebDriver driver) {
        Einkauf.driver = driver;
    }


    public void einkauf() throws InterruptedException {

        driver.findElement(By.xpath(computerbutton)).click();
        driver.findElement(By.xpath(notebooksbutton)).click();
        driver.findElement(By.xpath(addtocart)).click();
        driver.findElement(By.xpath(shoppingbutton)).click();
        driver.findElement(By.xpath(agbbutton)).click();
        driver.findElement(By.xpath(ceckoutbutton)).click();
        driver.findElement(By.xpath(countrybutton)).sendKeys(country);
        driver.findElement(By.xpath(citybutton)).sendKeys(city);
        driver.findElement(By.xpath(adressbutton)).sendKeys(adress);
        driver.findElement(By.xpath(zipbutton)).sendKeys(zipcode);
        driver.findElement(By.xpath(phonebutton)).sendKeys(phonenumber);
        driver.findElement(By.xpath(continuebutton)).click();
        driver.findElement(By.xpath(adressselect)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(pickupbutton)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(continuebutton2)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(paymenmethod)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(continuebutton3)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(continuebutton4)).click();
        Thread.sleep(5);
        driver.findElement(By.xpath(confirmbutton)).click();



    }





}
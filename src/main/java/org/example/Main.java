package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    WebDriver driver;
    String url ="https://demowebshop.tricentis.com/";
    String registerbutton = "//*[@href='/register'][1]";
    String genderbutton = "//*[@id=\"gender-female\"]";
    String firstnamebutton = "//*[@id=\"FirstName\"]";
    String firstname = "Max";
    String lastnamebutton = "//*[@id=\"LastName\"]";
    String lastname = "Mustermann";
    String emailbutton = "//*[@id=\"Email\"]";
    String email = "Max45-@web.de";
    String passwortfeld = "//*[@id=\"Password\"]";
    String passwort = " Max-1111";
    String confirm = "//*[@id=\"ConfirmPassword\"]";
    String register = "//*[@id=\"register-button\"]";
    String actual = "(//*[@class='result'])";
    String message = "Your registration completed";
    By computer_cheap = By.linkText("Build your own cheap computer");
    By computer_cheap_add_tocarbutton = By.id("add-to-cart-button-72");
    By book_addtocart = By.xpath("//*[@id=\"product-details-form\"]/div/div[2]/div[2]/div[4]/div/div[2]/div[3]/div[2]/input");
    By laptop_addtocart = By.xpath("//*[@id=\"product-details-form\"]/div/div[2]/div[2]/div[3]/div/div[2]/div[3]/div[2]/input");
    By shoppingcart_button = By.id("topcartlink");
    By thermofservice = By.id("termsofservice");
    By checkout_button = By.id("checkout");

    By continuebutton = By.xpath("//*[@type=\"button\"and @value=\"Continue\"]");
    By firstname1 = By.id("BillingNewAddress_FirstName");
    By lastname2 = By.id("BillingNewAddress_LastName");
    By email3 = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    String country_input = "Hamburg";
    By city = By.id("BillingNewAddress_City");
    By address_1 = By.id("BillingNewAddress_Address1");
    String addresse_1_input = "Randowstraße 25";
    By postalcode = By.id("BillingNewAddress_ZipPostalCode");
    String postalcode_input = "22547";
    By phonenumber = By.id("BillingNewAddress_PhoneNumber");
    String phonenumber_input= "123456789";

    public void setup(){
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    public void registrierung() throws InterruptedException {
        driver.findElement(By.xpath(registerbutton)).click();
        driver.findElement(By.xpath(genderbutton)).click();
        driver.findElement(By.xpath(firstnamebutton)).sendKeys(firstname);
        driver.findElement(By.xpath(lastnamebutton)).sendKeys(lastname);
        driver.findElement(By.xpath(emailbutton)).sendKeys(email);
        driver.findElement(By.xpath(passwortfeld)).sendKeys(passwort);
        driver.findElement(By.xpath(confirm)).sendKeys(passwort);
        driver.findElement(By.xpath(register)).click();

        Thread.sleep(2000);

        String txt = driver.findElement(By.xpath(actual)).getText();

        if (message.equals(txt)) {
            System.out.println("Registrierung abgeschlossen");
        } else {
            System.out.println("Registrierung nicht abgeschlossen");
            System.out.println(txt);
        }
        driver.findElement(continuebutton).click();

    }
    public void login(){

    }

    public void einkaufen() throws InterruptedException {
            driver.findElement(computer_cheap).click();
            driver.findElement(computer_cheap_add_tocarbutton).click();
            driver.navigate().refresh();
            driver.findElement(shoppingcart_button).click();
            driver.navigate().refresh();
            driver.findElement(thermofservice).click();
            driver.findElement(checkout_button).click();
        driver.findElement(firstname1).sendKeys("Max");
        driver.findElement(lastname2).sendKeys("Mustermann");
        driver.findElement(country).click();
        driver.findElement(city).sendKeys(country_input);
        driver.findElement(address_1).sendKeys(addresse_1_input);
        driver.findElement(postalcode).sendKeys(postalcode_input);
        driver.findElement(phonenumber).sendKeys(phonenumber_input);
        driver.findElement(By.className("new-address-next-step-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("payment-method-next-step-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("payment-info-next-step-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("confirm-order-next-step-button")).click();

    }

    public void bezahlen(){

    }
    public void logout(){
        driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        Main dirigent = new Main();
        dirigent.setup();
        dirigent.registrierung();
        //dirigent.login();
        dirigent.einkaufen();
        //dirigent.bezahlen();
        dirigent.logout();
    }
}
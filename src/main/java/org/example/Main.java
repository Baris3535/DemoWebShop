package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    String email = "Max36-@web.de";
    String passwortfeld = "//*[@id=\"Password\"]";
    String passwort = " Max-1111";
    String confirm = "//*[@id=\"ConfirmPassword\"]";
    String register = "//*[@id=\"register-button\"]";
    String actual = "(//*[@class='result'])";
    String message = "Your registration completed";

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


    }
    public void login(){

    }

    public void einkaufen(){

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
        //dirigent.einkaufen();
        //dirigent.bezahlen();
        dirigent.logout();
    }
}
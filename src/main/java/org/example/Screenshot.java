package org.example;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;



import java.io.File;
import java.io.FileInputStream;

public class Screenshot {
    static WebDriver driver;

    public Screenshot(WebDriver driver){
        Screenshot.driver = driver;
    }
    public void takescreenshot(){

        String filePath = "/Users/baristunc/Desktop/Screenshots/RegistrationScreenshot.jpg";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File deskFile = new File(filePath);

        FileUtils.copyFile(srcFile, deskFile);

    }
}

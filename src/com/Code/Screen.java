package com.Code;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class Screen {

    public static void Ss(WebDriver driver) throws IOException {
        String str = RandomString.make(3);


        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\SS" + str + ".png");
        FileHandler.copy(source, destination);


    }


}















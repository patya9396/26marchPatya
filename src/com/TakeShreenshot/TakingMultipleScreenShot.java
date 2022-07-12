package com.TakeShreenshot;

import com.Code.Screen;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakingMultipleScreenShot {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/ ");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        String str = RandomString.make(3);
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\BusinessComputers.in\\IdeaProjects\\SeleniumProject\\shreenshot\\myshreenshot" + str + ".png");
        FileHandler.copy(source, destination);


    }


}

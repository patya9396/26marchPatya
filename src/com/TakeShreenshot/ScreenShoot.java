package com.TakeShreenshot;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class ScreenShoot {

    public static void main(String[] aargs) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destination = new File("C:\\Users\\BusinessComputers.in\\IdeaProjects\\SeleniumProject\\shreenshot\\myScreenshoot.png");
        FileHandler.copy(source, destination);
        Thread.sleep(10000);
        driver.navigate().to("http://www.unishivaji.ac.in/");

        File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination1 = new File("C:\\Users\\BusinessComputers.in\\IdeaProjects\\SeleniumProject\\shreenshot\\myScreenshoot1" + ".png");
        FileHandler.copy(source1, destination1);
        String str = RandomString.make(3);


    }


}

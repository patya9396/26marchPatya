package com.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImpliciteWait {


    public static void main(String args[]) {


        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));







        // this can not getting propey how to use fluentwait plez make suggest
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://vctcpune.com/selenium/practice.html");

       // this applicable for dynali
    }


}

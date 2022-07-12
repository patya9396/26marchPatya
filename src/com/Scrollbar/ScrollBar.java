package com.Scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollBar {

    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        JavascriptExecutor j = ((JavascriptExecutor) driver);
        j.executeAsyncScript("window.scrollBy(80,800)");


    }


}

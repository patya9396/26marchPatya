package com.Scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScollingByView {
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement pp = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        JavascriptExecutor j = ((JavascriptExecutor) driver);
        j.executeScript("arguments[0].scrollIntoView(true)", pp);
        // this an applicable for scrolling stating scrooling will be done bu using this

    }


}

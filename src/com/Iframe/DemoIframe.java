package com.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframe {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.switchTo().frame(3);
        driver.findElement(By.name("mytext4")).sendKeys("prathmesh");
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        driver.findElement(By.name("mytext3")).sendKeys("mahesh");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("kiran");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.name("mytext2")).sendKeys("mahesh");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.name("mytext3")).sendKeys("prathmesh");


    }


}

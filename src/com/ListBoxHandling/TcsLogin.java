package com.ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TcsLogin {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nextstep.tcs.com/campus/#/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@class='registerHere greenButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("btnSlctIT")).click();


    }


}

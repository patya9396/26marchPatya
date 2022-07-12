package com.locaters_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fc {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUyODczMTIzLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pchougule033@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pc3717");
        driver.get("https://www.facebook.com/recover/initiate/?ars=facebook_login");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pchougule033@gmail.com");
        driver.findElement(By.xpath("//button[@id='did_submit']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.navigate().back();
        driver.navigate().forward();


    }
}

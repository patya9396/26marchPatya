package com.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginPageAutomated {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[contains(@id,'u_2_b')]")).sendKeys("prathmesh ");
        driver.findElement(By.xpath("//input[contains(@id,'u_2_d')]")).sendKeys("chougule");
        driver.findElement(By.xpath("//input[contains(@id,'u_2_g')]")).sendKeys("7020376495");
        driver.findElement(By.xpath("//input[contains(@id,'ssword_st')]")).sendKeys("371737");
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        driver.findElement(By.id("day")).sendKeys("8");
        driver.findElement(By.id("month")).click();
        driver.findElement(By.id("month")).click();
        driver.findElement(By.xpath("//option[text()='Feb']")).click();
        driver.findElement(By.id("year")).click();
        driver.findElement(By.id("year")).click();
        driver.findElement(By.xpath("//option[text()='1999']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_1lch']")).click();


    }


}

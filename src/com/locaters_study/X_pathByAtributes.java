package com.locaters_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathByAtributes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        driver.findElement(By.xpath("//option[@value='option3']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user able to click radio button");
        driver.findElement(By.xpath("//input[@value='Radio4']")).click();
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("user should to click on any cheakbox");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();


        //driver.findElement(By.xpath("//a[@id='opentab']")).click();


    }


}

package com.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class DemoFrame1 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        String text = driver.findElement(By.xpath("(//li[@class='breadcrumb-item'])[2]")).getText();
        System.out.println(text);
        driver.switchTo().frame("frame2");
        WebElement element = driver.findElement(By.id("animals"));
        Select s = new Select(element);
        s.selectByVisibleText("Big Baby Cat");
        Thread.sleep(1000);
        s.selectByValue("avatar");
        Thread.sleep(1000);
        s.selectByIndex(0);
        s.isMultiple();
        driver.switchTo().defaultContent();
        String text1 = driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
        System.out.println(text1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        String ele = driver.findElement(By.xpath("//b[text()='Animals :']")).getText();
        System.out.println(ele);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");


    }


}

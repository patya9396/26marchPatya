package com.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.switchTo().frame("frame2");
        System.out.println("Switching path of selenium in 2nd frame ");
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("//b[text()='Animals :']")).getText();
        System.out.println(text);
        WebElement element = driver.findElement(By.id("animals"));
        Select s = new Select(element);
        s.selectByVisibleText("Baby Cat");
        //switch selenium path from frame ot main page
        driver.switchTo().defaultContent();
        System.out.println("Switch in frame 1");
        driver.switchTo().frame("frame1");
        String text1 = driver.findElement(By.xpath("//b[text()='Topic :']")).getText();
        System.out.println(text1);
        WebElement textbox = driver.findElement(By.tagName("input"));
        textbox.sendKeys("selenium pratice");
        //switch the path of selenium from frame 1 to main page
        driver.switchTo().defaultContent();
        //swich to selenium path main page nestated page
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        System.out.println("switch ina nestade frame 3");
        String text2 = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
        System.out.println(text2);
        driver.findElement(By.xpath("//input[@id='a']")).click();


    }


}

package com.popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Assignment {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Thread.sleep(5000);
        String l1 = driver.getWindowHandle();
        System.out.println(l1);
        WebElement b1 = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
        b1.click();
        Thread.sleep(1000);
        b1.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
        Thread.sleep(500);
        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);
        Iterator<String> allid = ids.iterator();
        String id1 = allid.next();
        String id2 = allid.next();
        System.out.println(id2);
        driver.switchTo().window(id2);
        Thread.sleep(1000);
        WebElement c1 = driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V login']"));
        c1.click();
        Thread.sleep(500);
        WebElement d1 = driver.findElement(By.xpath("//button[@title='Close']"));
        d1.click();
        Thread.sleep(1000);
        driver.switchTo().window(id1);
        b1.click();
        Thread.sleep(500);
        b1.click();
        driver.switchTo().window(id2);
        Thread.sleep(500);
        driver.switchTo().window(id1);
        b1.click();
        Thread.sleep(500);
        b1.click();
        Thread.sleep(500);
        driver.switchTo().window(id2);
        driver.close();


    }


}

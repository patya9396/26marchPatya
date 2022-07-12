package com.popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class CH2 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);
        String id1 = driver.getWindowHandle();
        System.out.println("id in mane page=" + id1);
        driver.findElement(By.name("NewWindow")).click();
        System.out.println("entering into a child browser");
        Thread.sleep(3000);
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> i = ids.iterator();
        String manepageid = i.next();
        String childpageid = i.next();
        driver.switchTo().window(childpageid);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("prathmesh");
        Thread.sleep(1000);
        driver.switchTo().window(manepageid);
        Thread.sleep(1000);
        WebElement a = driver.findElement(By.xpath("(//p[contains(text(),'lick below')])[3]"));
        System.out.println(a.getText());


    }


}

package com.popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Child1 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);
        String id = driver.getWindowHandle();
        System.out.println("main page id =" + id);
        driver.findElement(By.name("NewWindow")).click();
        Set<String> allid = driver.getWindowHandles();
        Iterator<String> al = allid.iterator();
        String mainpageid = al.next();
        String childpageid = al.next();
        driver.switchTo().window(childpageid);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("prathmesh");
        Thread.sleep(1000);
        driver.switchTo().window(mainpageid);
        WebElement a = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
        System.out.println(a.getText());
        a.getSize();


    }


}

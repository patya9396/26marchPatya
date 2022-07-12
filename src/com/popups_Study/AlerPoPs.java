package com.popups_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerPoPs {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        driver.findElement(By.id("alertButton")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        Thread.sleep(5000);
        alt.accept();
        driver.findElement(By.id("promtButton")).click();
        Alert alt1 = driver.switchTo().alert();
        alt1.sendKeys("prathesh");
        Thread.sleep(5000);


    }


}

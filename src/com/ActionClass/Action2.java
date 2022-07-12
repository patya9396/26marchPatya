package com.ActionClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Action2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(5000);
        WebElement singleclick = driver.findElement(By.linkText("Selenium"));
        Actions act = new Actions(driver);
        act.click(singleclick).perform();
        Thread.sleep(1000);
        act.click(singleclick).perform();
        Thread.sleep(1000);
        WebElement rightclic = driver.findElement(By.xpath("//span[text()='right click me']"));
        act.contextClick(rightclic).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        Alert alt = driver.switchTo().alert();
        alt.dismiss();
        Thread.sleep(1000);
        WebElement dubbletab = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(dubbletab).perform();
        Thread.sleep(1000);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();


    }


}

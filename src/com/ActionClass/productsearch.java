package com.ActionClass;

import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.xml.security.stax.ext.XMLSecurityConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class productsearch {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement textbox1 = driver.findElement(By.xpath("//input[@class='_3704LK']"));
        textbox1.sendKeys("iphone10");
        Thread.sleep(10000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        WebElement applainces = driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]"));
        act.moveToElement(applainces).perform();
        for (int i = 0; i <= 4; i++) {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(2000);
        }
        act.doubleClick().perform();


    }


}

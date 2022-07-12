package com.Differentsideautomated;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.redbus.in/");
        Thread.sleep(1000);
        WebElement fromcity = driver.findElement(By.id("src"));
        Actions act = new Actions(driver);
        act.sendKeys(fromcity, "pune").perform();
        for (int i = 1; i <= 4; i++) {
            act.sendKeys(Keys.DOWN).perform();
            Thread.sleep(1000);
        }
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        WebElement tocity = driver.findElement(By.id("dest"));
        act.sendKeys(tocity, "mumbai").perform();
        act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        WebElement calender = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        act.click(calender).perform();
        act.click(calender).perform();


    }
}

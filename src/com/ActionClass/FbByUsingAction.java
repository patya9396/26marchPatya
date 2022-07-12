package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbByUsingAction {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        WebElement text = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        Actions act = new Actions(driver);
        act.click(text).perform();
        Thread.sleep(15000);
        WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        act.click(days).perform();
        for (int i = 12; i >= 2; i--) {
            act.sendKeys(Keys.UP).perform();
            Thread.sleep(1000);
        }
        act.sendKeys(Keys.ENTER).perform();

        Thread.sleep(1000);
        WebElement name = driver.findElement(By.name("firstname"));
        act.sendKeys(name, "p").keyDown(Keys.SHIFT).sendKeys("ra").keyUp(Keys.SHIFT).sendKeys("thmesh").build().perform();

        WebElement lastname = driver.findElement(By.name("lastname"));
        act.keyDown(lastname, Keys.SHIFT).sendKeys("c").keyUp(Keys.SHIFT).sendKeys("ho").keyDown(Keys.SHIFT).sendKeys("ug").keyUp(Keys.SHIFT).sendKeys(Keys.SPACE).sendKeys("ule").build().perform();


    }


}


























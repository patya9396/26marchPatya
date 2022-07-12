package com.ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLIstboxDrpbox {
    public static void main(String args[]) throws InterruptedException {

        {
            System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("");
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
            Thread.sleep(10000);
            WebElement day = driver.findElement(By.name(""));
            Select s = new Select(day);
            s.selectByVisibleText("31");
            WebElement month = driver.findElement(By.name("birthday_month"));
            Select s1 = new Select(month);
            s1.selectByValue("12");
            WebElement year = driver.findElement(By.id("year"));
            Select s3 = new Select(year);
            s3.selectByVisibleText("1955");


        }


    }
}

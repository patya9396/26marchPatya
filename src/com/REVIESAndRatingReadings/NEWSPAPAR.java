package com.REVIESAndRatingReadings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEWSPAPAR {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("");
        Thread.sleep(5000);
        WebElement text = driver.findElement(By.xpath(""));
        System.out.println(text.getText());


    }


}

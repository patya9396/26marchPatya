package com.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedMethod {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        WebElement hide = driver.findElement(By.id("hide-textbox"));
        WebElement show = driver.findElement(By.id("show-textbox"));
        WebElement text = driver.findElement(By.id("displayed-text"));
        hide.click();
        if (text.isDisplayed()) {

            System.out.println("is display");
        } else {
            show.click();
            text.sendKeys("velocity");

            System.out.println("not diplay");
        }
        Thread.sleep(1000);
        hide.click();


    }


}

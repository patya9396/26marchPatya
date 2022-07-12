package com.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(5000);
        WebElement cheakbox3 = driver.findElement(By.name("checkBoxOption3"));
        cheakbox3.click();
        if (cheakbox3.isSelected()) {
            System.out.println("is selected");
        } else {
            System.out.println("else selected");
        }

    }
}

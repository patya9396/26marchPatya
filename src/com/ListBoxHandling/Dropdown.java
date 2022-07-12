package com.ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
        Select s = new Select(dropdown);
        s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByValue("option1");
        Thread.sleep(1000);
        s.selectByVisibleText("Option3");
        System.out.println(s.isMultiple());


    }


}

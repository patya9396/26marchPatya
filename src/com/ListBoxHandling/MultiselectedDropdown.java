package com.ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class MultiselectedDropdown {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement multiselected = driver.findElement(By.name("cars"));
        Select s = new Select(multiselected);
        System.out.println(s.isMultiple());
        s.selectByVisibleText("Volvo");
        Thread.sleep(500);
        s.selectByValue("opel");
        Thread.sleep(500);
        s.selectByIndex(1);
        Thread.sleep(500);
        s.selectByIndex(3);
        Thread.sleep(500);

        //  s.deselectByIndex(1);
        // Thread.sleep(500);
        // s.deselectByValue("opel");
        //  Thread.sleep(500);
        //s.deselectByVisibleText("Volvo");
        //      Thread.sleep(500);
        //    s.deselectByIndex(3);
        //  Thread.sleep(500);
        System.out.println(s.getFirstSelectedOption().getText());
        List<WebElement> alloption = s.getAllSelectedOptions();
        for (WebElement option : alloption) {
            System.out.println(option.getText());
        }
        WebElement cheakbok = driver.findElement(By.id("oldSelectMenu"));
        Select s1 = new Select(cheakbok);
        s1.selectByValue("3");
        Thread.sleep(500);
        s1.selectByIndex(6);
        Thread.sleep(500);
        s1.selectByVisibleText("Magenta");


    }


}

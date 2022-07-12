package com.misslenenisThings;

import com.sun.jdi.connect.Connector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UNORDE2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("actress");
        Thread.sleep(1000);
        List<WebElement> actlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(actlist.size());
        Thread.sleep(1000);
        for (WebElement a : actlist) {
            System.out.println(a.getText());
        }
        for (WebElement m : actlist) {
            String text1 = m.getText();
            String text2 = "Bhagyashree";
            if (text1.equals(text2)) {
                m.click();
                break;
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.linkText("Images")).click();


    }


}

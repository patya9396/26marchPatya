package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FINDIMAGEONPAGE {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("shivaji university");
        Thread.sleep(1000);
        List<WebElement> als = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(als.size());
        for (WebElement r : als) {
            System.out.println(r.getText());
        }


        for (WebElement k : als) {
            String text1 = k.getText();
            String text2 = "shivaji university hall ticket";
            if (text1.equals(text2)) {
                Thread.sleep(1000);
                k.click();
                break;
            }
        }

        Thread.sleep(1000);
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(1000);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("size of images will be=" + images.size());


    }


}

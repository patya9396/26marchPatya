package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UnOrdr1 {

    public static <webelement> void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(1000);
        List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(result.size());

        for (WebElement r : result) {
            System.out.println(r.getText());
        }
        for (WebElement r1 : result) {
            String text1 = r1.getText();
            String text2 = "honda shine";
            if (text1.equals(text2)) {
                r1.click();
                break;
            }


            driver.findElement(By.linkText("Images")).click();


        }

    }


}

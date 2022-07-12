package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogeldynamicLIst {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(2000);
        List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(element.size());

        for (WebElement searchresult : element) {
            System.out.println(searchresult.getText());
        }

        for (WebElement r : element) {
            String f1 = r.getText();
            String f2 = "honda civic";

            if (f1.equals(f2)) {
                r.click();
                break;
            }


        }
        Thread.sleep(1000);
        driver.findElement(By.linkText("Images")).click();


    }


}

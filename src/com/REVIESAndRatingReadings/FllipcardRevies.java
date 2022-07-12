package com.REVIESAndRatingReadings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FllipcardRevies {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("redmi 10");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(9000);
        WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
        System.out.println("revies of redmi 10=" + review.getText());

        WebElement price = driver.findElement(By.xpath("((//div[@class='col col-5-12 nlI3QM'])[1]//div)[3]"));
        System.out.println("price of redmi note 10=" + price.getText());

        System.out.println("===========details of redmi 10s============");
        WebElement reviesreting = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[7]//span)[2]"));
        System.out.println("revies and reting of 10s=" + reviesreting.getText());
        System.out.println("====================================================================");
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        Thread.sleep(1000);
        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);
        Iterator<String> idseparate = ids.iterator();
        String id1 = idseparate.next();
        String id2 = idseparate.next();
        System.out.println("id of 1 page=" + id1);
        System.out.println("id of second page=" + id2);
        driver.switchTo().window(id2);
        Thread.sleep(1000);
        WebElement cheakbok1 = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]"));
        cheakbok1.click();
        Thread.sleep(1000);
        cheakbok1.click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("no. of links=" + links.size());
        Iterator<WebElement> alllink = links.iterator();
        while (alllink.hasNext()) {
            System.out.println(alllink.next().getText() + " ");

        }
        driver.switchTo().window(id1);


    }


}

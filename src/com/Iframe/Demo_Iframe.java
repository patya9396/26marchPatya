package com.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Iframe {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Thread.sleep(1000);
        driver.get("https://ui.vision/demo/webtest/frames/");
        Thread.sleep(1000);
        System.out.println("go to the frame 3");
        // swicch tothe main frame to frame2 by using weblement
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.findElement(By.name("mytext3")).sendKeys("prathmesh");
        Thread.sleep(1000);
        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println(text);
        // switch from frame 2 to main page
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        System.out.println("-------------------------------------------------------------------------");
        // changing selenium path from main page to nested iframe
        System.out.println("i am in a nested frame");
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='350']")));
        String text1 = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
        System.out.println(text1);
        System.out.println("------------------------------------------------------------------------------------");
        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        driver.findElement(By.name("mytext4")).sendKeys("manual testing");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.name("mytext2")).sendKeys("automation testing");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("velocity");
        System.out.println("======================================================================");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='350']")));
        String text2 = driver.findElement(By.xpath("(//span[@class='G4EHhc'])[1]")).getText();
        System.out.println(text2);
        String text3 = driver.findElement(By.xpath("//div[@class='cBGGJ']")).getText();
        System.out.println(text3);
        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[3]")).click();


    }
}
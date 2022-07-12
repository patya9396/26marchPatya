package com.popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TabUtomated {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);
        String id1 = driver.getWindowHandle();//
        System.out.println(id1);
        driver.findElement(By.name("NewTab")).click();
        System.out.println("entering into a new tab");
        Thread.sleep(5000);
        Set<String> id = driver.getWindowHandles();
        Iterator<String> all = id.iterator();
        String idofmainpage = all.next();
        String idofnewtab = all.next();
        driver.switchTo().window(idofnewtab);
        WebElement a = driver.findElement(By.xpath("//h4[contains(text(),'ools and best p')]"));
        System.out.println(a.getText());
        driver.findElement(By.xpath("(//span[text()='About me'])[4]")).click();
        System.out.println("switing into third tab");
        Thread.sleep(2000);
        Set<String> allid = driver.getWindowHandles();
        Iterator<String> i1 = allid.iterator();
        // while (i1.hasNext()){
        //      System.out.println(i1.next());
        // }
        String idfrist = i1.next();
        String idsec = i1.next();
        String idthird = i1.next();
        driver.switchTo().window(idthird);
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("prathmesh");
        Thread.sleep(5000);
        System.out.println("switing into main page");
        driver.switchTo().window(idsec);
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(idthird);
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(idfrist);
        Thread.sleep(1000);
        WebElement t = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
        System.out.println(t.getText());
        ArrayList ids = new ArrayList(allid);
        System.out.println(ids.get(0));
        System.out.println(ids.get(1));
        System.out.println(ids.get(2));


    }


}

package com.popups_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChileBrowerStudy {


    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
        String idmanepage = driver.getWindowHandle(); //to finding the id of main page
        System.out.println(idmanepage);
        System.out.println("to opean a child brower");
        driver.findElement(By.name("NewWindow")).click();

        Thread.sleep(3000);
        Set<String> allid = driver.getWindowHandles();
        Iterator<String> al = allid.iterator();
        // while (al.hasNext()){
        //   System.out.println(al.next());
        // }
        String mainpageid = al.next();
        String childpageid = al.next();
        driver.switchTo().window(childpageid);
        Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement a = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        a.sendKeys("mahesh");
        driver.switchTo().window(mainpageid);
        Thread.sleep(1000);
        WebElement b = driver.findElement(By.xpath("(//p[contains(text(),'ick below to')])[2]"));
        System.out.println(b.getText());


    }


}

package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Table3 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        Thread.sleep(1000);
        List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]//tr"));
        int nooftherows = rows.size();
        System.out.println(nooftherows);
        //for getting the text on the rows we have use following process
        Iterator<WebElement> r = rows.iterator();
        while (r.hasNext()) {
            System.out.println(r.next().getText() + "  ");
        }
        System.out.println("==============================getting coloum texy==================================================");
        List<WebElement> coloum = driver.findElements(By.xpath("((//table)[2]//tr)[1]//th"));
        int sizeofcoloum = coloum.size();
        System.out.println("Ssize of coloum is" + sizeofcoloum);
        Iterator<WebElement> m = coloum.iterator();
        while (m.hasNext()) {
            System.out.println(m.next().getText() + "  ");
        }


    }


}

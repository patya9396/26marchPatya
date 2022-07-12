package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class TABLEEXAMPLE2 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        Thread.sleep(1000);
        List<WebElement> rows = driver.findElements(By.xpath("(//table)[1]//tr"));
        int noofrows = rows.size();
        System.out.println("no of rows in table=" + noofrows);
        Iterator<WebElement> alltext = rows.iterator();
        while (alltext.hasNext()) {
            System.out.println(alltext.next().getText() + "  ");
        }
        System.out.println("===============================================================================");
        //getting the coloum in a table
        List<WebElement> coloum = driver.findElements(By.xpath("((//table)[1]//tr)[1]//th"));
        int noofcoloums = coloum.size();
        System.out.println(noofcoloums);
        Iterator<WebElement> allcoloums = coloum.iterator();
        while (allcoloums.hasNext()) {
            System.out.print(allcoloums.next().getText() + "  ");
        }


    }


}

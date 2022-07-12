package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class TableFindout {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        int totalnoofrows = rows.size();
        System.out.println("total no of rows=" + totalnoofrows);

        //how to findout no. coloum into a tablr
        List<WebElement> noofcoloum = driver.findElements(By.xpath("(//table//tr)[1]//th"));
        int totalnoofcolum = noofcoloum.size();
        System.out.println("total no of colum is=" + totalnoofcolum);
        Iterator<WebElement> t = noofcoloum.iterator();
        while (t.hasNext()) {
            System.out.print(t.next().getText() + "  ");
        }

        Iterator<WebElement> m = rows.iterator();
        while (m.hasNext()) {
            System.out.println(m.next().getText() + "  ");
        }


    }


}

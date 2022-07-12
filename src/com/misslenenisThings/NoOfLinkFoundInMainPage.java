package com.misslenenisThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class NoOfLinkFoundInMainPage {

    public static <webelement> void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.redbus.in/");
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        // for(WebElement a:links){
        //    System.out.println(a.getText());

        //  }
        Iterator<WebElement> text = links.iterator();
        while (text.hasNext()) {
            System.out.println(text.next().getText());
        }


    }


}

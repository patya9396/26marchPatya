package com.managethesizeofbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        System.out.println(driver.manage().window().getSize());
        // to getting size we need to create a object of diamension class
        Dimension d = new Dimension(10000, 10000);
        //using getsize ethod we sent the size
        driver.manage().window().setSize(d);


    }


}

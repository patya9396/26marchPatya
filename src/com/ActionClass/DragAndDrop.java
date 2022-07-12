package com.ActionClass;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);
        WebElement price = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement amount = driver.findElement(By.xpath("(//div[@class='shoppingCart'])[2]"));
        Actions act = new Actions(driver);
        act.dragAndDrop(price, amount).perform();


    }


}

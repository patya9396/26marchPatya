package com.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        Thread.sleep(1000);
        driver.navigate().refresh();
        //1 way to store text for further use
        String text = driver.findElement(By.xpath("//p[contains(text(),'NCE MYNTR')]")).getText();
        System.out.println(text);
        // 2 way to store text in further use
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'NCE MYNTR')]"));
        System.out.println(element.getText());

    }


}

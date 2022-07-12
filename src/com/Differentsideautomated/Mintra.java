package com.Differentsideautomated;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mintra {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwinmeXguPL3AhVJdmAKHaaRCH0YABACGgJ0bQ&ae=2&ohost=www.google.com&cid=CAESbeD2xL68dxzN4EkQ_ZnmEE-jfjMwGqJ7IEkTsW0T0dGB7B9pm9qb8gvN-zXPvMROkyzipJFKmjiaUTpVFHxtFdGnrSfm7rgZTwRikVANqtDkaJ0LmTdz6kqXd_sOdWdV7DMiqr-wkwzaWlPXPbI&sig=AOD64_2COus9KG83xA_6TML9gIGGfCBNxw&q&adurl&ved=2ahUKEwifzd3guPL3AhWRCt4KHUNQAWQQ0Qx6BAgCEAE");
        driver.get("https://www.myntra.com/eyewear?rf=Discount%20Range%3A80.0_100.0_80.0%20TO%20100.0");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        // driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]"));
        Actions act = new Actions(driver);
        for (int i = 1; i <= 15; i++) {
            String path = ("(//div[@class='common-checkboxIndicator'])[1]");
            WebElement c1 = driver.findElement(By.xpath(path));
            c1.click();
            act.sendKeys(path, Keys.DELETE).perform();
            Thread.sleep(500);


        }


    }


}

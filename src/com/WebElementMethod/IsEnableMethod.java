package com.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.discoveryplus.in/");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        Thread.sleep(1000);
        WebElement getotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
        System.out.println(getotp.isEnabled());
        driver.findElement(By.id("mobileNumber")).sendKeys("7020376495");
        Thread.sleep(5000);
        System.out.println(getotp.isEnabled());

        getotp.click();

    }


}

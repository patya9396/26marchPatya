package com.locaters_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FccebookLoginPage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiG8vijuej3AhXwgVAGHTIlCYIYABAAGgJkZw&ae=2&ei=ppWEYv73GLWJ5OUPlpSf2A4&ohost=www.google.com&cid=CAESbeD2RQI_majdFthog44X0NeasVbU3EJp7C_9i_LEEbltpNFByv57T3YjebcXHCl325sO_Pb38sRjgYtIylEzPXh1mfeGuZmhfyz3wWTZX-Ll2poIq59yI8oVoaP09X3218ktQcjTNgUOi87qzps&sig=AOD64_3mUIcrV2oHV9ylsirQo6sMiUVG8Q&q&sqi=2&adurl&ved=2ahUKEwj-4umjuej3AhW1BLkGHRbKB-sQ0Qx6BAgCEAE");
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prathmesh");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chougule");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pchougule033@gmail.com");
        Thread.sleep(500);
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.manage().window().minimize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}

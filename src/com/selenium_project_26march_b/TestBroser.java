package com.selenium_project_26march_b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBroser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("http://www.redbus.in/");
        d.findElements(By.name("Please enter a source city"));

        d.get("<input type=\"text\" id=\"src\" class=\"db\" data-message=\"Please enter a source city\" tabindex=\"1\" autocomplete=\"off\" onclick=\"selectText('src')\">");


    }
}

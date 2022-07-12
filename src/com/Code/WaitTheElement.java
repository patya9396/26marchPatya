package com.Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTheElement {


    public static void Explicit(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));


    }


}

package BroweserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TittleAndUrl {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://paytm.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(500);
        driver.navigate().to("https://nextstep.tcs.com/");
        driver.navigate().refresh();
        Thread.sleep(300);
        driver.navigate().back();
        Thread.sleep(200);
        driver.navigate().forward();
        Thread.sleep(200);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }


}

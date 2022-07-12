package BroweserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class nevigateAndRefreshMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.redbus.in/");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();

        driver.navigate().to("https://www.flipkart.com/");// this method are used to nevigate for differnt side
        //but in same tab.

        driver.navigate().back();// this method will be give a back from current side.insame tab
        driver.navigate().forward();//this method will be give a forward from current side.in same tab

        driver.navigate().refresh();// this method will be refresh the page
        System.out.println(driver.getTitle()); // this method will be give a current side page tittle

        System.out.println(driver.getCurrentUrl());// this method will be give a current side url.


    }
}

package BroweserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.redbus.in/");// get method is used to lounch
        // driver.close();// close method are used to close the current tab
        // driver.quit();// quite method are used to close all tab
        driver.manage().window().maximize(); //this method are used when we maximize the window
        driver.manage().window().minimize();//this method are used when we minimazi the window


    }
}

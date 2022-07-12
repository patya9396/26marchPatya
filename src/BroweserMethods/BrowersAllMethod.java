package BroweserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowersAllMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.goindigo.in/");
        driver.navigate().refresh();
        System.out.println("the title is=" + driver.getTitle());
        System.out.println("the url is=" + driver.getCurrentUrl());
        Thread.sleep(500);
        driver.navigate().to("http://www.dream11.com/");
        System.out.println("the title of dream 11 is=" + driver.getTitle());
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();
        driver.manage().window().minimize();


    }
}

package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Text2 {

    @BeforeMethod
    public void velocitylogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");

    }


    @Test
    public void zeroth() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Reporter.log("this is zerotha login", true);

        WebElement username = driver.findElement(By.id("userid"));
        username.sendKeys("ELR321");

        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }


}

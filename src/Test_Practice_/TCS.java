package Test_Practice_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCS {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://nextstep.tcs.com/campus/#/");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//button[@class='registerHere greenButton']")).click();
        Thread.sleep(15000);
        driver.findElement(By.id("btnSlctIT")).click();
        Thread.sleep(25000);
        driver.findElement(By.id("txtTitle")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Mr.']")).click();
        driver.findElement(By.id("short_txtFirstName")).sendKeys("mahesh");
        String tcs = driver.findElement(By.xpath("(//div[@class='col-md-12 lbl-txtReg'])[1]")).getText();
        System.out.println("frist text is=" + tcs);
        driver.findElement(By.id("short_txtMiddleName")).sendKeys("kedar");
        driver.findElement(By.id("short_txtLastName")).sendKeys("awale");
        driver.findElement(By.xpath("//span[text()='Day']")).click();
        driver.findElement(By.xpath("//div[text()='20']")).click();
        driver.findElement(By.xpath("//span[text()='Month']")).click();
        driver.findElement(By.xpath("//div[text()='September']")).click();
        driver.findElement(By.xpath("//span[text()='Year']")).click();
        driver.findElement(By.xpath("//div[text()='1966']")).click();
        driver.findElement(By.xpath("(//span[text()='Select'])[1]")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        WebElement su = driver.findElement(By.id("btnRegSubmit"));
        System.out.println(su.isEnabled());
        System.out.println(su.isDisplayed());
        System.out.println(su.isSelected());


    }


}

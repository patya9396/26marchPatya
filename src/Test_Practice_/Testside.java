package Test_Practice_;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Testside {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\BusinessComputers.in\\IdeaProjects\\SeleniumProject\\shreenshot\\screenshot 5.png");
        FileHandler.copy(source, destination);
        Thread.sleep(5000);
        driver.get("http://www.unipune.ac.in/");
        FileHandler.copy(source, destination);


    }


}

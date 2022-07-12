package Test_Practice_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class IPLtableReadings {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.iplt20.com/points-table/men/2022");
        Thread.sleep(5000);
        driver.findElement(By.linkText("MEN")).click();
        Thread.sleep(1000);
        List<WebElement> noofrows = driver.findElements(By.xpath("(//table)[1]//tr"));
        System.out.println(noofrows.size());
        Iterator<WebElement> text = noofrows.iterator();
        while (text.hasNext()) {
            System.out.println(text.next().getText());
        }
        //finding no of coloum
        List<WebElement> coloums = driver.findElements(By.xpath("((//table)[1]//tr)[1]//th"));
        System.out.println(coloums.size());
        Iterator<WebElement> text2 = coloums.iterator();
        while (text2.hasNext()) {
            System.out.print(text2.next().getText());
        }


    }


}

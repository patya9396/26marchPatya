package Test_Practice_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Google {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("wedding");
        Thread.sleep(1000);
        List<WebElement> listofelement = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(listofelement.size());
        Iterator<WebElement> alltextgetting = listofelement.iterator();
        while (alltextgetting.hasNext()) {
            System.out.println(alltextgetting.next().getText());
        }

        for (WebElement m : listofelement) {
            String text1 = m.getText();
            String text2 = "wedding wishes";
            if (text1.equals(text2)) {
                m.click();
                break;
            }


        }

        String idmanepage = driver.getWindowHandle();
        System.out.println(idmanepage);
        driver.navigate().back();
        System.out.println("==============================================================");
        driver.findElement(By.name("q")).sendKeys("whatapp");
        Thread.sleep(1000);
        List<WebElement> allpages = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(allpages.size());
        Iterator<WebElement> textall = allpages.iterator();
        while (textall.hasNext()) {
            System.out.println(textall.next().getText());
            for (WebElement o : allpages) {
                String text1 = o.getText();
                String text2 = "whatsapp web";
                if (text1.equals(text2)) {
                    o.click();
                    break;
                }


            }


        }


    }


}
